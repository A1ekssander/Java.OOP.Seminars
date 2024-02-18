package Seminar1;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    private String breed;
    
    public Cat(String name, double weight, Owner owner, LocalDate birthday, List<Vaccination> vaccinations,
            Color color, String breed){
        super(name, weight, owner, birthday, vaccinations, color);
        this.breed = breed;
            }
            public String getBreed() {
                return breed;
            }

    
}
