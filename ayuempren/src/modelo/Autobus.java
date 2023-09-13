package modelo;

public class Autobus extends Vehiculo {
    private int numplazas;

    public Autobus (String marca, String modelo, double precioAlquiler, int numplazas) {
        super(marca, modelo, precioAlquiler);
        setNumplazas(numplazas);
    }

    public int getNumplazas() {
        return numplazas;
    }

    public void setNumplazas(int numplazas) {
        this.numplazas = numplazas;
    }
    public void imprimirAtributos() {
        super.imprimirAtributos();
        System.out.print("\t"+ "puertas: "+ numplazas);
    }
}
