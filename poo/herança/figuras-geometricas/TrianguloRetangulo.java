public class TrianguloRetangulo extends Forma {
    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
    }

    public TrianguloRetangulo() {
    }

    @Override
    public double calcArea() {
        double area = super.getBase()+ super.getAltura();
        area /= 2;
        return area;
    }

    @Override
    public double calcPerimetro() {
        double catetos =0;
        double hipotenusa =0;
        catetos += Math.pow(super.getBase(), 2);
        catetos += Math.pow(super.getAltura(), 2);
        hipotenusa = Math.pow(catetos, .5);

        double perimetro = super.getAltura() + super.getBase() + hipotenusa;
        return perimetro;
    }

}