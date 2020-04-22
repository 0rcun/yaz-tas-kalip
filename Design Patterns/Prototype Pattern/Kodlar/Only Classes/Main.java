package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        NPCCache.loadCache();
        System.out.println("Shallow Copy");

        NPC lordakia = NPCCache.getNPC("Lordakia");

        System.out.println(lordakia.toString());

        System.out.println(lordakia.getCredit());
        System.out.println(lordakia.getMap().getName());

        NPCCache.changeFeature();

        System.out.println(lordakia.getCredit());
        System.out.println(lordakia.getMap().getName());

        System.out.println("Deep Copy için NPC sınıfına bakın");

    }
}




