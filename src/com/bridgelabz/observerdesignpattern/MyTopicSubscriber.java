package com.bridgelabz.observerdesignpattern;


public  class MyTopicSubscriber implements Observer {
   
    private String name;
    private Subject topic;
   
    public MyTopicSubscriber(String nm){
        this.name=nm;
    }
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
        System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
	@Override
	public void setSubject(com.bridgelabz.proxydesignpattern.CommandExecutor.Subject sub) {
		// TODO Auto-generated method stub
		
	}

}