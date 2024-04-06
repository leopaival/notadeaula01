import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //numero
        Scanner sc2 = new Scanner(System.in); //String
        Inss inss = new Inss();

        String r = "s";
        while(r.equalsIgnoreCase("s")){
            System.out.println("Preencha as Informações");
            System.out.println("Matricula: ");
            inss.matricula = sc.nextInt();
            System.out.println("Nome completo: ");
            inss.nome = sc2.nextLine();
            System.out.println("Seu salário bruto é: ");
            inss.bruto = sc.nextDouble();

            System.out.println("Suas Informações: ");
            inss.Funcionario();

            System.out.println("Deseja Cadastrar outro Funcionario? ");
            r = sc2.nextLine();


        }



    }
}