package com.company;

public class Struener extends NPC{
    public Struener() {
        setName("Struener");
        setHitPoints(800);
        setShield(400);
        setDamage(20);
        setSpeed(270);
        setExperiencePoint(400);
        setHonor(1);
        setCredit(400);
        setUridium(1);
        setMap(new Map("x-1/x-2"));
    }

    @Override
    public void move() {

    }
}
