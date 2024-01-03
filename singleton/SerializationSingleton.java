package com.design.pattern.singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static SerializationSingleton instance;
	
	private SerializationSingleton() {
	}
	
	public static SerializationSingleton getInstance() {
		if(instance == null) {
			synchronized(SerializationSingleton.class) {
				if(instance == null) {
					instance = new SerializationSingleton();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}

}
