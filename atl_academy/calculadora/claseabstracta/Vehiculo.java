package claseabstracta;

public abstract class Vehiculo {
    public String tipo;

    public Vehiculo(String tipo){
        this.tipo=tipo;
    }

    public void Arrancar(String tipo){
        System.out.println("El vehiculo arranca");
    }

    public abstract  void TipoCombustible();

}
