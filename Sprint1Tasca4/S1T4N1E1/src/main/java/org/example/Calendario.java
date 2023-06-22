package org.example;

import java.util.ArrayList;

public class Calendario {
    private ArrayList<String> meses = new ArrayList<>();

    public Calendario() {
        addMeses();
    }

    private void addMeses() {
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Deciembre");
    }

    public ArrayList<String> getMeses() {
        return meses;
    }

    public int sizeOfArray() {
        return meses.size();
    }

    public boolean arrayIsEmpty() {
        return meses.isEmpty();
    }

    public String getPosicion(int number) {
        return meses.get(number - 1);
    }
}
