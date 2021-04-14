package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;

import java.util.ArrayList;

public class Animal{
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    /**
     * zona animal
     */
    private static ArrayList<Zona> zona;

    public Animal(){

    }

    public Animal( String nombre, int edad, String habitat, String genero) {
        this.totalAnimales = totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.totalAnimales++;
    }

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        totalAnimales++;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo() {
        int ma= Mamifero.cantidadMamiferos();
        int aves= Ave.cantidadAves();
        int rep= Reptil.cantidadReptil();
        int pez= Pez.cantidadPeces();
        int anf =Anfibio.cantidadAnfibios();

        String  comp = "Mamiferos: "+ ma +"\n" +
                "Aves: "+aves+"\n" +
                "Reptiles: "+rep+"\n" +
                "Peces: "+pez+"\n" +
                "Anfibios: "+anf;
        System.out.println(comp);
        return comp;
    }

    @Override
    public String toString() {
        // Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F
        //"Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F"

        String x =  "Mi nombre es " + nombre + ", tengo una edad de " + Integer.valueOf(edad)  +", habito en " + habitat + " y mi genero es " + genero;
        return x;


    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }
}
