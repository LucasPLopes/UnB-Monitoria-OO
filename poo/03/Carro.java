public class Carro{
    //Propriedades
    String marca;
    String tipo;
    int passageiros;
    String combustivel;
    
    //Construtor default
    public Carro(){
        marca= "";
        tipo = "hatch";
        passageiros = 5;
        combustivel = "flex";
    }

    // Sobrecarga , assinatura = Carro(String,String,int,String)
    public Carro(String m, String tipo, int passageiros, String combustivel) {
        // o this aponta para propriedades 
        marca = m;
        this.tipo = tipo;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
    }
    
    
}