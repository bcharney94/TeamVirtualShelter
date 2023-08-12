package pets_amok;

public class RoboCat extends RoboPet {

    public RoboCat(String name) {
        super( "RoboCat", name);
        
    }

    @Override
    public void walk() {
        System.out.println( name + " says, \"You can only take the dogs for a walk!\"");

    }

    
        
    }

    
    

