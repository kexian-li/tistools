/**
 * 高亮字符
 * @author:jiangwq
 * @time:2017-07-13
 * @params: val:整体字符串 type:string
 *           highlightVal:高亮字符串 type:string
 *           color: 高亮颜色 type:string
 */
MetronicApp.filter('highlightTrust2Html', ['$sce', function ($sce) {
    return function (val, highlightVal, color) {
        if (_.isEmpty(highlightVal)) {
            return val;
        }
        val = val.replace(highlightVal, "<span style='color : " + color + "'>" + highlightVal + "</span>");
        return $sce.trustAsHtml(val);
    };
}])
    .filter('translateConstants', ['$http', '$rootScope', function ($http, $rootScope) {
        return function (val, name) {
            var subFrom = {};
            subFrom.dictKey = name;
            // console.info($rootScope.constant)
            if (isNull($rootScope.constant[name + "-" + val])) {
                $http.post("http://localhost:8089/tis/DictController/queryDictItemListByDictKey", subFrom).then(function (data) {
                    var retval = "";
                    if (data.data.status == "success") {
                        for (var i = 0; i < data.data.retMessage.length; i++) {
                            if (val == data.data.retMessage[i].sendValue) {
                                // console.log(data.data.retMessage)
                                retval = data.data.retMessage[i].itemName;
                                // console.log(retval)
                                $rootScope.constant[name + "-" + val] = retval;
                            }
                        }
                    }

                })
            }
            return '';
        };
    }])
    .filter('translatePosition', ['$http', '$rootScope', function ($http, $rootScope) {
        return function (val, name) {
            // console.info($rootScope.constant)
            if (isNull($rootScope.constant[val])) {
                $http.post("http://localhost:8089/tis/om/org/queryAllposition").then(function (data) {
                    var retval = "";
                    // console.log(data)
                    if (data.data.status == "success") {
                        for (var i = 0; i < data.data.retMessage.length; i++) {
                            if (val == data.data.retMessage[i].guid) {
                                // console.log(data.data.retMessage)
                                retval = data.data.retMessage[i].positionName;
                                // console.log(retval)
                                $rootScope.constant[val] = retval;
                            }
                        }
                    }

                })
            }
            return '';
        };
    }])
    .filter('translateEmp', ['$http', '$rootScope', function ($http, $rootScope) {
        return function (val, name) {
            var subFrom = {};
            subFrom.dictKey = name;
            console.info(name + "-" + val)
            // console.info($rootScope.constant)
            if (isNull($rootScope.constant[val])) {
                $http.post("http://localhost:8089/tis/om/emp/queryemployee").then(function (data) {
                    var retval = "";
                    // console.log(data)
                    if (data.data.status == "success") {
                        for (var i = 0; i < data.data.retMessage.length; i++) {
                            if (val == data.data.retMessage[i].guid) {
                                // console.log(data.data.retMessage)
                                retval = data.data.retMessage[i].empName;
                                // console.log(retval)
                                $rootScope.constant[val] = retval;
                            }
                        }
                    }

                })
            }
            return '';
        };
    }])
;