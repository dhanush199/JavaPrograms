package com.bridgelabz.utility;


public class QueueLinkedList<T> {
	
	public Node<T> front,rear;
    public int size=0;
    public QueueLinkedList(){
        front=null;
        rear=null;
        size=0;
    }
    public boolean isQueueEmpty(){
        return front==null;
    }
   
    public int getSize(){
        return size;
    }
    public void enqueue(T data){
        Node<T> node=new Node<T>(data,null);
        if(rear==null){
            front=node;
            rear=node;
        }
        else{
            rear.setNextRef(node);
            rear=rear.getNextRef();
        }
        size++;
    }
   
    public T dequeue(){
        if(isQueueEmpty())
        {
            System.out.println("Underflow");
        }
        Node<T> curr=front;
        front = curr.getNextRef();       
        if (front == null){
            rear = null;
            size-- ;
        }
        return curr.getValue();
    }
    public void display(){ 
        if(isQueueEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        else{
            Node<T> tNode=front;
            while(tNode!=null){
                System.out.print(tNode.getValue()+" ");
                tNode=tNode.getNextRef();
            }
        }
    }
}
