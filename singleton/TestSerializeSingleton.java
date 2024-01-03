package com.design.pattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializeSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializationSingleton serialize1 = SerializationSingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/USER/name/Singleton/SerializationSingleton.txt")));
		oos.writeObject(serialize1);
		
		SerializationSingleton serialize2 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/USER/name/Singleton/SerializationSingleton.txt")));
		serialize2 = (SerializationSingleton)  ois.readObject();
		
		oos.close();
		ois.close();
		
		if(serialize1 == serialize2) {
			System.out.println("Serialized Singleton");
		} else {
			System.out.println("Not Serilized Singleton");
		}
	}

}
