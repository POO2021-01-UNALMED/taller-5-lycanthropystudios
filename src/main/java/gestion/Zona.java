package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona extends Zoologico{
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal>animales;

    public Zona() {
        animales = new ArrayList<Animal>();
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }

    public int cantidadAnimales(){

        return animales.size();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
    public ArrayList getZona() {
        return this.getZona();
    }
    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
}
