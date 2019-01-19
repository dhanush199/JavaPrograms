package com.bridgelabz.visitordesignpattern;

public interface ItemElement {

 public int accept(ShoppingCartVisitor visitor);
 
}