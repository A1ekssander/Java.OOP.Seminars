package Seminar1;

import java.time.LocalDate;

public class Vaccination { 
    //прививки животного и дата
    private String title;
    private LocalDate vaccinationDate;

    public Vaccination(String title, LocalDate vaccinatoinDate){
        this.title = title;
        this.vaccinationDate = vaccinatoinDate;
    }


    @Override
    public String toString() {
        return String.format("Прививка: %s, %s%n", title, vaccinationDate);
    }
}
