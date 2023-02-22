package units;

public class Raider extends Warrior {

    public Raider(){
        super("Raider____", "Piter", 10, 8, 6, 4, 2, 3, 0);
        
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Разбойник";}

}