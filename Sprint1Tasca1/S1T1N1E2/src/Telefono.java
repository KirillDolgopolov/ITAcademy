public class Telefono {
    private String marca;
    private String model;

    public Telefono(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }

    public void trucar (int numero){
        System.out.println("Está llamando al numero: "+numero);
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
