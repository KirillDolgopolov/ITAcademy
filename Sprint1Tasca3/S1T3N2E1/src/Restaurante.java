public class Restaurante implements Comparable<Restaurante> {
    private String nombre;
    private int puntuación;

    public Restaurante(String nombre, int puntuación) {
        this.nombre = nombre;
        this.puntuación = puntuación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", puntuación=" + puntuación +
                '}';
    }

    @Override
    public int compareTo(Restaurante o) {
        if (!this.nombre.equals(o.nombre)) {
            return this.nombre.compareTo(o.nombre);
        } else return o.puntuación-this.puntuación;
    }
}
