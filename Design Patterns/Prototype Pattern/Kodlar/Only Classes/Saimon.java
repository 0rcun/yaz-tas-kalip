package com.company;

public class Saimon extends NPC{
    public Saimon() {
        setName("Saimon");
        setHitPoints(6000);
        setShield(3000);
        setDamage(200);
        setSpeed(320);
        setExperiencePoint(1600);
        setHonor(8);
        setCredit(1600);
        setUridium(4);

        setMap(new Map("x-3/x-4"));
    }

    @Override
    public void move() {

    }
}
