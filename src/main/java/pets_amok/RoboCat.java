package pets_amok;

public class RoboCat extends Pet implements RoboPet {
    private int oilLevel;

    public int getOilLevel() {
        return oilLevel;
    }

    public RoboCat(int keyValue, String species, String name, int happiness, int hygiene, int oilLevel, int energy,
            int health) {
        super(keyValue, " RoboCat ", name, happiness, hygiene, energy, health);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void oilRoboPet() {
        this.oilLevel += 8;
        this.hygiene -= 4;
        this.happiness += 6;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'oilRoboPet'");
    }

    @Override
    public void chargeRoboPet() {
        this.energy += 11;
        this.happiness += 6;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chargeRoboPet'");
    }

    @Override
    public void polishRoboPet() {
        this.hygiene += 8;
        this.happiness += 6;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'polishRoboPet'");
    }

}
