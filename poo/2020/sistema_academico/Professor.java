package sistema_academico;

public class Professor{
    String matricula;
    String nome;
    String sexo;
    String email;

    @Override
    public String toString() {
        return "Professor [email=" + email + ", matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + "]";
    }


}