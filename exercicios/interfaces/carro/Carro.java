public class Carro implements Turbo {
    
    private int limite;
    private int velocidadeAtual;

    public Carro(int limite, int velocidadeAtual) {
        this.limite = limite;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void exibirOdometro(){
        System.out.println("Odometro: "+velocidadeAtual+ " Km/H");
    }
    public void acelerar(){
        if(velocidadeAtual < limite){
            if(limite - velocidadeAtual >= 5)
                velocidadeAtual +=5;
            else
                velocidadeAtual+= limite-velocidadeAtual;
        }
        System.out.println("Velocidade: "+velocidadeAtual+ " Km/H");
    }
    @Override
    public void ativarTurbo() {
        if(velocidadeAtual < limite){
            if(limite - velocidadeAtual >= 10)
                velocidadeAtual +=10;
            else
                velocidadeAtual+= limite-velocidadeAtual;
        }
        System.out.println("Velocidade(turbo): "+velocidadeAtual+ " Km/H");

    }
    
}