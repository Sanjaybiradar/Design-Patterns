package com.design.pattern.singleton;

//EagerSingleton - LazySingleton
public class EagerSingleton {
	
	private static EagerSingleton instance;
	
	static {
		instance = new EagerSingleton();
	}
	
	private EagerSingleton() {
	}
	
	public static EagerSingleton getInstance() {
		if(instance == null) {
			instance = new EagerSingleton();
		}
		return instance;
	}
}
