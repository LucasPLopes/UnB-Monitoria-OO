public class Main{
    public static void main(String[] args) {
        Mae mae = new Mae("Maria");
        Filha filha = new Filha("Ana");
        
        System.out.println("Chamada métodos públicos");
        mae.metodoPublico();
        filha.metodoPublico();
        System.out.println();

        System.out.println("filha.chamadaMetodoPublic()");
        filha.chamadaMetodoPublic();
        System.out.println();

        System.out.println("filha.chamadaMetodoProtegido()");
        filha.chamadaMetodoProtegido();


    }
}