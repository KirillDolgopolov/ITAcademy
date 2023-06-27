package org.example;

public class TrabajadorOnline extends Trabajador {

    public TrabajadorOnline(String nombre, String apellido, Integer salarioPorHora) {
        super(nombre, apellido, salarioPorHora);
    }

    private static Integer tarifaInternet;

    public static Integer getTarifaInternet() {
        return tarifaInternet;
    }

    public static void setTarifaInternet(Integer tarifaInternet) {
        TrabajadorOnline.tarifaInternet = tarifaInternet;
    }

    @Override
    public Integer calcularSalario(Integer horas) {
        return horas * salarioPorHora + tarifaInternet;
    }
}
