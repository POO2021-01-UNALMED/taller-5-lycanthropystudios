package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    public static ArrayList<Pez>peces= new ArrayList<Pez>();
    public static  int salmones;
    public static  int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        peces.add(this);
    }
    public String movimiento(){
        return "nadar";
    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        peces.add(this);
    }


    public Pez(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        peces.add(this);
    }

    public static int cantidadPeces(){
        return peces.size();
    }

    public static Animal crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez(nombre,edad,genero);
        salmones++;
        return salmon;
    }

    public static Animal crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez(nombre,edad,genero);
        bacalaos++;
        return bacalao;
    }

    public ArrayList<Pez> getPeces() {
        return peces;
    }

    public void setPeces(ArrayList<Pez> peces) {
        this.peces = peces;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
