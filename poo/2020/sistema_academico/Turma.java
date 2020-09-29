package sistema_academico;
import java.util.*;


public class Turma {
    Professor professor;
    String codigo;
    Integer capacidadeMaxima;
    List<Aluno> alunos = new ArrayList<Aluno>();


    Professor setProfessor(Professor p){
        professor = p;
        return p;
    }

    void matricularAluno(Aluno a){
        alunos.add(a);
    }

    @Override
    public String toString() {
        return "Turma [alunos=" + alunos + ", capacidadeMaxima=" + capacidadeMaxima + ", codigo=" + codigo
                + ", professor=" + professor + "]";
    }


    
}
