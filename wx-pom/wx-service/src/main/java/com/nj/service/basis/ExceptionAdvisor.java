package com.nj.service.basis;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import com.nj.common.bean.DataResult;
import com.nj.common.exception.ApplicationException;

public class ExceptionAdvisor implements MethodInterceptor {

	private Logger logger = Logger.getLogger(this.getClass());

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
//		invocation.getMethod().getName();
//		invocation.getArguments();
        try{  
        	return invocation.proceed();  
        }catch(Exception e){  
        	logger.error(e.getMessage());
        	if (ApplicationException.class.isAssignableFrom(e.getClass())){
        		return DataResult.fail(e.getMessage());
        	} else {
        		return DataResult.fail("系统内部数据异常");
        	}
        }  
	}

}
