public class FirePokemon extends Pokemon {

    private boolean hasVisibleFlame;

    private String color;

    public FirePokemon(String name, int level, boolean hasVisibleFlame, String color) {
        super(name, level);
        this.hasVisibleFlame = hasVisibleFlame;
        this.color = color;
    }

    public boolean isHasVisibleFlame() {
        return hasVisibleFlame;
    }

    public void setHasVisibleFlame(boolean hasVisibleFlame) {
        this.hasVisibleFlame = hasVisibleFlame;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void speaks() {
        System.out.println("I am an fire pokemon");
    }

    @Override
    public void move(){
        System.out.println(getName() +" is good at flying");
    }

    public void ember() {
        System.out.println(getName() + " used Ember");
    }

    public void embargo() {
        System.out.println(getName() + " used Embargo");
    }
}
