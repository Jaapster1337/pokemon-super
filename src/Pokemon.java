public abstract class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public abstract void speaks();

    public abstract void move();

    public void eats(){
        System.out.println("Pokemon ate a Poffin");
    }
}
