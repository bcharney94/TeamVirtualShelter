package pets_amok;


import java.util.HashMap;
import java.util.Map;

public class VirtualShelter {

    
    private static Map <Integer, Pet> allPets = new HashMap<>();
    
    private static int keyValue = 0;
    private static Pet cat1 = new OrganicCat("Vince");
    private static Pet dog1 = new OrganicDog(  "Baxter");
    private static Pet roboDog1 = new RoboDog(  "Goddard");
    private static Pet roboCat1 = new RoboCat(  "Sagwa");
    
    
    public VirtualShelter(){
        allPets.put(cat1.getKeyValue(), cat1);
        allPets.put(dog1.getKeyValue(), dog1);
        allPets.put(roboDog1.getKeyValue(), roboDog1);
        allPets.put(roboCat1.getKeyValue(), roboCat1);
    }

// a menu to display info and relative stats on all pets enrolled at the shelter
public void displayAllPets(){
    System.out.println("                                                        [ ~~ Here is everyone currently enrolled at the Virtual Pet Shelter: ~~ ]\n\n" +
        "    | :Key No:  |   :Species:   |     :Name:    |    :Health:   |   :Boredom:   |   :Hygiene:   |  :Happiness:  |    :Hunger:   |    :Thirst:   |    :Energy:   |  :Oil Level:  |   :Battery:   |"); 
        System.out.println(allPets.toString()); 
        System.out.println("     ___________________________________________________________________________________________________________________________________________________________________________________________\n\n");
}



public void tickAll(){
    for (Pet pets : allPets.values()){
        pets.tick();
    }
}
// a list that returns only the names of the pets in the shelter; used for specific interactions
public void listAllPets(){
    for (Pet names : allPets.values()){
        System.out.println(names.getKeyValue() + ".]-- " + names.getName() + ": " + names.getSpecies());
    }
}

// a  method to interact with a specific pet by identifying the keyValue
public Pet getSpecificPet(int keyValue){
    return allPets.get(keyValue);
}

// method for simultaneously feeding all pets
public void feedAll(){
    for (Pet pets : allPets.values()){
        pets.feed();
    }
}


// method for simultaneously watering all pets
public void waterAll(){
    for (Pet pets : allPets.values()){
        pets.water();
    }
}

// method to let all pets nap
public void napAll(){
    for (Pet pets : allPets.values()){
        pets.nap();
    }
}

//  method to walk all dogs in the shelter
public void walkDogs(){
    for (Pet pets : allPets.values()){
        pets.walk();
    }
}

// method to polish all robo pets in shelter
public void polishAll(){
    for (Pet pets : allPets.values()){
        pets.polishRoboPet();
    }
}

// method to change all robo pets oil 
public void oilAll(){
    for (Pet pets : allPets.values()){
        pets.oilRoboPet();
    }
}

// mehod to charge all robo pets in facility 
public void chargeAll(){
    for (Pet pets :allPets.values()){
        pets.chargeRoboPet();
    }
}

// method to play with all pets
public void playAll(){
    for (Pet pets : allPets.values()){
        pets.play();
    }
}

// a method to bathe all pets
public void batheAll(){
    for (Pet pets : allPets.values()){
        pets.bathe();
    }
}

// a method for admitting a new pet to the shelter
public void admit(Pet newPet){
    allPets.put(newPet.getKeyValue(), newPet);
}

public void adopt(int keyValue){
    allPets.remove(keyValue);
    
}

}