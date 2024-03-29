import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("henk", 13, 2, "thunderPunch");
        FirePokemon charmander = new FirePokemon("piet", 15, true, "red");
        GrassPokemon gardevoir = new GrassPokemon("vine", 15, true, 145);
        WaterPokemon vaporeon = new WaterPokemon("Squirt", 23, false, 9000);
        WaterIcePokemon dewgong = new WaterIcePokemon("Dewgong", 50, false, 10000, false);

        pikachu.electroBall();
        charmander.ember();
        gardevoir.grassKnot();
        vaporeon.hydroPump();

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(pikachu);
        pokemons.add(charmander);
        pokemons.add(gardevoir);
        pokemons.add(vaporeon);

        for(Pokemon p : pokemons){
            p.eats();
            p.speaks();
            p.move();
        }
    }
}
