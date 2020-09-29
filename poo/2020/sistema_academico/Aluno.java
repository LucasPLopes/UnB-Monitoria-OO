package sistema_academico;

public class Aluno {
        String matricula;
        String nome;
        String sexo;
        String email;

        @Override
        public String toString() {
                return "Aluno [email=" + email + ", matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + "]";
        }

}
