package org.datatransferobject;

import java.io.Serializable;
import java.util.List;

public class UnitDTO implements Serializable {
    private float speed;
    private float health;
    private float damage;
    private int price;
    private int PreviousX;
    private int PreviousY;
    private float deltaX;
    private float deltaY;
    private float distance;
    private float X;
    private float Y;
    private String unitClass;
    private int id;
    private long lastStep;
    private List<Integer> nextXCoordinates;
    private List<Integer> nextYCoordinates;

    public UnitDTO(float speed, float health, float damage, int price, int previousX, int previousY, float deltaX, float deltaY, float distance, float x,
                   float y, String unitClass,int id,List<Integer> nextXCoordinates,List<Integer> nextYCoordinates) {
        this.speed = speed;
        this.health = health;
        this.damage = damage;
        this.price = price;
        PreviousX = previousX;
        PreviousY = previousY;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.distance = distance;
        X = x;
        Y = y;
        this.unitClass = unitClass;
        this.id=id;
        this.nextXCoordinates = nextXCoordinates;
        this.nextYCoordinates = nextYCoordinates;
    }

    public long getLastStep() {
        return lastStep;
    }

    public void setLastStep(long lastStep) {
        this.lastStep = lastStep;
    }

    public String getUnitClass() {
        return unitClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSpeed() {
        return speed;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getHealth() {
        return health;
    }

    public float getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }

    public int getPreviousX() {
        return PreviousX;
    }

    public int getPreviousY() {
        return PreviousY;
    }

    public List<Integer> getNextX() {
        return nextXCoordinates;
    }

    public List<Integer>  getNextY() {
        return nextYCoordinates;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public float getDistance() {
        return distance;
    }
    public float getX() {
        return X;
    }
    public float getY() {
        return Y;
    }
    public void setPreviousX(int previousX) {
        PreviousX = previousX;
    }

    public void setPreviousY(int previousY) {
        PreviousY = previousY;
    }

    public void setX(float x) {
        X = x;
    }

    public void setY(float y) {
        Y = y;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }
}