public class Filha extends Mae{

    private String herdeira;

    public Filha(String herdeira){
        super("Filha da Mãe");
        classe = "Filha";
        this.herdeira = herdeira;
    }
    public void chamadaMetodoPublic(){
        System.out.println("Método da Mãe ");
        super.metodoPublico();
        
        System.out.println("Método da Filha");
        metodoPublico();

    }
    public void chamadaMetodoProtegido(){
        metodoProtegido();
    }
    public void metodoPublico(){
        System.out.println("Filha:: Método Pública");
    }

    @Override
    public String toString() {
        return super.toString()+"Filha [herdeira=" + herdeira + "]";
    }

    
    
}