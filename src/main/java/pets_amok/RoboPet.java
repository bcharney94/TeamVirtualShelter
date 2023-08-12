package pets_amok;

public abstract class RoboPet extends Pet {
    private int oil;
    private int battery;

    // a constructor for robotic pets, extended from Pet
    public RoboPet( String species, String name) {
        super( species, name);
        this.oil = 80;
        this.battery = 80;

    }

    @Override
    public void tick() {
        
        this.battery -= 2;
        this.oil -= 3;
        this.happiness -=2;
        this.boredom += 3;
        this.hygiene -= 2;
        this.health --;
        
    }

    @Override
    public void play() {
        this.boredom -= 21;
        this.health += 8;
        this.happiness += 16;
        this.hygiene -= 2;
        this.battery -= 20;
    }

    

    // a method to charge robotic pets, mainly affects battery
    @Override
    public void chargeRoboPet() {
        System.out.println("You charged the batteries for " + name + ".");
        this.battery += 20;
        this.boredom -= 1;
        this.happiness += 9;
        this.health += 3;
    }

    @Override
    public int getBattery() {

        return battery;
    }

    // a method to change robotic pets oil, mainly affects oil
    @Override
    public void oilRoboPet() {
        System.out.println(name + " thanks you for the fresh oil change!");
        this.oil += 16;
        this.boredom -= 6;
        this.happiness += 6;
        this.health += 11;
        this.hygiene -= 9;

    }

    @Override
    public int getOil() {

        return oil;
    }

    // a method to polish robotic pets, mainly affects hygiene
    @Override
    public void polishRoboPet() {
        System.out.println("You grabbed some polish and buffered " + name + "'s coat.");
        this.hygiene += 16;
        this.boredom -= 6;
        this.happiness += 6;
        this.health += 6;
    }

    // methods that we don't want applicable to robotic pets
    @Override
    public void feed() {
        System.out.println(name + " says, \"I can't eat regular pet food!\"");

    }

    @Override
    public int getHunger() {

        return 0;
    }

    // methods that we don't want applicable to robotic pets
    @Override
    public void water() {
        System.out.println( name + " says, \"I have no need for water, I'd rather stay away!\"");

    }

    @Override
    public int getThirst() {

        return 0;
    }

    // methods that we don't want applicable to robotic pets
    @Override
    public void nap() {
        System.out.println( name + " says, \"I don't need to take a nap, I run on batteries!\"");
    }

    @Override
    public int getEnergy() {

        return 0;
    }

    // methods that we don't want applicable to robotic pets
    @Override
    public void bathe() {
        System.out.println( name + " says, \"I need to stay out of the water, I'll short circut!\"");

    }

    @Override
    public void walk() {
        System.out.println( name + " is looking forward to going on a walk!");
        this.battery -= 13;
        this.happiness += 11;
        this.boredom -= 13;
        this.health += 6;
        this.hygiene -= 3;

    }
}
