package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal {
    static ArrayList<Anfibio> anfibios = new ArrayList<Anfibio>();;
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    boolean venenoso;

    public Anfibio() {
        anfibios.add(this);
    }
    public String movimiento(){
        return "saltar";
    }
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        anfibios.add(this);
    }

    public Anfibio(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        anfibios.add(this);
    }

    public static int cantidadAnfibios(){
        return anfibios.size();
    }

    public static Animal crearSalamandra(String colorPiel, int edad, String genero) {
        Anfibio salamandra = new Anfibio(colorPiel,edad,genero);
        salamandras++;
        return salamandra;
    }

    public static Animal crearRana(String colorPiel, int edad, String genero){
        Anfibio rana = new Anfibio(colorPiel,edad,genero);
       ranas++;
       return rana;
    }

    public ArrayList<Anfibio> getAnfibios() {
        return anfibios;
    }

    public void setAnfibios(ArrayList<Anfibio> anfibios) {
        this.anfibios = anfibios;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
