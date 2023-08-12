package pets_amok;

public class OrganicCat extends OrganicPet {

    // a constructor for organic cats, extended from OrganicPet
    public OrganicCat( String name) {
        super( "Cat", name);
    }


    @Override
    public void walk() {
        System.out.println( name + " says, \"You can only take the dogs for a walk!\"");

    }


    

}
