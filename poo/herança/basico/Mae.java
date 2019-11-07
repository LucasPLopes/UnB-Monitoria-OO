public class Mae{
    private String nome;
    protected String  classe;

    public Mae(String nome) {
        this.nome = nome;
        this.classe = "Mãe";
    }

    protected void metodoProtegido(){
        System.out.println("Mãe::Método protegido");
    }
    private void metodoPrivado(){
        System.out.println("Mãe::Método privado");
    }
    public void metodoPublico(){
        System.out.println("Mãe:: Método público");
    }

    @Override
    public String toString() {
        return "Mae [classe=" + classe + ", nome=" + nome + "]";
    }
    

}