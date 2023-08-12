package pets_amok;

public class Menus {

    // main shelter menu to display at beginning of loop
    public void mainMenu() {
        System.out.println(">> Please select an option from the menu below. <<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(
                " ___________________________________________\n" +
                "|             >> MAIN MENU <<               |\n" +
                "|           ~~~~~~~~~~~~~~~~~~              |\n" +
                "|  [1.]-- Admit a new pet to the shelter    |\n" +
                "|  [2.]-- Adopt a pet from the shelter      |\n" +
                "|  [3.]-- Interact with an individual pet   |\n" +
                "|  [4.]-- Interact with all pets            |\n" +
                "|  [0.]-- Exit the Virtual Shelter          |\n" +
                "|___________________________________________|\n\n");
    }

    // interactions menu that passes methods
    public void interactionsMenu(){
        System.out.println(">> Please select an option from the menu below. <<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(
            " ____________________________________ \n" +
            "|      >> INTERACTIONS MENU <<       |\n" +
            "|         ~~~~~~~~~~~~~~~~~~         |\n" +
            "|    [1.]-- Give some food           |\n" +
            "|    [2.]-- Refill water             |\n" +
            "|    [3.]-- Go for a walk            |\n" +
            "|    [4.]-- Buffer & polish          |\n" +
            "|    [5.]-- Oil maintenance          |\n" +
            "|    [6.]-- Bathe/Groom & trim       |\n" +
            "|    [7.]-- Play with toys           |\n" +
            "|    [8.]-- Lay down for a nap       |\n" +
            "|    [9.]-- Charge batteries         |\n" +
            "|    [0.]-- Return to Main Menu      |\n" +
            "|____________________________________|\n\n");
    }

    // a neat menu for identifying what type of pet to admit
    public void petSpecies(){
        System.out.println(
            "\n      >> What type of pet would you like to admit today? <<\n" +
            ">> Enter a number from the options below to make your selection. <<\n\n" +
            "      /     [1.]-- Organic Cat --    species: Cat      \\ \n" +
            "     /      [2.]-- Organic Dog --    species: Dog       \\ \n" +
            "     \\      [3.]-- Robotic Cat --  species: RoboCat     /\n" +
            "      \\     [4.]-- Robotic Dog --  species: RoboDog    /\n\n" 
        );
    }

    // to be used in further updates
    public void facilities(){
        System.out.println(">> Please select an option from the menu below. <<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(
            " _______________________________________ \n" +
            "|         >> FACILITIES MENU <<         |\n" +
            "|          ~~~~~~~~~~~~~~~~~~~          |\n" +
            "|      [1.]-- Clean a dog kennel        |\n" +
            "|      [2.]-- Clean a litter box        |\n" +
            "|      [3.]-- Clean a robotic bay       |\n" +
            "|      [4.]-- Clean a dog kennel        |\n" +
            "|      [5.]-- Clean a litter box        |\n" +
            "|      [6.]-- Clean a robotic bay       |\n" +
            "|      [0.]-- Return to Main Menu       |\n" +
            "|_______________________________________|\n\n");
    }
}
