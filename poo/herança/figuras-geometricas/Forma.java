public abstract class Forma{
    private double base, altura;
    public abstract double calcArea();
    public abstract double calcPerimetro();
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Forma(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Forma() {
    }

    @Override
    public String toString() {
        return "Forma [altura=" + altura + ", base=" + base + "]";
    }    
}