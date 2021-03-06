package com.bridgelabz.observerdesignpattern;

import com.bridgelabz.proxydesignpattern.CommandExecutor.Subject;

public interface Observer {
	
	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);

	void setSubject(com.bridgelabz.observerdesignpattern.Subject sub);
}
