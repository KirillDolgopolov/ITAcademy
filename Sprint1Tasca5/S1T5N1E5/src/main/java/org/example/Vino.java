package org.example;

import java.io.Serializable;

public class Vino implements Serializable {
    private String tipo;
    private boolean epumoso;
    private String DO;
    private String Bodega;
    private String nombre;
    private int año;

    public Vino(String tipo, boolean epumoso, String DO, String Bodega, String nombre, int año) {
        this.tipo = tipo;
        this.epumoso = epumoso;
        this.DO = DO;
        this.Bodega = Bodega;
        this.nombre = nombre;
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEpumoso() {
        return epumoso;
    }

    public void setEpumoso(boolean epumoso) {
        this.epumoso = epumoso;
    }

    public String getDO() {
        return DO;
    }

    public void setDO(String DO) {
        this.DO = DO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "tipo='" + tipo + '\'' +
                ", epumoso=" + epumoso +
                ", DO='" + DO + '\'' +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                '}';
    }
}
