package modelo;

public class Cuenta {
    private double saldo, limitecredito;
    public static final double LIMITE = 500;
public void ingresar(double cantidad) {
    saldo += cantidad;
}
public void retirara(double cantidad) {
    saldo -= cantidad;
}
public  void setlimiteCredito(double cantidad) {
    limitecredito = cantidad;
}
public double getlimiteCredito() {
    return limitecredito;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

//constructor por defecto //
public Cuenta (){
    this.saldo = 0;
    this.limitecredito = LIMITE;
}
//constructor parametrizado
public Cuenta(double limiteCredito){
    this.saldo = 0;
    this.limitecredito = limiteCredito;
}
}
