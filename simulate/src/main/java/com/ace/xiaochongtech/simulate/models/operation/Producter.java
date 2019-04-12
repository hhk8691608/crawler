package com.ace.xiaochongtech.simulate.models.operation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/***
 * 

 * @ClassName: Producter
	
 * @Description: 
 * 	生产者

 * @author: admin

 * @date: 2019年4月12日 下午2:33:53
 */
public class Producter implements Runnable{
	
	public static Logger LOG = LoggerFactory.getLogger(Producter.class);
	
	private Storage<Module> storage;
	
	public Producter(Storage<Module> storage) {
		super();
		this.storage = storage;
	}
	
	

	@Override
	public void run() {

		try {
			
			/**
			 * 读取外置文件号码段
			 * 补充号码段后面的后面四位号码
			 * 构建module对象填充进仓库类
			 */
			
			
			
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		
		
	}

}
