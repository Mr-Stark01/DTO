package DataTransferObjects;

public class TowerDTO {
    protected float damage;
    protected int price;
    protected int range;
    protected UnitDTO target;
    protected float attackTime;

    public TowerDTO(float damage, int price, int range, UnitDTO target, float attackTime) {
        this.damage = damage;
        this.price = price;
        this.range = range;
        this.target = target;
        this.attackTime = attackTime;
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

