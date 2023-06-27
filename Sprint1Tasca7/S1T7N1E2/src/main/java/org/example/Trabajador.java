package org.example;

public class Trabajador {
    private String nombre;
    private String apellido;
    protected Integer salarioPorHora;

    public Trabajador(String nombre, String apellido, Integer salarioPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioPorHora = salarioPorHora;
    }

    public Integer calcularSalario(Integer horas) {
        return horas * salarioPorHora;
    }

}
