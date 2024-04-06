public class Inss {
    int matricula;
    String nome;
    double bruto;

    public double desconto(){
        return bruto * 0.15;
    }
    public double liquido(){
       double imposto = desconto();
       return bruto - imposto;
    }
    public void Funcionario(){
        System.out.println("Matricula é: "+matricula);
        System.out.println("Nome completo: "+nome);
        System.out.println("Seu salario bruto é: "+bruto);
        System.out.println("Seu desconto do INSS é: "+desconto());
        System.out.println("Seu salário liquído deduzido imposto é: "+liquido());
    }

}
