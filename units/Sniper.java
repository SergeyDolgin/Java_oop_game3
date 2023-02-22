package units;

/**Снайпер*/
public class Sniper extends Shooter {

    public Sniper(){
        super("Sniper____", "Eagle", 15, 12, 9, 10, 8, 10, 32);
             
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Снайпер";}

}