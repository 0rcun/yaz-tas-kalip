package com.company;

public abstract class NPC implements Cloneable{
    private String name;
    private int hitPoints;
    private int shield;
    private int damage;
    private int speed;
    private int experiencePoint;
    private int honor;
    private int credit;
    private int uridium;
    private Map map;

    abstract void move();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
/*
    //Deep copy için görmek için bu fonksiyonun yorumunu kaldırın  üstteekini yorum içine alın
    public NPC clone(){
        NPC npc = new NPC() {
            @Override
            void move() {

            }
        };

        npc.setName(this.name);
        npc.setCredit(this.credit);
        npc.setDamage(this.damage);
        npc.setExperiencePoint(this.getExperiencePoint());
        npc.setHitPoints(this.hitPoints);
        npc.setHonor(this.getHonor());
        npc.setMap(new Map(this.getMap().getName()));
        npc.setShield(this.shield);
        npc.setSpeed(this.getSpeed());
        npc.setUridium(this.uridium);
        return npc;

    }*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getExperiencePoint() {
        return experiencePoint;
    }

    public void setExperiencePoint(int experiencePoint) {
        this.experiencePoint = experiencePoint;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getUridium() {
        return uridium;
    }

    public void setUridium(int uridium) {
        this.uridium = uridium;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
