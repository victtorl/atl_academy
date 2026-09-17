package claseabstracta;

public class Carro extends Vehiculo {

    public Carro(String tipo) {
        super(tipo);
    }

    @Override
    public void TipoCombustible() {
        System.out.println("El"+this.tipo+"Usa Diesel");
    }
}
