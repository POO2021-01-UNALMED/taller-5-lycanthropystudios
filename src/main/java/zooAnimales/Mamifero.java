package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        mamiferos.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public Mamifero(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    public  static int cantidadMamiferos(){
        return mamiferos.size();
    }

    public static Animal crearCaballo(String nombre, int edad, String genero) {
        Mamifero caballo = new Mamifero(nombre, edad, genero);
        caballos++;
        return caballo;
    }
    public static Animal crearLeon(String nombre, int edad, String genero) {
        Mamifero leon = new Mamifero(nombre, edad, genero);
        leones++;
        return leon;
    }

    public ArrayList<Mamifero> getMamiferos() {
        return mamiferos;
    }

    public void setMamiferos(ArrayList<Mamifero> mamiferos) {
        this.mamiferos = mamiferos;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
