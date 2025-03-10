import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n1, n2, n3;

        System.out.print("digite o primeiro numero: ");
        n1 = leitor.nextInt();

        System.out.print("digite o segundo numero: ");
        n2 = leitor.nextInt();

        System.out.print("digite o terceiro numero: ");
        n3 = leitor.nextInt();

        int maior = Math.max(n1, Math.max(n2, n3));

        System.out.print("este é o maior número: " + maior);
    }    
}
