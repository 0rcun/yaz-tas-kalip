package com.company;

public class Lordakia extends NPC{


    public Lordakia() {
        setName("Lordakia");
        setHitPoints(2000);
        setShield(2000);
        setDamage(80);
        setSpeed(320);
        setExperiencePoint(800);
        setHonor(4);
        setCredit(800);
        setUridium(2);
        setMap(new Map("x-2"));
    }


    @Override
    public void move() {

    }
}
