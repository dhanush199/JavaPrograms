package com.bridgelabz.observerdesignpattern;

public interface Subject {

	//methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(Observer obj);
	void register(java.util.Observer obj);
	void unregister(java.util.Observer obj);
	Object getUpdate(java.util.Observer obj);
	
}