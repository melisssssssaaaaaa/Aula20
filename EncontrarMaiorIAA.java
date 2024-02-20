package aula20;

public static void encontrarMaiorIAA(ArrayList<Aluno> alunos) {
    if (alunos.isEmpty()) {
        System.out.println("Nenhum aluno cadastrado.");
    } else {
        double maiorIAA = alunos.get(0).iaa;
        String nomeMaiorIAA = alunos.get(0).nome;

        for (Aluno aluno : alunos) {
            if (aluno.iaa > maiorIAA) {
                maiorIAA = aluno.iaa;
                nomeMaiorIAA = aluno.nome;
            }
        }

        System.out.println("O aluno com maior IAA é " + nomeMaiorIAA + " com IAA de " + maiorIAA + ".");
    }
}
}
