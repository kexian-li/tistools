
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.log.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.log.LogTxTrace;
import org.tis.tools.rservice.log.basic.ILogTxTraceRService;
import org.tis.tools.service.log.LogTxTraceService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 交易操作日志(LOG_TX_TRACE) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "log", version = "1.0", interfaceClass = ILogTxTraceRService.class, timeout = 2000, document = "交易操作日志的基础远程服务")
public class LogTxTraceRServiceImpl implements ILogTxTraceRService {

	@Autowired
	LogTxTraceService logTxTraceService;

	@Override
	public void insert(LogTxTrace t) {
		logTxTraceService.insert(t);
	}

	@Override
	public void update(LogTxTrace t) {
		logTxTraceService.update(t);
	}

	@Override
	public void updateForce(LogTxTrace t) {
		logTxTraceService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		logTxTraceService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		logTxTraceService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, LogTxTrace t) {
		logTxTraceService.updateByCondition(wc,t);
	}

	@Override
	public List<LogTxTrace> query(WhereCondition wc) {
		return logTxTraceService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return logTxTraceService.count(wc);
	}

	@Override
	public LogTxTrace loadByGuid(String guid) {
		return logTxTraceService.loadByGuid(guid);
	}

}
