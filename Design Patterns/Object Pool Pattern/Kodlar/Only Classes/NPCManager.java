package com.company;

import java.util.ArrayList;
import java.util.List;

public class NPCManager {
    private static NPCManager mInstance;
    private int avaliableNPC =10;
    private  List<NPC> NPCPool = new ArrayList<>();
    private List<NpcClient> waitingList = new ArrayList<>();

    private NPCManager() {
    }
    public static synchronized NPCManager getInstance() {
        if (mInstance == null) {
            mInstance = new NPCManager();
        }
        return mInstance;
    }
    public synchronized NPC takeNPC(NpcClient npcClient){

        if(waitingList.isEmpty()){      //WaitingList boş ise
            if(NPCPool.isEmpty()){     //NPCListe boş mu?
                if(avaliableNPC != 0){  //NPCListe boş ise npc oluşturma hakkımız var ise
                    Struener struener = null;
                    struener = new Struener();
                    avaliableNPC--;
                    return struener;
                }else{
                    System.out.println("Hash code: "+npcClient.hashCode()+"\tWaiting");
                    waitingList.add(npcClient);
                    return null;
                }
            }   else{                   //WaitigList boş ve NPCList dolu ise verip yolluyoruz
                    NPC response = NPCPool.get(0);
                    NPCPool.remove(0);
                    return response;
            }
        }else{          // WaitingListte dolu ise.

            if(waitingList.contains(npcClient)){        //WaitingListe de bu client var ise
                if(NPCPool.isEmpty()){                  //NPCPool boş ise
                    if(avaliableNPC != 0){  //NPCListe boş ise npc oluşturma hakkımız var ise oluşturkduk gönderdik
                        Struener struener = null;
                        struener = new Struener();
                        avaliableNPC--;
                        return struener;
                    }else{              //NPCListe boş ise npc oluşturma hakkımız yok ise listede olduğu için beklemesini söyledik
                        System.out.println("Hash code: "+npcClient.hashCode()+"\tPlease wait,again.");
                        return null;
                    }
                }else{                                  //WaitingListte var ve NPCPool dolu ise verdim yolladım
                    waitingList.remove(npcClient);
                    NPC response = NPCPool.get(0);
                    NPCPool.remove(response);
                    return response;
                }
            }else{      //WaitingListe de bu client yok ise Waitingliste ekledim beklettim
                System.out.println("Hash code: "+npcClient.hashCode()+"\tWaiting");
                waitingList.add(npcClient);
                return null;
            }
        }
    }

    public synchronized void releaseNPC(NPC npc, NpcClient npcClient){
        NPCPool.add(npc);
        System.out.println("Hash code: "+npcClient.hashCode()+"\tRelease NPC: "+npc.hashCode());
    }
}
