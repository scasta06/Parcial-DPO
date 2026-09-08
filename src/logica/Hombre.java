package logica;
public class Hombre extends Perona
{
    public Hombre(double peso, double altura, int edad)
    {
        super(peso, altura, edad);
    }
    @Override
    public boolean cumpleCondiciones()
    {
        return getPeso() >= 60 && getPeso() <= 110 && getAltura() >= 160 && getAltura() <= 195 && getEdad() > 15;
    }
    @Override
    public double calcularTMB()
    {
        return 88.36  + (13.397 * getPeso())+ (4.799 * getAltura())- (5.677 * getEdad());
    }
}
	
