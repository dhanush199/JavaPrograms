package com.bridgelabz.designpatters.creational;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton(){}

	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance == null){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
// double check is done here to ensure that only single instance of a Singleton class is created
public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){                         // Check 1
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){                  // Check 2
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
}

