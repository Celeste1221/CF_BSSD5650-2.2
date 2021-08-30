package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //put chosen animal through the test function once they finish so user can see all output about
        //  their animal
        //ask if they wish to change the Animal's ambulation and give them just those choices again
        //  if they change ambulation, change strategy )this is a change at runtime  using a setter) and then
        //  test their animal again. If they don't change, end program

        Scanner sc = new Scanner(System.in); //for getting info from user
        System.out.println("Choose 1 for Dog, 2 for Duck, or 3 for Turtle: ");
        Integer userInputAnimal = sc.nextInt();

        Animal userAnimal = new Dog();
        if (userInputAnimal == 1){
             userAnimal = new Dog();
        }
        else if (userInputAnimal == 2){
             userAnimal = new Duck();
        }
        else if (userInputAnimal == 3) {
             userAnimal = new Turtle();
        }
        else {
            System.out.println("invalid response");
        }

        System.out.println("How many legs does it have: 2, 4, or 0? ");
        Integer userInputNumLegs = sc.nextInt();
        if (userInputNumLegs == 2){
            userAnimal.setNumLegs(new TwoLegs());
        }
        else if (userInputNumLegs == 4){
            userAnimal.setNumLegs(new FourLegs());
        }
        else if (userInputNumLegs == 0) {
            userAnimal.setNumLegs(new NoLegs());
        }
        else {
            System.out.println("invalid response");
        }

        System.out.println("Can it fly? 1 for yes, 2 for no: ");
        Integer userInputFlys = sc.nextInt();
        if (userInputFlys == 1){
            userAnimal.setFlyingType(new CanFly());
        }
        else if (userInputFlys == 2){
            userAnimal.setFlyingType(new CantFly());
        }
        else {
            System.out.println("invalid response");
        }

        testAnimal (userAnimal);

        System.out.println("/nWould you like to change your answer? Can if fly? 1 for yes, 2 for no: ");
        Integer userNewInputFlys = sc.nextInt();
        if (userNewInputFlys == 1){
            userAnimal.setFlyingType(new CanFly());
            userAnimal.setNumLegs(new NoLegs());
        }
        else if (userNewInputFlys == 2){
            userAnimal.setFlyingType(new CantFly());
        }
        else {
            System.out.println("invalid response");
        }
        testAnimal (userAnimal);
    }

    public static void testAnimal(Animal animal){
        //concatenate all the output together
        String output = animal.speak();
        output += "\n"+ animal.eat();
        output += "\n" + animal.pet();
        output += "\n" + animal.fly();
        output += "\n" + animal.walk();

        //print all output at once
        System.out.println(output);
    }

}
