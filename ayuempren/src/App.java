import java.util.ArrayList;
import java.util.List;

import modelo.Autobus;
import modelo.Cuenta;
import modelo.Persona;
import modelo.Turismo;
import modelo.Vehiculo;

public class App {
    public static void main(String[] args) {
Persona p1 = new Persona();
Persona p2 = new Persona();
//dandole valores a los atributos //
p1.setNombre("juan");
p1.setApellidos("gonzalez");
p2.setNombre("luis");
p2.setApellidos("Gomez");
//p1.nombre = "Juan";
//p1.apellidos = "Gonzalez";
//p2.nombre = "Luis";
//p2.apellidos = "Gómez";
//p1.mostrarNombre();
//p2.mostrarNombre();
p1.mostrarNombre();
p2.mostrarNombre();

Cuenta miCuenta1 = new Cuenta();
Cuenta miCuenta2 = new Cuenta(6000);
System.out.print("Limite cuenta 1 (normal): ");
System.out.println(miCuenta1.getlimiteCredito());
System.out.print("Limite cuenta 2 (vip): ");
System.out.println(miCuenta2.getlimiteCredito());

String pi = new String("3.141592");
System.out.println(pi+1);
System.out.println(pi+1);


    List listaVehiculos = new ArrayList();

    listaVehiculos.add(new Vehiculo("mercedes","E",55));
    listaVehiculos.add(new Autobus("mercedes","M20",100,20));
    listaVehiculos.add(new Turismo("BMW","525",50,4));
    listaVehiculos.add(new Turismo("Audi","A4",55,4));
    listaVehiculos.add(new Autobus("mercedes","M10",120,30));
    listaVehiculos.add(new Turismo("VW","Passat",35,4));
    listaVehiculos.add(new Turismo("Audi","A3",30,2));
    listaVehiculos.add(new Turismo("mercedes","E",60,4));
    listaVehiculos.add(new Vehiculo("Audi","A3",30));
    imprimirElementosLista((ArrayList)listaVehiculos);

 }

    private static void imprimirElementosLista(ArrayList listaVehiculos) {
        for(int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo v = (Vehiculo)listaVehiculos.get(i);
            v.imprimirAtributos();
            System.out.println("");
        }
    }
 }


