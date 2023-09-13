package modelo;

public class Persona {
//atributos de la clase
private String dni, nombre, apellidos;
private int añonacimiento;

//metodos de la clase//
public void mostrarNombre() {
     System.out.println(nombre + " " + apellidos);

}

public void setDni(String dni) {
    this.dni = dni;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public void setAñonacimiento(int añonacimiento) {
    this.añonacimiento = añonacimiento;
}


public String getDni() {
    return dni;
}

public String getNombre() {
    return nombre;
}

public String getApellidos() {
    return apellidos;
}

public int getAñonacimiento() {
    return añonacimiento;
}




}
