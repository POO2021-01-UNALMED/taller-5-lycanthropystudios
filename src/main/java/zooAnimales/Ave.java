package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal {
    public static ArrayList<Ave> aves = new ArrayList<Ave>();;

    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave() {
        aves.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPLumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPLumas;
        aves.add(this);
    }


    public Ave(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }
    public String movimiento(){
        return "volar";
    }

    public static int cantidadAves(){
        return aves.size();
    }

    public static Animal crearHalcon(String colorPlumas, int edad, String genero) {
        Ave halcon = new Ave(colorPlumas,edad,genero);
        halcones++;
        return halcon;
    }

    public static Animal crearAguila(String colorPlumas, int edad, String genero) {
        Ave aguila = new Ave(colorPlumas,edad,genero);
        aguilas++;
        return aguila;
    }

    public ArrayList<Ave> getAves() {
        return aves;
    }

    public void setAves(ArrayList<Ave> aves) {
        this.aves = aves;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPLumas) {
        this.colorPlumas = colorPLumas;
    }
}
