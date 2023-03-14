public class Main {
    public static void main(String[] args) {
        Alunos aluno = new Alunos();

        aluno.setMatricula(99882);
        aluno.setNome("João");
        aluno.setNotaProva1(5);
        aluno.setNotaProva2(5);
        aluno.setNotaTrab(5);

        System.out.println("O valor da média final é: " + aluno.media());

       aluno.provaFinal(aluno.media());



    }
}