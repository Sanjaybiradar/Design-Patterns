package com.design.pattern.singleton;

public class MultiThreadSingleton {
	
	private static volatile MultiThreadSingleton instance;
	
	private MultiThreadSingleton() {
	}
	
	public static MultiThreadSingleton getInstance() {
		if(instance == null) {
			synchronized(MultiThreadSingleton.class) {
				if(instance == null) {
					instance = new MultiThreadSingleton();
				}
			}
		}
		return instance;
	}

}
