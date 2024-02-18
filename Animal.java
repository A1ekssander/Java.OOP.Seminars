package Seminar1;

import java.time.LocalDate;
import java.util.List;


public class Animal { // домашнее животное
    protected String name;
    protected double weight;
    protected Owner owner;
    protected LocalDate birthday;
    protected List<Vaccination> vaccinations;
    protected Color color;
    protected final String TYPE = this.getClass().getSimpleName();

    public Animal(String name, double weight, Owner owner, LocalDate birthday, List<Vaccination> vaccinations,
            Color color) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthday = birthday;
        this.vaccinations = vaccinations;
        this.color = color;

    }


    public Animal(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        this(name, weight, owner, birthDay, null, color);
    }

    public Animal(String name) {
        this.name = name;
    }
    // создать методы : простуться, играть, поесть, говорить и т.д.
    // создавать новые методы нужно через void и выше геттеров!

    public void lifeCycle() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    public void wakeUp() {
        System.out.println(this.TYPE + " проснулся"); //вместо this.TYPE выводиться будет Animal(конкретно которое мы указали)
    }

    public void findFood(){
        System.out.println( this.TYPE + " ищет еду");
    }

    public void eat(){
        System.out.println( this.TYPE + " кушает");
    }

    public void toPlay(){
        System.out.println( this.TYPE + " играет");
    }

    public void goToSleep(){
        System.out.println( this.TYPE + " собирается спать");
    }

    public void speak(){
        System.out.println( this.TYPE + " говорит Мяу");
    }


    public void toGo(){
        System.out.println( this.TYPE + " двигается");
    }

    public void fly(){
        if (this.TYPE.equals(bird.class.getSimpleName()))) {
            System.out.println(this.TYPE + " не умеет летать");
        } else {
            System.out.println(this.TYPE + " летает.");
        }
    }

    public void swim(){
        if (this.TYPE.equals(Fish.class.getSimpleName()))) {
            System.out.println(this.TYPE + " не умеет плавать");
        } else {
            System.out.println(this.TYPE + " плавает.");
        }
    }


    // getters(геттеры)

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

}
