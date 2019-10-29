public class Cachorro extends Object{
    String raca; // propriedades
    int patas;
    char genero;
    int idade;
    String nome;
    public Cachorro(){
        patas = 4;
        genero = 'M';
        idade  = 0;
        nome = "";
        raca = "Vira-Lata";

    }
    public String  late(){
        return  "woof"; //retorno vazio
    }  //métodos
    public void brinca(){}
    public void morder(){}

    @Override // sobreescrita
    public String toString() {
        return "Cachorro [genero=" + genero + ", idade=" + idade + ", nome=" + nome + ", patas=" + patas + ", raca="
                + raca + "]";
    }
    

}