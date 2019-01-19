package com.bridgelabz.visitordesignpattern;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}

