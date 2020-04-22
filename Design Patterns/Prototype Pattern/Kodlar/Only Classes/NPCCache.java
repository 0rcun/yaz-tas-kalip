package com.company;

import java.util.HashMap;

public class NPCCache {

    private static HashMap<String,NPC> npcMap = new HashMap<String,NPC>();
    public static NPC getNPC(String name){
        NPC cachedNPC = npcMap.get(name);
        return (NPC) cachedNPC.clone();
    }

    public static void loadCache(){
        Devolarium devolarium = new Devolarium();
        Lordakia lordakia = new Lordakia();
        System.out.println(lordakia.toString());
        Mordon mordon = new Mordon();
        Saimon saimon = new Saimon();
        Struener struener = new Struener();

        npcMap.put(devolarium.getName(),devolarium);
        npcMap.put(lordakia.getName(),lordakia);
        npcMap.put(mordon.getName(),mordon);
        npcMap.put(saimon.getName(),saimon);
        npcMap.put(struener.getName(),struener);
    }

    public static void changeFeature(){

        npcMap.get("Lordakia").setCredit(0);
        npcMap.get("Lordakia").getMap().setName("Changed");
    }

}
