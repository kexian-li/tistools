/**
 * Created by gaojie on 2017/8/2.
 */
angular.module('MetronicApp').controller('busiorg_controller', function ($rootScope, $scope, busiorg_service, $http, $timeout, i18nService, filterFilter, uiGridConstants, $uibModal, $state) {
    $scope.$on('$viewContentLoaded', function () {
        // initialize core components
        App.initAjax();
    });
    /**-----------------------------------各类变量定义-------------------------------- */
        //主题信息
    var busiorg = {};
    $scope.busiorg = busiorg;
    //节点导航信息
    var currNode = "";
    $scope.currNode = currNode;
    //存放节点对象
    var item = {};
    $scope.busiorg.item = item;
    //页签控制对象
    var flag = {};
    $scope.flag = flag;
    //机构套别
    var jgtb = true;
    $scope.flag.jgtb = jgtb;
    //页签页面
    var page = false;
    $scope.flag.page = page;
    //业务机构详情
    var ywjgxq = false;
    $scope.flag.ywjgxq = ywjgxq;
    /**-----------------------------------右键自定义菜单-------------------------------- */
        //树自定义右键功能
    var items = function customMenu(node) {
            if (node.parent == "#") {
                var it = {
                    "刷新菜单": {
                        "id": "refresh",
                        "label": "刷新",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            $("#busiorgtree").jstree().refresh();
                        }
                    }
                }
            } else if (node.id.length == 3) {
                var it = {
                    "新增子机构": {
                        "id": "creat",
                        "label": "新增业务机构",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            //生成代码
                            var subFrom = {};
                            subFrom.nodeType = "reality";
                            subFrom.busiDomain = obj.id;
                            var busiorgCode = "";
                            busiorg_service.initcode(subFrom).then(function (data) {
                                console.log(data)
                                if(data.status == "success"){
                                    busiorgCode = data.retMessage;
                                    openwindow($uibModal, 'views/busiorg/addBusiorg_window.html', 'lg',
                                        function ($scope, $modalInstance) {
                                            $scope.subFrom = subFrom;
                                            subFrom.busiorgCode = busiorgCode;
                                            //增加方法
                                            $scope.add = function (subFrom) {
                                                //TODO.新增逻辑
                                                busiorg_service.addbusiorg(subFrom).then(function (data) {
                                                    if(data.status == "success"){
                                                        toastr['success'](data.retMessage);
                                                    }else{
                                                        toastr['error'](data.retMessage);
                                                    }
                                                    $("#busiorgtree").jstree().refresh();
                                                    $scope.cancel();
                                                });
                                            }
                                            $scope.cancel = function () {
                                                $modalInstance.dismiss('cancel');
                                            };
                                        }
                                    )
                                }else{
                                    toastr['error'](data.retMessage);
                                    return false;
                                }

                            })

                        }
                    },
                    "新增子虚拟机构": {
                        "id": "creat2",
                        "label": "新增虚拟业务机构",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            //生成代码
                            var subFrom = {};
                            subFrom.nodeType = "dummy";
                            subFrom.busiDomain = obj.id;
                            var busiorgCode = "";
                            busiorg_service.initcode(subFrom).then(function (data) {
                                console.log(data)
                                if(data.status == "success"){
                                    busiorgCode = data.retMessage;
                                    openwindow($uibModal, 'views/busiorg/addBusiorg_window.html', 'lg',
                                        function ($scope, $modalInstance) {
                                            $scope.subFrom = subFrom;
                                            subFrom.busiorgCode = busiorgCode;
                                            //增加方法
                                            $scope.add = function (subFrom) {
                                                busiorg_service.addbusiorg(subFrom).then(function (data) {
                                                    console.log(data)
                                                    if(data.status == "success"){
                                                        toastr['success'](data.retMessage);
                                                    }else{
                                                        toastr['error'](data.retMessage);
                                                    }
                                                    $("#busiorgtree").jstree().refresh();
                                                    $scope.cancel();
                                                });
                                            }
                                            $scope.cancel = function () {
                                                $modalInstance.dismiss('cancel');
                                            };
                                        }
                                    )
                                }else{
                                    toastr['error'](data.retMessage);
                                    return false;
                                }

                            })
                        }
                    },
                    "刷新菜单": {
                        "id": "refresh",
                        "label": "刷新",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            $("#busiorgtree").jstree().refresh();
                        }
                    }
                };
            }else {
                var it = {
                    "新增子机构": {
                        "id": "creat",
                        "label": "新增子业务机构",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            //生成代码
                            var subFrom = {};
                            subFrom.nodeType = "reality";
                            subFrom.busiDomain = obj.original.busiDomain;
                            subFrom.parentsBusiorgCode = obj.original.busiorgCode;
                            var busiorgCode = "";
                            busiorg_service.initcode(subFrom).then(function (data) {
                                console.log(data)
                                if (data.status == "success") {
                                    busiorgCode = data.retMessage;
                                    openwindow($uibModal, 'views/busiorg/addBusiorg_window.html', 'lg',
                                        function ($scope, $modalInstance) {
                                            $scope.subFrom = subFrom;
                                            subFrom.busiorgCode = busiorgCode;
                                            //增加方法
                                            $scope.add = function (subFrom) {
                                                //TODO.新增逻辑
                                                busiorg_service.addbusiorg(subFrom).then(function (data) {
                                                    if (data.status == "success") {
                                                        toastr['success'](data.retMessage);
                                                    } else {
                                                        toastr['error'](data.retMessage);
                                                    }
                                                    $("#busiorgtree").jstree().refresh();
                                                    $scope.cancel();
                                                });
                                            }
                                            $scope.cancel = function () {
                                                $modalInstance.dismiss('cancel');
                                            };
                                        }
                                    )
                                } else {
                                    toastr['error'](data.retMessage);
                                    return false;
                                }

                            })

                        }
                    },
                    "新增子虚拟机构": {
                        "id": "creat2",
                        "label": "新增子虚拟业务机构",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            //生成代码
                            var subFrom = {};
                            subFrom.nodeType = "dummy";
                            subFrom.busiDomain = obj.id;
                            var busiorgCode = "";
                            busiorg_service.initcode(subFrom).then(function (data) {
                                console.log(data)
                                if (data.status == "success") {
                                    busiorgCode = data.retMessage;
                                    openwindow($uibModal, 'views/busiorg/addBusiorg_window.html', 'lg',
                                        function ($scope, $modalInstance) {
                                            $scope.subFrom = subFrom;
                                            subFrom.busiorgCode = busiorgCode;
                                            //增加方法
                                            $scope.add = function (subFrom) {
                                                busiorg_service.addbusiorg(subFrom).then(function (data) {
                                                    console.log(data)
                                                    if (data.status == "success") {
                                                        toastr['success'](data.retMessage);
                                                    } else {
                                                        toastr['error'](data.retMessage);
                                                    }
                                                    $("#busiorgtree").jstree().refresh();
                                                    $scope.cancel();
                                                });
                                            }
                                            $scope.cancel = function () {
                                                $modalInstance.dismiss('cancel');
                                            };
                                        }
                                    )
                                } else {
                                    toastr['error'](data.retMessage);
                                    return false;
                                }

                            })
                        }
                    },
                    "删除业务机构": {
                        "id": "delete",
                        "label": "删除业务机构",
                        "action": function (data) {
                            var inst = jQuery.jstree.reference(data.reference),
                                obj = inst.get_node(data.reference);
                            console.log(obj)
                            if(confirm("确定要删除此机构嘛？删除后不可恢复。")){
                                var subFrom = {};
                                subFrom.busiorgCode = obj.original.busiorgCode;
                                console.log(obj.original.busiorgCode);
                                busiorg_service.deletebusiorg(subFrom).then(function (data) {
                                    if (data.status == "success") {
                                        toastr['success'](data.retMessage);
                                        $("#busiorgtree").jstree().refresh();
                                    } else {
                                        toastr['error'](data.retMessage);
                                    }
                                });
                            }
                        }
                    }
                }
            }
            return it;
        }


    /**-----------------------------------业务机构树-------------------------------- */
    //业务机构树
    $("#busiorgtree").jstree({
        "core": {
            "themes": {
                "responsive": false
            },
            "check_callback": true,
            'data': function (obj, callback) {
                var jsonarray = [];
                $scope.jsonarray = jsonarray;
                var subFrom = {};
                subFrom.id = obj.id;
                console.log(obj)


                busiorg_service.loadmaintree(subFrom).then(function (datas) {
                    console.log(datas)
                    var data = datas.retMessage;
                    console.log(data);
                    if(!isNull(data)){
                        if(isNull(data[0].id)){
                            if(!isNull(data[0].itemName)){
                                for (var i = 0; i < data.length; i++) {
                                    data[i].id = data[i].sendValue;
                                    data[i].text = data[i].itemName;
                                    data[i].children = true;
                                    data[i].icon = 'fa fa-users icon-state-info icon-lg'
                                }
                            }else if(!isNull(data[0].busiorgCode)){
                                for (var i = 0; i < data.length; i++) {
                                    data[i].id = data[i].busiorgCode;
                                    data[i].text = data[i].busiorgName;
                                    data[i].children = true;
                                    data[i].icon = 'fa fa-users icon-state-info icon-lg'
                                }
                            }
                        } else{
                            for (var i = 0; i < data.length; i++) {
                                data[i].children = true;
                                data[i].icon = 'fa fa-users icon-state-info icon-lg'
                            }
                        }
                    }


                    $scope.jsonarray = angular.copy(data);
                    callback.call(this, $scope.jsonarray);
                })
            }
        },
        "types": {
            "default": {
                "icon": "fa fa-folder icon-state-warning icon-lg"
            },
            "file": {
                "icon": "fa fa-file icon-state-warning icon-lg"
            }
        },
        "state": {"key": "demo3"},
        "contextmenu": {'items': items},
        'dnd': {
            'dnd_start': function () {
                console.log("start");
            },
            'is_draggable': function (node) {
                //用于控制节点是否可以拖拽.
                console.log(node)
                return true;
            }
        },
        'search': {
            show_only_matches: true
        },
        'callback': {
            move_node: function (node) {
                console.log(node)
            }
        },
        "plugins": ["dnd", "state", "types", "search", "contextmenu"]
    }).bind("select_node.jstree", function (e, data) {
        if (typeof data.node !== 'undefined') {//拿到结点详情
            // console.log(data.node.original.id.indexOf("@"));
            $scope.busiorg.item = {};
            console.log(data.node);
            $scope.currNode = data.node.text;
            if (data.node.id == "00000") {
                for (var i in $scope.flag) {
                    flag[i] = false;
                }
                $scope.flag.jgtb = true;
                rebusiorgGrid();
            } else if (data.node.id.length == 3) {
                for (var i in $scope.flag) {
                    flag[i] = false;
                }
                $scope.flag.page = true;
                $scope.flag.xqxx = true;
                $scope.busiorg.item = data.node.original;
            }else{
                for (var i in $scope.flag) {
                    flag[i] = false;
                }
                $scope.flag.ywjgxq = true;
                $scope.busiorg.item = data.node.original;
            }
            ($scope.$$phase) ? null : $scope.$apply();
        }
    });
    /**-----------------------------------生成各类列表-------------------------------- */
    //设置列表语言
    i18nService.setCurrentLang("zh-cn");
    //业务套别列表
    var busiorgGrid = {};
    $scope.busiorgGrid = busiorgGrid;
    //表头
    var com = [{field: 'itemName', displayName: '业务机构套别名称', enableHiding: false},
        {field: 'itemValue', displayName: '字典项', enableHiding: false}]
    $scope.busiorgGrid = initgrid($scope, busiorgGrid, filterFilter, com, false, function () {
    });
    //下级业务机构列表
    var loworgGrid = {};
    $scope.loworgGrid = loworgGrid;
    com = [{ field: 'nodeType', displayName: '节点类型', enableHiding: false},
        { field: 'busiorgode', displayName: '业务机构代码', enableHiding: false},
        { field: 'busiDomain', displayName: '业务线条', enableHiding: false},
        { field: 'busiorgName', displayName: '业务机构名称', enableHiding: false},
        { field: 'guidOrg', displayName: '对应实体机构', enableHiding: false},
        { field: 'guidPosition', displayName: '主管岗位', enableHiding: false},
        { field: 'orgCode', displayName: '机构代号', enableHiding: false}
    ]
    $scope.loworgGrid = initgrid($scope, loworgGrid, filterFilter, com, false, function () {
    });

    /**-----------------------------------各类列表数据拉取方法-------------------------------- */
        //业务套别列表拉取方法
    var rebusiorgGrid = function () {
            busiorg_service.loadywtb().then(function (data) {
                console.log(data.retMessage);
                if (data.status == "success") {
                    $scope.busiorgGrid.data = data.retMessage;
                    $scope.busiorgGrid.mydefalutData = data.retMessage;
                    $scope.busiorgGrid.getPage(1, $scope.busiorgGrid.paginationPageSize);
                } else {

                }
            })
        }
    //下级业务机构列表拉取
    var reloworgGrid = function () {
        var subFrom = {};
        console.log($scope.busiorg.item)
        subFrom.busiDomain = $scope.busiorg.item.sendValue;
        busiorg_service.loadbusiorgbyType(subFrom).then(function (data) {
            console.log(data.retMessage);
            if (data.status == "success") {
                $scope.loworgGrid.data = data.retMessage;
                $scope.loworgGrid.mydefalutData = data.retMessage;
                $scope.loworgGrid.getPage(1, $scope.busiorgGrid.paginationPageSize);
            } else {

            }
        })
    }

    /**-----------------------------------各类按钮事件定义-------------------------------- */
    //业务机构详情下按钮
    //修改控制标识
    var editflag = false;
    $scope.editflag = editflag;
    //修改业务机构
    busiorg.editjg = function () {
        var subFrom = {};
        $scope.subFrom = subFrom;
        $scope.subFrom = angular.copy($scope.busiorg.item);
        $scope.editflag = !$scope.editflag
    }
    //删除
    busiorg.deletejg = function () {
        
    }
    //保存
    busiorg.save = function () {
        
    }
    //返回
    busiorg.back = function () {
        $scope.editflag = !$scope.editflag
    }

    /**-----------------------------------页签控制-------------------------------- */
    busiorg.loaddata = function (num) {
        if(num == 0){
            //控制页签
            for (var i in $scope.flag) {
                flag[i] = false;
            }
            $scope.flag.page = true;
            $scope.flag.xjjg = true;
            //拉取下级业务机构列表
            reloworgGrid();
        }else if(num == 1) {
            for (var i in $scope.flag) {
                flag[i] = false;
            }
            $scope.flag.page = true;
            $scope.flag.xqxx = true;
        }
    }
});