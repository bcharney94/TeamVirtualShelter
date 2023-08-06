package pets_amok;

public abstract class Pet {
    // declare variables that all pets will have
    protected int keyValue;
    protected String species;
    protected String name;
    protected int happiness;
    protected int hygiene;
    protected int energy;
    protected int health;

    
    
    
    // generate a constructor for the Pet object
    public Pet(int keyValue, String species, String name, int happiness, int hygiene, int energy, int health) {
        this.keyValue = keyValue;
        this.species = species;
        this.name = name;
        this.happiness = happiness;
        this.hygiene = hygiene;
        this.energy = energy;
        this.health = health;
    }


    // getters for each pet variable
    public int getKeyValue() {
        return keyValue;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHygiene() {
        return hygiene;
    }

    public int getEnergy(){
        return energy;
    }

    public int getHealth() {
        return health;
    }

    // tick method to update values to pass after each interaction
    public void tick(){
        this.health--;
        this.happiness--;
        this.hygiene--;
        this.energy--;
        
    }

    
}
