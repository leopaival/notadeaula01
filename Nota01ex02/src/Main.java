import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Coloque suas Notas");
        System.out.println("Digite sua primeira nota: ");
        aluno.n1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        aluno.n2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        aluno.n3 = sc.nextDouble();

        aluno.condicao();
    }
}