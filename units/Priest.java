package units;

public class Priest extends BaseHero {
    protected int mana;

    public Priest(String hero, String name, int health, int attack, int speed, int maxDamage, int minDamage, int protection, int mana) {
        super(hero, name, health, attack, speed, maxDamage, minDamage, protection);
        this.mana = mana;
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}