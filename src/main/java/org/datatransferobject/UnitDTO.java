package org.datatransferobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class UnitDTO implements Serializable {
    private float speed;
    private float health;
    private float damage;
    private int price;
    private int PreviousX;
    private int PreviousY;
    private int NextX;
    private int NextY;
    private float deltaX;
    private float deltaY;
    private float distance;
    private float X;
    private float Y;
    private String unitClass;
    private int id;
    private ArrayList<Integer> nextXCoordinates;
    private ArrayList<Integer> nextYCoordinates;

    public UnitDTO(float speed, float health, float damage, int price, int previousX, int previousY, int nextX,
                   int nextY, float deltaX, float deltaY, float distance, float x,
                   float y, String unitClass,int id,ArrayList<Integer> nextXCoordinates,ArrayList<Integer> nextYCoordinates) {
        this.speed = speed;
        this.health = health;
        this.damage = damage;
        this.price = price;
        PreviousX = previousX;
        PreviousY = previousY;
        NextX = nextX;
        NextY = nextY;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.distance = distance;
        X = x;
        Y = y;
        this.unitClass = unitClass;
        this.id=id;
        nextXCoordinates = new ArrayList<>(nextXCoordinates);
        nextYCoordinates = new ArrayList<>(nextYCoordinates);
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

    public int getNextX() {
        return nextXCoordinates.get(0);
    }

    public int getNextY() {
        return nextYCoordinates.get(0);
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

    public boolean isNextEmpty(){
        return nextXCoordinates.isEmpty();
    }
    public void setNextX(int nextX) {
        nextXCoordinates.add(nextX);
    }

    public void setNextY(int nextY) {
        nextYCoordinates.add(nextY);
    }
    public int getLastCalculatedXPoint(){
        return nextXCoordinates.get(nextXCoordinates.size());
    }
    public int get1ToLastCalculatedXPoint(){
        return nextXCoordinates.get(nextXCoordinates.size()-1);
    }
    public int get1ToLastCalculatedYPoint(){
        return nextYCoordinates.get(nextYCoordinates.size()-1);
    }

    public int getLastCalculatedYPoint(){
        return nextYCoordinates.get(nextYCoordinates.size());
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