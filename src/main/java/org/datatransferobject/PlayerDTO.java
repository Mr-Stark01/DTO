package org.datatransferobject;


import java.io.Serializable;

public class PlayerDTO implements Serializable {
    private int money;
    private int positionX,positionY;
    private float health;
    public PlayerDTO(int money, int positionX, int positionY, float health) {
        this.money = money;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public float getHealth() {
        return health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "money=" + money +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", health=" + health +
                '}';
    }
}

