/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.service.om;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.tis.tools.base.WhereCondition;

import org.tis.tools.dao.om.OmEmpGroupMapper;
import org.tis.tools.model.po.om.OmEmpGroup;


/**
 * 人员工作组对应关系(OM_EMP_GROUP)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class OmEmpGroupService {

	@Autowired
	OmEmpGroupMapper omEmpGroupMapper;
	
    public void insert(OmEmpGroup t){
    	omEmpGroupMapper.insert(t);
    }
    
    public void update(OmEmpGroup t){
    	omEmpGroupMapper.update(t); 
    }
   
    public void updateForce(OmEmpGroup t){
    	omEmpGroupMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	omEmpGroupMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	omEmpGroupMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,OmEmpGroup t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	omEmpGroupMapper.updateByCondition(map); 
    }

    public List<OmEmpGroup> query(WhereCondition wc){
    	return omEmpGroupMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return omEmpGroupMapper.count(wc);
    }
   
    public OmEmpGroup loadByGuid(String guid){
    	return omEmpGroupMapper.loadByGuid(guid);
    }
}
