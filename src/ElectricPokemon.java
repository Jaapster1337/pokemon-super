public class ElectricPokemon extends Pokemon{

    int knownElectricAttacks;

    String faveElectric;

    public ElectricPokemon(String name, int level, int knownElectricAttacks, String faveElectric) {
        super(name, level);
        this.knownElectricAttacks = knownElectricAttacks;
        this.faveElectric = faveElectric;
    }


    public int getKnownElectricAttacks() {
        return knownElectricAttacks;
    }

    public void setKnownElectricAttacks(int knownElectricAttacks) {
        this.knownElectricAttacks = knownElectricAttacks;
    }

    public String getFaveElectric() {
        return faveElectric;
    }

    public void setFaveElectric(String faveElectric) {
        this.faveElectric = faveElectric;
    }


    @Override
    public void speaks(){
        System.out.println("I am an electric pokemon");
    }

    @Override
    public void move(){
        System.out.println(getName() +" is fast");
    }

    public void thunderPunch(){
        System.out.println(getName() + " used ThunderPunch" );
    }

    public void electroBall(){
        System.out.println(getName() + " used ElectroBall" );
    }
}
