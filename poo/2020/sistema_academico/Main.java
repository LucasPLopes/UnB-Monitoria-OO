package sistema_academico;

public class Main{
    public static void main(String[] args) {
        
        Aluno  aluno01 = new Aluno();
        aluno01.nome = "Larissa";
        aluno01.sexo = "F";
        aluno01.matricula ="150137290";
        aluno01.email = "150137290@aluno.unb.br";


        Professor prof01 = new Professor();
        prof01.nome = "Andre";
        prof01.email = "andre@email";
        prof01.matricula = "P01";
        prof01.sexo = "M";

        Professor prof02 = new Professor();
        prof02.nome = "Erica";
        prof02.email = "erica@email";
        prof02.matricula = "P02";
        prof02.sexo = "F";


        Universidade unb = new Universidade();

        Disciplina oo = new Disciplina();
        oo.nome = "Orientacao a objetos";
        oo.cargaHoraria = 60;
        oo.codigo = "195341";
        Turma turmaOO = oo.criarTurma();
        turmaOO.capacidadeMaxima = 60;
        turmaOO.setProfessor(prof01);
        turmaOO.matricularAluno(aluno01);

        Disciplina ed = new Disciplina();
        ed.nome = "Estrutura de dados";
        ed.cargaHoraria = 60;
        ed.codigo = "195342";
        Turma turmaED = ed.criarTurma();
        turmaED.capacidadeMaxima = 80;
        turmaED.setProfessor(prof02);
        turmaED.matricularAluno(aluno01);




        unb.criarDisciplina(oo);
        unb.criarDisciplina(ed);

        System.out.println("Disciplinas cadastradas na UnB");
        for(Disciplina d :unb.disciplinas){
            System.out.println("Disciplina: "+ d.nome + " | codigo: "+d.codigo +" | carga: "+ d.cargaHoraria);
        }

        oo.imprimirRelatorio();
        ed.imprimirRelatorio();


        
    }
}