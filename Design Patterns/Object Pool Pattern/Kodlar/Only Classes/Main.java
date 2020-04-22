package com.company;

public class Main {



    public static void main(String[] args) {
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
        createRequest();
    }

    static void createRequest(){
        NpcClient npcClient = new NpcClient();
        Thread thread = new Thread(npcClient);
        thread.start();
    }
}
