package Seminar1;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {

    public Dog(String name, double weight, Owner owner, LocalDate birthday, List<Vaccination> vaccinations,
            Color color) {
        super(name, weight, owner, birthday, vaccinations, color);
    }
    
}
