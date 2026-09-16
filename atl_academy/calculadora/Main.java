import oveloading.Usuario;
import polimorfismo.insecto.InsectoFact;
import polimorfismo.pokemon.PokemonFuego;
import polimorfismo.usuario.UsuarioYoutube;
import poofino.Animal;
import poofino.polimorfismo.Pokemon;
import poofino.polimorfismo.TrabajadorObra;


public class Main{

public static void main(String[] args) {
    System.out.println(CalculadoraSuma(5,8));
    System.out.println(CalculadoraResta(5,8));
    System.out.println(CalculadoraMultiplicacion(5,8));
    System.out.println(CalculadoraDivision(5,0));
    Perro squanchi=new Perro();
    System.out.println(squanchi.dictarProcedencia());
    System.out.println(squanchi.jugar());



//    USAR POLIMORFISMO
    TrabajadorObra.MaestroDeObra m1=new TrabajadorObra.MaestroDeObra();
    System.out.println("El maestro pobre"+ m1.ComerAlmuerzo());

    TrabajadorObra.JefeDeObra j1=new TrabajadorObra.JefeDeObra();
    System.out.println("El jefe de obra"+ j1.ComerAlmuerzo());

    Latias latias = new Latias();
    latias.name="latias";
    System.out.println(latias.LanzarAtaque());

   Pikachu pikachu = new Pikachu();
   pikachu.name="pikachu";
    System.out.println(pikachu.LanzarAtaque());

    //Polimorfismo estatico con construcotres overloading
    Usuario carlos = new Usuario("Carlos",true);
    Usuario molleja =new Usuario("Molleja");


    System.out.println("El usuario "+carlos.getNombre()+" tiene subscripcion?"+carlos.isPremiun());
    System.out.println("El usuario "+molleja.getNombre()+" tiene subscripcion? "+molleja.isPremiun());

   //POLIMORFISMO DINAMICO @OVERRIDE
    PokemonFuego.Arcanine arcanine = new PokemonFuego.Arcanine();
    arcanine.LanzarAtaque();
    PokemonFuego.Ponita ponita = new PokemonFuego.Ponita();
    ponita.LanzarAtaque();

    InsectoFact.Grillo  grillo = new InsectoFact.Grillo();
    grillo.TipoMovimiento();
    InsectoFact.Gusano gusano = new InsectoFact.Gusano();
    gusano.TipoMovimiento();

    //POLIMORFISMO ESTATICO los parametros son diferentes en los constructores
    UsuarioYoutube usuariox=new UsuarioYoutube("Juan Cualquiera");
    UsuarioYoutube usuariop=new UsuarioYoutube("Miracle",true);
}




public static double CalculadoraSuma(double n1, double n2){
return n1 + n2;
}

public static double CalculadoraResta(double n1, double n2){
    return n1 - n2;
}

public static double CalculadoraMultiplicacion(double n1, double n2){
    return n1 * n2;
}

public static double CalculadoraDivision(double n1, double n2){
    if(n2==0){
        return 0;
    }
    return n1 / n2;
}


public static class  OperacioneX{

    double a;
    double b;

    public double Suma(){
        return a + b;
    };
    double Resta(){
        return a - b;
    };
    double Multiplicacion(){
        return a * b;
    };
    double Division(){
        return a / b;
    };
}

public static class Perro implements Animal{


    @Override
    public String dictarProcedencia() {
        return "El perro proviene de"+procedencia;
    }


    @Override
    public String jugar() {
        return "El perro puede jugar porque es un"+categoriaAnimal;
    }
}



public static class Latias extends Pokemon{
    public double ataque;

  @Override
    public String LanzarAtaque(){
    return  name+" Lanza Cabezaso Zen";
  }
}

public static class Pikachu extends Pokemon{
    public double ataque;

   @Override
    public String LanzarAtaque(){
       return name+" Lanza Impact Trueno";
   }
}

}