package pets_amok;

public class OrganicDog extends Pet implements OrganicPet {
    private int hunger;
    private int thirst;

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public OrganicDog(int keyValue, String species, String name, int happiness, int hunger, int thirst, int hygiene,
            int energy,
            int health) {
        super(keyValue, "   Dog   ", name, happiness, hygiene, energy, health);
        // TODO Auto-generated constructor stub
    }

    // a method to feed dogs
    @Override
    public void feed() {
        this.hunger -= 6;
        this.happiness += 8;
        this.energy += 4;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feed'");
    }

    @Override
    public void water() {
        this.thirst -= 6;
        this.happiness += 8;
        this.energy+= 4;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'water'");
    }
    
}
