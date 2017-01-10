
/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.TbJnlPrefilled;

 
/**
 * <pre>
 * auto generated by mvn bronsp:gen-dao , don't change</br>
 * 预填流水(tb_jnl_prefilled)的基础远程服务接口定义
 * 模型：预填流水 tb_jnl_prefilled
 * 描述：预填流水表
 * 业务域：jnl
 * 定义文件：/Users/megapro/Develop/tis/tools/tools-core/model/model-jnl.xml
 * </pre>
 */
public interface ITbJnlPrefilledRService {
	
	/**
	 * 新增预填流水(tb_jnl_prefilled)
	 * @param t 新记录
	 */
	public void insert(TbJnlPrefilled t);

	/**
	 * 更新预填流水(tb_jnl_prefilled),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(TbJnlPrefilled t);

	/**
	 * 强制更新预填流水(tb_jnl_prefilled)
	 * @param t 新值
	 */
	public void updateForce(TbJnlPrefilled t);

	/**
	 * 删除预填流水(tb_jnl_prefilled)
	 * @param id 记录id
	 */
	public void delete(String id);

	/**
	 * 根据条件删除预填流水(tb_jnl_prefilled)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新预填流水(tb_jnl_prefilled)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, TbJnlPrefilled t);

	/**
	 * 根据条件查询预填流水(tb_jnl_prefilled)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<TbJnlPrefilled> query(WhereCondition wc);

	/**
	 * 根据条件统计预填流水(tb_jnl_prefilled)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询预填流水(tb_jnl_prefilled)记录
	 * @param id 记录id
	 * @return 匹配的记录
	 */
	public TbJnlPrefilled loadById(String id);
}
