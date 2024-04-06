public class Aluno {
    double n1;
    double n2;
    double n3;

    public double media(){
    double m = (n1+n2+n3)/3;
    return m;
    }

    public void condicao(){
        double m = media();
        System.out.println(m);
        if (m >= 7.0) {
            System.out.println("Você está Aprovado");
        } else if (m < 4.0) {
            System.out.println("Infelizmente você está Reprovado");
        } else {
            System.out.println("Está apto a fazer Final");
        }
    }
    }

