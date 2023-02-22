package units;

/**Колдун*/
public class Magician extends Priest {

    public Magician(){
        super("Magician__", "Harry", 30, 17, 9, 5, 5, 12, 1); 
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Колдун";}

}