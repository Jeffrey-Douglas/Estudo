package EntendendoObject;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da Comptação");
        double[] notas= {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 ="asdasdd";
        String s2 ="asdasdd";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Comptação");
        double[] notas2= {10, 9, 6, 7};
        aluno2.setNotas(notas);

        System.out.println(aluno.equals(aluno2));


    }
}
