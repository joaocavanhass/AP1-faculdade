import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        int valorA, valorB, valorC;

        System.out.print("digite o valor do primeiro lado: ");
        valorA = leitor.nextInt();

        System.out.print("digite o valor do segundo lado: ");
        valorB = leitor.nextInt();

        System.out.print("digite o valor do terceiro lado: ");
        valorC = leitor.nextInt();

        // ( A >= (B+ C) ou B >=(A+C) ou C >= (B+A) )
        if (valorA >= (valorB + valorC) || valorB >= (valorA + valorC) || valorC >= (valorA + valorB)) {
            System.out.print("não é um triagulo");
        } else {
            if (valorA == valorB && valorB == valorC) {
                System.out.print("o tringulo é equilatero");
            } else if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
                System.out.print("o tringulo é isósceles");
            } else {
                System.out.print("o trinagulo é escaleno");
            }
        }
        
    }
}
