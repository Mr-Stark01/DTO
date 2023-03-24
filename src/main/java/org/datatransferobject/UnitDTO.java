package org.datatransferobject;
public class UnitDTO{
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

    public UnitDTO(float speed, float health, float damage, int price, int previousX, int previousY, int nextX, int nextY, float deltaX, float deltaY, float distance, float x, float y, String unitClass) {
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
    }

    public float getSpeed() {
        return speed;
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
        return NextX;
    }

    public int getNextY() {
        return NextY;
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

    public void setNextX(int nextX) {
        NextX = nextX;
    }

    public void setNextY(int nextY) {
        NextY = nextY;
    }

    public void setX(float x) {
        X = x;
    }

    public void setY(float y) {
        Y = y;
    }
}