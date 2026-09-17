package claseabstracta;

public class Motocar extends Vehiculo {

    public Motocar(String tipo){
        super(tipo);
    }

    @Override
    public void TipoCombustible() {
        System.out.println("El"+this.tipo+"Usa Aceite quemado");
    }


}
