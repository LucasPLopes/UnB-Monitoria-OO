


class Dolar{
    private double cotacao;
    public static double IOF;

    Dolar( double cotacao){
        this.cotacao = cotacao;
    }

    public double  convertToReal(double valor){
           double conversao;
           conversao =   (cotacao * valor) *( 1 + IOF/100.0);
           return conversao;

    }

    public static void main(String [] args)
    {
        Dolar hoje = new Dolar ( 4.00);
        Dolar.IOF = 6;
      
        double reais = hoje.convertToReal(100);

        System.out.println("Quanto sairá sua cotação: "+ reais );

    }
    
}
