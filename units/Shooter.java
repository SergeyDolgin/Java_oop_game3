package units;

public class Shooter extends BaseHero{
    int shoot;
    
        public Shooter(String hero, String name, int health, int attack, int speed, int maxDamage, int minDamage,int protection, int shoot) {
            super(hero, name, health, attack, speed, maxDamage, minDamage, protection);
            this.shoot = shoot;
    
        }
        
        public String getInfo() {
            return String.format("%s Ammunition: %d Gun: %s Markmanship: %d", 
            super.getInfo());       
        }
}       