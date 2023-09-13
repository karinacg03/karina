package modelo;

public class Vehiculo {
private String marca, modelo;
private double precioAlquiler;
public Vehiculo() {

}
public Vehiculo(String marca, String modelo, double precioAlquiler) {
this.marca = marca;
this.modelo = modelo;
this.precioAlquiler = precioAlquiler;
}
public void setPrecioAlquiler(double precioAlquiler) {
    this.precioAlquiler = precioAlquiler;
}
public void imprimirAtributos (){
    System.out.print("modelo:"+ marca +" "+ modelo +"/t"+"precio:"+ precioAlquiler);
}
public String getMarca() {
    return marca;
}
public String getModelo() {
    return modelo;
}
public double getPrecioAlquiler() {
    return precioAlquiler;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}

}