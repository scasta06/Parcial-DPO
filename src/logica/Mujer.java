package logica;
public class Mujer extends Perona
{
    public Mujer(double peso, double altura, int edad)
    {
        super(peso, altura, edad);
    }
    @Override 
    public boolean cumpleCondiciones()
    {
        return getPeso() >= 40 && getPeso() <= 80 && getAltura() >= 140 && getAltura() <= 180 && getEdad() > 15;
    }
    @Override
    public double calcularTMB()
    {
        return 447.593 + (9.247 * getPeso()) + (3.098 * getAltura())- (4.33 * getEdad());
    }
}