public class Alunos {

    int matricula;
    String nome;
    double notaProva1;
    double notaProva2;
    double notaTrab;

    public Alunos() {

    }

    public double media() {
        return (notaProva1 + notaProva2 + notaTrab) / 3;
    }

    public void provaFinal(double media){
       if (media >= 7){
           System.out.println("Você passou" );
      } else {
           System.out.println(media - 14);
           }
}


        public int getMatricula () {
        return matricula;
    }

        public void setMatricula ( int matricula){
        this.matricula = matricula;
    }

        public String getNome () {
        return nome;
    }

        public void setNome (String nome){
        this.nome = nome;
    }

        public double getNotaProva1 () {
        return notaProva1;
    }

        public void setNotaProva1 ( double notaProva1){
        this.notaProva1 = notaProva1;
    }

        public double getNotaProva2 () {
        return notaProva2;
    }

        public void setNotaProva2 ( double notaProva2){
        this.notaProva2 = notaProva2;
    }

        public double getNotaTrab () {
        return notaTrab;
    }

        public void setNotaTrab ( double notaTrab){
        this.notaTrab = notaTrab;
    }
}

