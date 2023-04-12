package org.datatransferobject;

import java.io.Serializable;

public class TowerDTO implements Serializable {
    protected float damage;
    protected int price;
    protected int range;
    protected UnitDTO target;
    protected float attackTime;
    protected int X,Y;
    protected long lastTimeOfAttack;
    protected int id;
    protected float deltaSum;
    protected String towerClass;

    public TowerDTO(int X,int Y,float damage, int price, int range, UnitDTO target, float attackTime,float deltaSum,int id) {
        this.X=X;
        this.Y=Y;
        this.damage = damage;
        this.price = price;
        this.range = range;
        this.target = target;
        this.attackTime = attackTime;
        this.deltaSum = deltaSum;
        this.id = id;
    }

    public String getTowerClass() {
        return towerClass;
    }

    public void setTowerClass(String towerClass) {
        this.towerClass = towerClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDeltaSum() {
        return deltaSum;
    }

    public void setDeltaSum(float deltaSum) {
        this.deltaSum = deltaSum;
    }

    public long getLastTimeOfAttack() {
        return lastTimeOfAttack;
    }

    public void setLastTimeOfAttack(long lastTimeOfAttack) {
        this.lastTimeOfAttack = lastTimeOfAttack;
    }

    public void setTarget(UnitDTO target) {
        this.target = target;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public float getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }

    public int getRange() {
        return range;
    }

    public UnitDTO getTarget() {
        return target;
    }

    public float getAttackTime() {
        return attackTime;
    }
}
