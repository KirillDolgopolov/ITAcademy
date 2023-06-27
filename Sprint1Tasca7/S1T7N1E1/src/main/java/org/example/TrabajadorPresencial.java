package org.example;

public class TrabajadorPresencial extends Trabajador {
    private static Integer Benzina;

    public TrabajadorPresencial(String nombre, String apellido, Integer salarioPorHora) {
        super(nombre, apellido, salarioPorHora);
    }

    public static Integer getBenzina() {
        return Benzina;
    }

    public static void setBenzina(Integer benzina) {
        Benzina = benzina;
    }

    @Override
    public Integer calcularSalario(Integer horas) {
        return horas * salarioPorHora + Benzina;
    }

}
