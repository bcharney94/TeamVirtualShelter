package pets_amok;

public abstract class OrganicPet extends Pet {

    private int hunger;
    private int thirst;
    private int energy;

    // a constructor for organic pets, extended from the Pet class
    public OrganicPet( String species, String name) {
        super( species, name);
        this.hunger = 50;
        this.thirst = 50;
        this.energy = 80;
    }

    // a tick method to update organic pet stats after each user interaction
    @Override
    public void tick() {
        
        this.hunger++;
        this.thirst++;
        this.energy -= 2;
        this.happiness -=2;
        this.boredom += 3;
        this.hygiene -= 2;
        this.health --;
        
    }

// play method that mainly affects boredom
    @Override
    public void play() {
        this.boredom -= 21;
        this.health += 6;
        this.happiness += 16;
        this.hygiene -= 8;
        this.energy -= 15;
        this.thirst += 5;
        this.hunger += 3;
    }

    
    // a method to feed organic pets, mainly affects hunger
    @Override
    public void feed() {
        System.out.println("You gave some food to, " + name + "!");
        System.out.println();
        this.hunger = hunger - 17;
        this.thirst = thirst + 2;
        this.boredom = boredom - 3;
        this.happiness = happiness + 6;
        this.health = health + 6;

    }

    @Override
    public int getHunger() {

        return this.hunger;
    }

    // a method to give organic pets a nap, mainly affects energy
    @Override
    public void nap() {
        System.out.println ( name + " laid down for a nap.");
        this.energy += 15;
        this.hunger += 4;
        this.thirst += 4;
        this.boredom -= 14;
        this.happiness += 9;
        this.health += 9;

    }

    @Override
    public int getEnergy() {

        return this.energy;
    }

    // a method to give organic pets water, mainly affects thirst
    @Override
    public void water() {
        System.out.println(name + " is thankful for the the fresh water!");
        this.thirst = thirst - 11;
        this.hunger = hunger + 2;
        this.boredom = boredom - 3;
        this.happiness = happiness + 6;
        this.health = health + 6;
    }

    @Override
    public int getThirst() {

        return this.thirst;
    }

    // a method to bathe/groom organic pets, mainly affects hygiene
    @Override
    public void bathe() {
        System.out.println(name + " now has a wonderful fresh and fluffy coat of fur!");
        this.hygiene += 21;
        this.energy -= 4;
        this.boredom -= 6;
        this.happiness += 6;
        this.health += 6;
    }

    // methods that we don't want applicable to organic pets
    @Override
    public void oilRoboPet() {
        System.out.println( name + " says, \"I don't require an oil change, just pet me and give me treats!\"");

    }

    @Override
    public int getOil() {

        return 0;
    }

    // methods that we don't want applicable to organic pets
    @Override
    public void chargeRoboPet() {
        System.out.println( name + " says, \"I don't need a charge, just let me take a nap!\"");

    }

    @Override
    public int getBattery() {

        return 0;
    }

    // methods that we don't want applicable to organic pets
    @Override
    public void polishRoboPet() {
        System.out.println(name + " says, \"I'm scared of the polishing machine, stay away!\"");

    }

    @Override
    public void walk() {
        System.out.println( name + " is looking forward to going on a walk!");
        this.energy -= 13;
        this.hunger += 4;
        this.thirst += 4;
        this.happiness += 11;
        this.boredom -= 13;
        this.hygiene -= 3;

    }

}
