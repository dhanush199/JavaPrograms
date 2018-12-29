package com.bridgelab.trails;

import java.util.List;
import java.util.ArrayList;

public class AddAyyaInsideArray {

	public static void main(String[] args) {
     List al=new ArrayList();
     List al1=new ArrayList();
     al.add("a");
     al.add("b");
     al.add("c");
     al.add("a");
     al1.add("b");
     al1.add("c");
     al1.add("d");
     al.addAll(al1);
     System.out.println(al);
     al.sort(null);
     System.out.println(al);
	}

}
