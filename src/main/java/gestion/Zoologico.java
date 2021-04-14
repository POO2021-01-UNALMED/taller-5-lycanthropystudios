package gestion;

import java.util.ArrayList;
import java.util.Map;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona>zonas;

    public Zoologico() {
        zonas = new ArrayList<Zona>();
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        int r = 0;
        for (Zona temp:zonas) {
            r = r + temp.cantidadAnimales();
            //System.out.println(r);
        }
        return r;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    /**
     *get zonas zoologico
     * @return
     */
    public ArrayList<Zona> getZona() {
        return zonas;
    }
}
