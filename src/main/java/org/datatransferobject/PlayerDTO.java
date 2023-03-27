package org.datatransferobject;


public class PlayerDTO {
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
}

