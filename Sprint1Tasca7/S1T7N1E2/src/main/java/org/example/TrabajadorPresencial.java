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

    @Deprecated
    public void oldPresencialWorker() {
        System.out.println("Para ir al trabajo suelo montar un caballo");
    }

    @Override
    public Integer calcularSalario(Integer horas) {
        return horas * salarioPorHora + Benzina;
    }

}
