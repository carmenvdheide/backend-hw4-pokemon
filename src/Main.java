public class Main {

    public static void main(String[] args){
        FirePokemon charmander = new FirePokemon("Charamander", 1, 100, 0, 70, 80, 10, 5, 10, 5);

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 1, 100, 0, 50, 50, 10, 5, 15, 5);

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 100, 0, 50, 50, 10, 5, 15, 6);

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 1, 100, 0, 20, 10, 5, 30, 15, 5);

        squirtle.speaks();

        pikachu.thunderShock(charmander);
        pikachu.thunderPunch(charmander);
    }

}
