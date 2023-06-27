package org.example;

import java.io.Serializable;

@DefaultDirectory(path = "src\\main\\java\\JSON.txt")
public class Person implements Serializable {
    String nombre;

    public Person(String nombre) {
        this.nombre = nombre;
    }




}
