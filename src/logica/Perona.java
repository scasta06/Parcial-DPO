package logica;
public abstract class Perona {
    private double peso;
    private double altura;
    private int edad;
    public Perona(double peso, double altura, int edad)
    {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }
    public double getPeso()
    {
        return peso;
    }
    public double getAltura()
    {
        return altura;
    }
    public int getEdad()
    {
        return edad;
    }
    public abstract boolean cumpleCondiciones();
    public abstract double calcularTMB();
}