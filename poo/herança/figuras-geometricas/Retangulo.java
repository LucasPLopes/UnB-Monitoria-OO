public class Retangulo extends Forma {

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    public Retangulo() {
        super(0, 0);
    }

    public double calcArea() {
        return super.getBase() * super.getAltura();
    }
    @Override   

    public double calcPerimetro() {
        return 2 * super.getAltura() + 2 * super.getBase();
    }

    @Override
    public String toString() {
        return "Retangulo ["+super.toString()+"]";
    }

    
}