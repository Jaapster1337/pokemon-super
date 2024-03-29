public class WaterIcePokemon extends WaterPokemon {

    private boolean iceMain;


    public WaterIcePokemon(String name, int level, boolean evolvesWithWaterStone, int capacity, boolean iceMain) {
        super(name, level, evolvesWithWaterStone, capacity);
        this.iceMain = iceMain;
    }

    @Override
    public void speaks() {
        if (iceMain) {
            System.out.println("im a ice/water pokemon");
        } else {
            System.out.println("im a water/ice pokemon");
        }
    }

    public void freezeEnemy() {
        System.out.println(getName() + " has frozen the enemy");
    }
}
