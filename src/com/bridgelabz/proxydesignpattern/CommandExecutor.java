package com.bridgelabz.proxydesignpattern;

import java.util.Observer;

public interface CommandExecutor {

	public void runCommand(String cmd) throws Exception;
	public interface Subject {

		//methods to register and unregister observers
		public void register(Observer obj);
		public void unregister(Observer obj);
		
		//method to notify observers of change
		public void notifyObservers();
		
		//method to get updates from subject
		public Object getUpdate(Observer obj);
		
	}

}