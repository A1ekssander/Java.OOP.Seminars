package Seminar1;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal {

    public Fish(String name, double weight, Owner owner, LocalDate birthday, List<Vaccination> vaccinations,
            Color color) {
        super(name, weight, owner, birthday, vaccinations, color);
    }
    
}
