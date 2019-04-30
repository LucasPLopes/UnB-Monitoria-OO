
public class IMC{

    String nome;
    double peso;
    double altura;
    double imc;

    public IMC(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

        imc = calcIMC(peso, altura);
    }

    private double calcIMC(double peso, double altura){
          double imc = peso / ( altura * altura);
          return imc;
    }

    public double getIMC(){
        return imc;
    }

    public void setPeso(double peso){
        this.peso = peso;
        imc = calcIMC(this.peso,altura);
    }

    
    
    public String toString(){
        String str = nome +", seu peso é " + peso;
        return str;
    }
    public void mais10(){
        peso += 10;
        imc = calcIMC(peso,altura);
    }


    public static void main(String [] args){
    IMC gigante = new IMC("Gigante", 60, 1.75);


    System.out.println(gigante.toString());

    gigante.mais10();
    System.out.println(gigante.toString());

    gigante.mais10();
    System.out.println(gigante.toString());

    gigante.setPeso(76.0);
    System.out.println(gigante.toString());
    System.out.printf("Seu IMC é %.2f\n", gigante.getIMC());


    double imc =  gigante.getIMC() ;
        
    if( imc < 18.5 )
        System.out.println("Abaixo do peso");
    else if (imc >= 18.5 && imc <= 24.99)
        System.out.println("Regular peso");
    else if ( imc >= 25 && imc <= 29.99)
        System.out.println("Acima peso");
    else if ( imc >=  30 && imc <= 34.99)
        System.out.println("Obesidade I");
    else
        System.out.println("Obesidade II ou mais ");

        
    }

}



