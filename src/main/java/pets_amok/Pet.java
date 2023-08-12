package pets_amok;

public abstract class Pet {
    // declare attributes that all pets will have

    private static int keyCounter = 1;
    protected int keyValue;
    protected String species;
    protected String name;
    protected int happiness;
    protected int hygiene;
    protected int boredom;
    protected int health;

    // generate a constructor for the Pet object; attributes all species will contain 
    public Pet(String species, String name) {
        this.keyValue = keyCounter++;
        this.species = species;
        this.name = name;
        this.happiness = 80;
        this.hygiene = 80;
        this.boredom = 50;
        this.health = 75;
    }

    // getters and setters for each pet variable/parameter
    public int getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(int keyValue) {
        this.keyValue = keyValue;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHygiene() {
        return hygiene;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // abstract methods that may be overridden depending on class
    public abstract void feed();

    public abstract int getHunger();

    public abstract void water();

    public abstract int getThirst();

    public abstract void walk();

    public abstract void nap();

    public abstract int getEnergy();

    public abstract void oilRoboPet();

    public abstract int getOil();

    public abstract void chargeRoboPet();

    public abstract int getBattery();

    public abstract void bathe();

    public abstract void polishRoboPet();

    public abstract void play();

    // tick method to update values to pass after each interaction
    public abstract void tick();

    // toString to neatly display variable attribute as a string
    @Override
    public String toString() {
        return "|\t" + keyValue + "\t|\t" + species + "\t|\t" + name + "\t|\t" + health + "\t|\t" + boredom + "\t|\t"
                + hygiene + "\t|\t" + happiness + "\t|\t" + getHunger() + "\t|\t" + getThirst() + "\t|\t" + getEnergy()
                + "\t|\t" + getOil() + "\t|\t" + getBattery() + "\t|\n";
    }

}
