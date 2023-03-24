package DataTransferObjects;


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
}

