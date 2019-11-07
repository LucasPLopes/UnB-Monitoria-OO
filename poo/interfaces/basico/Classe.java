public class Classe implements Metodos {

    @Override
    public void exibirPublico() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo o método implementado");
    }

    @Override
    public A retornaClasseA() {
        // TODO Auto-generated method stub
        return new A();
    }

    @Override
    public int retornoInt() {

        return 17;
    }

}