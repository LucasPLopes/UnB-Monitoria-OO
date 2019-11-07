public class Main {
    public static void main(String[] args) {
        Classe minhaClasse = new Classe();
        A minhaA = null;

        minhaClasse.exibirPublico();
        minhaA = minhaClasse.retornaClasseA();


        //criação da interface e implementação
        Poder meuPoder = new Poder() {
            @Override
            public void superPoder() {
                System.out.println("Time Manipulation ativado");
            }
        };

        meuPoder.superPoder();

    }

}
