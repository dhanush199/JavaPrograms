package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.BinaryTreeImpl;
import com.bridgelabz.utility.DataStructureUtility;

public class BinaryTree {
	public static void main(String[] args) {
        System.out.println("enter the number of nodes ");
        int nodes=DataStructureUtility.readInteger();
        int count1;
        // find count of BST and  
        count1 = BinaryTreeImpl.countBST(nodes);
        // print count of BST and  
        // binary trees with n nodes
        System.out.println("Count of BST with "+ nodes +" nodes is "+ count1);
    }

}
