package poofino.polimorfismo;

public class TrabajadorObra {


    public static class MaestroDeObra implements TrabajadorContruccion{
        @Override
        public String ComerAlmuerzo(){
            return "Come su menu barato porque no le alcanza el sueldo";
        }
    }

    public static class JefeDeObra implements TrabajadorContruccion{
         @Override
        public String ComerAlmuerzo(){
             return  "Come Carne azada como buen jefe";
         }
    }

}
