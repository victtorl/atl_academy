package polimorfismo.usuario;
///esta clase se hace para demostrar el polimorfismos estatico
public class UsuarioYoutube {
    public String nombre;
    public static boolean isPremiun=true;
    public UsuarioYoutube(String nombre){
        this.nombre=nombre;
    }
    public UsuarioYoutube(String nombre,Boolean isPremiun){
        this.nombre=nombre;
        this.isPremiun=isPremiun;
    }
}
