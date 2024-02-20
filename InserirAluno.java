package aula20;

public static void inserirAluno(ArrayList<Aluno> alunos, Scanner scanner) {
    System.out.print("Nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.print("IAA do aluno: ");
    double iaa = scanner.nextDouble();
    scanner.nextLine(); // Limpar o buffer do scanner

    System.out.print("Curso do aluno (COMPUTACAO, ENGENHARIA, ADMINISTRACAO): ");
    Curso curso = Curso.valueOf(scanner.nextLine().toUpperCase());

    Aluno aluno = new Aluno(nome, iaa, curso);
    alunos.add(aluno);
    System.out.println("Aluno inserido com sucesso!");
   }
}