package com.company;

public class Main {

        static class MultithreadingDemo implements Runnable{
            static int threadCount;

            public void run(){
                CustomRequest instance= CustomRequest.getInstance();
                System.out.println("Thread count: "+threadCount+++"\tInstance address: "+instance.toString());
            }
        }
    public static void createAndStartThread(){
        MultithreadingDemo obj=new MultithreadingDemo();
        Thread tobj =new Thread(obj);
        tobj.start();
    }


    public static void main(String args[]){
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
        createAndStartThread();
    }

}
