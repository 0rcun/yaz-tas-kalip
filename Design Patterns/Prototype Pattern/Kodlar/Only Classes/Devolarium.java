package com.company;

public class Devolarium extends NPC {

    public Devolarium(){
        setName("Devolarium");
        setHitPoints(100000);
        setShield(100000);
        setDamage(1200);
        setSpeed(200);
        setExperiencePoint(6400);
        setHonor(32);
        setCredit(51200);
        setUridium(16);
        setMap(new Map("x-3"));
    }
    @Override
    public void move() {}
}
