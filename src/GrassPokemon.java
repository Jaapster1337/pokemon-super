public class GrassPokemon extends Pokemon {

    private boolean hasFlower;

    private int weight;
    public GrassPokemon(String name, int level, boolean hasFlower, int weight) {
        super(name, level);
        this.hasFlower = hasFlower;
        this.weight = weight;
    }

    public boolean isHasFlower() {
        return hasFlower;
    }

    public void setHasFlower(boolean hasFlower) {
        this.hasFlower = hasFlower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speaks() {
        System.out.println("I am an grass pokemon");
    }

    @Override
    public void move(){
        System.out.println(getName() +" is got at climbing");
    }

    public void grassKnot() {
        System.out.println(getName() + " used GrassKnot");
    }

    public void solarBeam() {
        System.out.println(getName() + " used SolarBeam");
    }
}
