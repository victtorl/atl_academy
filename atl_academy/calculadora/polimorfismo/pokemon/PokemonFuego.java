package polimorfismo.pokemon;

public class PokemonFuego {

    public static class Ponita implements Pokemon{
        @Override
        public void LanzarAtaque(){
            System.out.println(raza+" Lanzallama con pisoton de caballo");
        }
    }

    public static class Arcanine implements Pokemon{
        @Override
        public void LanzarAtaque(){
            System.out.println(raza+" Circulo de fuego que quema");
        }
    }
}
