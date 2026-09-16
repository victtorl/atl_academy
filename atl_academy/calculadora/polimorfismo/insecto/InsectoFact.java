package polimorfismo.insecto;

public class InsectoFact {

    public static class Grillo implements Insecto{
        @Override
        public void TipoMovimiento(){
            System.out.println("Los grillos caminan y suelen saltar");
        }
    }

    public static class Gusano implements Insecto{
        @Override
        public void TipoMovimiento(){
            System.out.println("Los gusanos se arrastran por la tierra");
        }
    }
}
