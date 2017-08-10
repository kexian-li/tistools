
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmGroupApp;

 
/**
 * <pre>
 * 工作组应用列表(OM_GROUP_APP)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IOmGroupAppRService {
	
	/**
	 * 新增工作组应用列表(OM_GROUP_APP)
	 * @param t 新记录
	 */
	public void insert(OmGroupApp t);

	/**
	 * 更新工作组应用列表(OM_GROUP_APP),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(OmGroupApp t);

	/**
	 * 强制更新工作组应用列表(OM_GROUP_APP)
	 * @param t 新值
	 */
	public void updateForce(OmGroupApp t);

	/**
	 * 删除工作组应用列表(OM_GROUP_APP)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除工作组应用列表(OM_GROUP_APP)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新工作组应用列表(OM_GROUP_APP)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, OmGroupApp t);

	/**
	 * 根据条件查询工作组应用列表(OM_GROUP_APP)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<OmGroupApp> query(WhereCondition wc);

	/**
	 * 根据条件统计工作组应用列表(OM_GROUP_APP)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询工作组应用列表(OM_GROUP_APP)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public OmGroupApp loadByGuid(String guid);
}
