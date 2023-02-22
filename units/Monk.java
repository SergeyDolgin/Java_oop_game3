package units;

/**Монах*/
public class Monk extends Priest {

    public Monk(){
        super("Monk______", "Polit", 30, 12, 5, 4, 4,
         7, 1);
        
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Монах ";}

}