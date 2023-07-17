import java.time.LocalDate;
import java.util.ArrayList;


public class Human {
    Human mother;
    Human father;
    ArrayList<Human> children;
    Gender gender;
    String name;
    LocalDate DateOfBirth;
    LocalDate DateOfDeath;
    public void PrintAllChildrens() {
        System.out.print(this.name + " { ");
        for (Human hm : this.children) {
            System.out.print(hm.name + " ");
        }
        System.out.println("}");
    }
    Human(String name, Gender gender, LocalDate DateOfBirth, LocalDate DateOfDeath, Human mother, Human father) {


        this.children = new ArrayList<>();
        this.name = name;
        this.DateOfBirth = DateOfBirth;
        this.DateOfDeath = DateOfDeath;
        this.gender = gender;

        this.father = father;
        this.father.children.add(this);

        this.mother = mother;
        this.mother.children.add(this);
    }

    Human(String name, Gender gender, LocalDate DateOfBirth, LocalDate DateOfDeath) {

        this.children = new ArrayList<>();
        this.gender = gender;
        this.name = name;
        this.DateOfBirth = DateOfBirth;
        this.DateOfDeath = DateOfDeath;

    }

}


abstract class Machine{
    String name;
}


class Truck extends Machine{

}

class Car{
    String nameOfKuzov;
    String nameOfEngine;
}
class BMW extends Car{
    String nameOfSidenia;
}

class M5 extends BMW{
    String colesa;
}
