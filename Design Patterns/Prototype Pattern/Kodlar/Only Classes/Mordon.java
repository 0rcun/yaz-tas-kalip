package com.company;

public class Mordon extends NPC{
    public Mordon() {
        setName("Mordon");
        setHitPoints(20000);
        setShield(10000);
        setDamage(300);
        setSpeed(125);
        setExperiencePoint(3200);
        setHonor(16);
        setCredit(6400);
        setUridium(8);

        setMap(new Map("x-3/x-4"));
    }

    @Override
    public void move() {

    }
}
