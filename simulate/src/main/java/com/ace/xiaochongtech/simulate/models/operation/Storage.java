package com.ace.xiaochongtech.simulate.models.operation;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 

 * @ClassName: Storage

 * @Description: 
 	*     仓库类
 	*    存储project
 	*    采用并发集合类LinkedBlockingQueue

 * @author: admin

 * @date: 2019年4月11日 下午5:32:52

 * @param <T>
 */
public class Storage<T> {
	
	private BlockingQueue<T> queue;
	
	private boolean isExist = false;
	
	public Storage() {
		super();
		queue = new LinkedBlockingQueue<T>(100);
	}
	
	public Storage(int queueSize) {
		super();
		queue = new LinkedBlockingQueue<T>(queueSize);
	}

	public void put(T e) throws InterruptedException {
		queue.put(e);
	}

	public T take() throws InterruptedException {
		return queue.take();
	}

	public boolean getIsExist() {
		return isExist;
	}

	public void setIsExist(boolean isExist) {
		this.isExist = isExist;
	}

	public BlockingQueue<T> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<T> queue) {
		this.queue = queue;
	}
	

}
