package com.ace.xiaochongtech.simulate.models.operation;


public class Consumer implements Runnable{
	
	
	private Storage<Module> storage;
	
	public Consumer() {
		super();
	}
	
	public Consumer(Storage<Module> storage) {
		super();
		this.storage = storage; 
	}
	

	@Override
	public void run() {
		
		/***
		 * 遍历获取仓库类中module
		 * 取出module的号码去撞库
		 * 如果拿到数据则插入到数据库
		 */
		
	}

}
