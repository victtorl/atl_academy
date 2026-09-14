package oveloading;

public class Usuario {
    String nombre;
    boolean isPremiun;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPremiun() {
        return isPremiun;
    }

    public Usuario(String nombre){
        this.nombre=nombre;
    }

    public Usuario(String nombre, boolean isPremiun){
        this.nombre=nombre;
        this.isPremiun=isPremiun;
    }
}
