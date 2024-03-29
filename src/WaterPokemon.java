public class WaterPokemon extends Pokemon {

    private boolean evolvesWithWaterStone;

    private int capacity;

    public WaterPokemon(String name, int level, boolean evolvesWithWaterStone, int capacity) {
        super(name, level);
        this.evolvesWithWaterStone = evolvesWithWaterStone;
        this.capacity = capacity;
    }

    public boolean isEvolvesWithWaterStone() {
        return evolvesWithWaterStone;
    }

    public void setEvolvesWithWaterStone(boolean evolvesWithWaterStone) {
        this.evolvesWithWaterStone = evolvesWithWaterStone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void speaks() {
        System.out.println("I am an water pokemon");
    }

    @Override
    public void move(){
        System.out.println(getName() +" is got at swimming");
    }

    public void hydroPump() {
        System.out.println(getName() + " used HydroPump");
    }

    public void waterGun() {
        System.out.println(getName() + " used Water Gun");
    }
}
