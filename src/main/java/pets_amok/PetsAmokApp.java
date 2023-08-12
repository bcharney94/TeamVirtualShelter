package pets_amok;

import java.util.Scanner;

public class PetsAmokApp {
    public static Menus menu = new Menus();
    public static VirtualShelter shelter = new VirtualShelter();

    public static void main(String[] args) {

        int option;
        Scanner input = new Scanner(System.in);
        // welcome menu
        System.out.println("        ------------------------------------------------------------------------------");
        System.out.println("       |    ^                        ~~~~~~~~~~~~~                        ^           |");
        System.out.println("       |                   Welcome to the Virtual Pet Shelter                         |");
        System.out.println("       |                       Thank you for stopping by!                             |");
        System.out
                .println("       |______________________________________________________________________________|\n\n");


            // initialize the loop; display all pets in the shelter, then the main menu beneath
        do {
            shelter.displayAllPets();
            menu.mainMenu();
            option = input.nextInt();
            
            if (option == 0) {
                continue;
                // option 1 from the main menu admits a new pet to the shelter
            } else if (option == 1) {
                menu.petSpecies();          
                int newAdmit = input.nextInt();     //have the user select what type of pet to admit via the petSpecies menu
                input.nextLine();
                switch (newAdmit) {
                    case 1: {                       //user chose to admit an organic cat
                        System.out.println(">> What would you like to name the kitty cat? <<");
                        String newCat = input.nextLine();
                        Pet cat = new OrganicCat(newCat);
                        shelter.admit(cat);         //adding the pet to the map allPets and updating the table
                        System.out.println("\n *** Alrighty, just like that " + newCat
                                + " is in the system! ***\t\t\t|*** Check it out! ***|\n");
                        break;
                    }
                    case 2: {                       //user chose to admit an organic dog
                        System.out.println(">> What would you like to name the new pup? <<");
                        String newDog = input.nextLine();
                        Pet dog = new OrganicDog(newDog);
                        shelter.admit(dog);         //adding the pet to the map allPets and updating the table
                        System.out.println("\n *** Alrighty, just like that " + newDog
                                + " is in the system! ***\t\t\t|*** Check it out! ***|\n");
                        break;
                    }
                    case 3: {                       //user chose to admit a robotic cat
                        System.out.println(">> What would you like to name the new RoboCat? <<");
                        String newRoboCat = input.nextLine();
                        Pet roboCat = new RoboCat(newRoboCat);
                        shelter.admit(roboCat);     //adding the pet to the map allPets and updating the table
                        System.out.println("\n *** Alrighty, just like that " + newRoboCat
                                + " is in the system! ***\t\t\t|*** Check it out! ***|\n");
                        break;
                    }
                    case 4: {                       //user chose to admit a robotic cat
                        System.out.println(">> What would you like to name the new RoboDog? <<");
                        String newRoboDog = input.nextLine();
                        Pet roboDog = new OrganicCat(newRoboDog);
                        shelter.admit(roboDog);     //adding the pet to the map allPets and updating the table
                        System.out.println("\n \t*** Alrighty, just like that " + newRoboDog
                                + " is in the system! ***\t\t\t|*** Check it out! ***|\n");
                        break;
                    }

                }
            } 
            
            // option 2 is the user adopting a pet out of the shelter
            else if (option == 2) {
                System.out.println("Okay, thank you so much! Please choose a pet below to take home!");
                shelter.listAllPets();      //display the names of the pets available to adopt
                int adoption = input.nextInt();
                shelter.adopt(adoption);    // remove the user's selection from the map/ table
                System.out.println(
                        " *** Thank you for giving a pet a new home. ***\t\t\t\t|*** Here's an updated list. ***|\n");
                continue;
            }

            // option 3 is interacting with an individual pet
            else if (option == 3) {
                System.out.println("Select a pet below to interact with.");
                shelter.listAllPets();      
                int individualPet = input.nextInt();
                input.nextLine();           // have the user choose which pet to interact with via listAllPets menu
                Pet pet = shelter.getSpecificPet(individualPet);
                System.out.println("Okay, now pick an action from the menu below");
                menu.interactionsMenu();
                int singleOption = input.nextInt();
                input.nextLine();           //display the interactions menu to give the user methods to pass on to individual pet
                switch (singleOption) {
                    case 1: {
                        pet.feed();
                        shelter.tickAll();
                        break;
                    }
                    case 2: {
                        pet.water();
                        shelter.tickAll();
                        break;
                    }
                    case 3: {
                        pet.walk();
                        shelter.tickAll();
                        break;
                    }
                    case 4: {
                        pet.polishRoboPet();
                        shelter.tickAll();
                        break;
                    }
                    case 5: {
                        pet.oilRoboPet();
                        shelter.tickAll();
                        break;
                    }
                    case 6: {
                        pet.bathe();
                        shelter.tickAll();
                        break;
                    }
                    case 7: {
                        pet.play();
                        shelter.tickAll();
                        break;
                    }
                    case 8: {
                        pet.nap();
                        shelter.tickAll();
                        break;
                    }
                    case 9: {
                        pet.chargeRoboPet();
                        shelter.tickAll();
                        break;
                    }
                }

            }

            // option to interact with all animals in the shelter at once, displaying the updated table after
            else if (option == 4) {
                System.out.println("Okay, choose an action to apply to all pets in the shelter!");
                int allChoice;
                do {
                    menu.interactionsMenu();
                    allChoice = input.nextInt();
                    if (allChoice == 1) {
                        // give food to all pets in the shelter
                        shelter.feedAll();
                        System.out.println("\nYou gave all the organic animals some food.\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    } else if (allChoice == 2) {
                        // give water to all pets in the shelter
                        shelter.waterAll();
                        System.out.println("\nYou filled the water for all organic animals.\n");
                        shelter.tickAll();
                        shelter.displayAllPets();

                        continue;
                    } else if (allChoice == 3) {
                        // walk all dogs in the shelter
                        shelter.walkDogs();
                        System.out.println("\nYou locked the cats up and walked all the dogs in the shelter.\n");
                        shelter.tickAll();
                        shelter.displayAllPets();

                        continue;
                    } else if (allChoice == 4) {
                        // polish all animals in the shelter
                        shelter.polishAll();
                        System.out.println(
                                "\nThe organic animals were very clear so you only polished all the residing robotic pets giving them shiny coats!\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    } else if (allChoice == 5) {
                        // change all pets oil within the shelter
                        shelter.oilAll();
                        System.out.println(
                                "\nYou took all the robo pet to the maintenance bay an gave them all an oil change.\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    } else if (allChoice == 6) {
                        // bathe and groom all pets in the shelter
                        shelter.batheAll();
                        System.out.println(
                                "\nYou kept the robo pets dry while grooming and trimming up the organic pets, that's good hygiene!\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    } else if (allChoice == 7) {
                        // play with all pets at once
                        shelter.playAll();
                        System.out.println("You took out all the pets at once and played for a while!\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    } else if (allChoice == 8) {
                        // give a nap to all the pets in the shelter
                        shelter.napAll();
                        System.out.println(
                                "\nThe robotic pets don't get tired so the organic pets took a nap and rested, giving them some energy.\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    } else if (allChoice == 9) {
                        // charge all pets in the shelter
                        shelter.chargeAll();
                        System.out.println(
                                "\nYou lined up all the robo pets and used your Tesla charging station to replenish some battery life.\n");
                        shelter.tickAll();
                        shelter.displayAllPets();
                        continue;
                    }
                } while (allChoice != 0);
            }

        } while (option != 0);
    }

    // a method that handles interacting with a specific pet
    public static int specificPet() {
        shelter.listAllPets();
        Scanner petChoice = new Scanner(System.in);
        int thatPet = petChoice.nextInt();
        return thatPet;
    }
}
