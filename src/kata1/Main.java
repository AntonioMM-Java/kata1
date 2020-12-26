package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Antonio Miguel Martel 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hola soy la kata1");
        
        Person persona1 = new Person("ANtonio Martel", LocalDate.of(2000, Month.DECEMBER, 16));
        System.out.println(persona1.getName() + " " + persona1.getAge());
    }
    
}
