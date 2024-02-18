package Seminar1;

import java.time.LocalDate;
import java.util.List;

public class Main {
    //это у нас главный класс(клиентский код), а на остальные в папке Семинар1 просто будем ссылаться
    public static void main(String[] args) {
        Owner alex = new Owner("Alex");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2018, 1, 15));
        Animal cat = new Animal("Barsik", 10.0, alex, LocalDate.of(2010, 1, 5), 
        List.of(chumka), Color.BLACK);
//Animal dog = new Animal(barbos, 15.0, alex, LocalDate.of(2015, 5, 14), null, Color.BLACK);

        System.out.println();
        System.out.println(cat.getName());
        System.out.println();

        


    }
} 
