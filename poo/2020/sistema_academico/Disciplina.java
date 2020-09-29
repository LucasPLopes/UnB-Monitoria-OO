package sistema_academico;
import java.util.*;


public class Disciplina{
    String nome;
    String codigo;
    Integer cargaHoraria;
    
    List<Turma> turmas = new ArrayList<Turma>();
    
    Turma criarTurma(){
        Turma nova = new Turma();
        nova.codigo  = "T" +  (turmas.size() +1);
        turmas.add(nova);
        return turmas.get(turmas.size() -1);
    }

    void imprimirRelatorio(){
        System.out.println(("Turmas cadastradas"));
        for(Turma t : turmas){
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "Disciplina [cargaHoraria=" + cargaHoraria + ", codigo=" + codigo + ", nome=" + nome + ", turmas="
                + turmas + "]";
    }    
}