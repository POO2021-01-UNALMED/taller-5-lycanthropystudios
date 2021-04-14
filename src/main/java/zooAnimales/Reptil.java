package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    public static ArrayList<Reptil> reptiles = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        reptiles.add(this);
    }
    public String movimiento(){
        return "reptar";
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoInt) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoInt;
    }

    public Reptil(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    public static int cantidadReptil(){
        return reptiles.size();
    }

    public static Animal crearIguana(String nombre, int edad, String genero) {
        Reptil iguana = new Reptil(nombre, edad, genero);
        iguanas++;
        return iguana;
    }

    public static Animal crearSerpiente(String nombre, int edad, String genero) {
        Reptil serpiente = new Reptil(nombre, edad, genero);
        serpientes++;
        return serpiente;
    }

    public ArrayList<Reptil> getReptiles() {
        return reptiles;
    }

    public void setReptiles(ArrayList<Reptil> reptiles) {
        this.reptiles = reptiles;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void getLargoCola(int largoInt) {
        this.largoCola = largoInt;
    }
}
