package com.company;

public class NpcClient implements Runnable{
    static int threadCount=0;
    private Thread t;
    public void run(){
        threadCount++;
        NPCManager instance= NPCManager.getInstance();
        NPC npc=null;
        npc = instance.takeNPC(this);
        boolean flag = true;
        while (flag){
            if(npc!=null){
                System.out.println(threadCount+". thread\tHash code: "+this.hashCode()+"\tTaken NPC: "+npc.hashCode());
                try {
                    t.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag=false;
                instance.releaseNPC(npc,this);
            }else{
                try {
                    t.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                npc = instance.takeNPC(this);
            }
        }

    }
}