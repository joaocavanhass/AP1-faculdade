import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String mensagem = null;
		double numLados, medLados;

		System.out.print("Digite o numero de lados: ");
		numLados = leitor.nextDouble();

		System.out.print("Digite a medida dos lados: ");
		medLados = leitor.nextDouble();

		if ( numLados == 3 ) {
			double area, p;
			p = (3 * medLados) /2;
			area = Math.sqrt(p * (p - medLados)*(p - medLados)*(p - medLados));
			mensagem = "triangulo " + area;
		}
		else if (numLados == 4) {
			double area;
			area = numLados * medLados;
			mensagem = "quadrado " + area;
		}

		else if (numLados == 5) {
			double perimetro = 5 * medLados;
			double apotema = medLados / (2 * perimetro);
			double area = (perimetro * apotema) / 2;
			mensagem = "pentagono " + area;
		}

		else if (numLados < 3) {
			mensagem = "nao e um poligono";
		}

		else {
			mensagem = "poligono nao identificado";
		}

		String saida;
		saida = String.format("%s", mensagem);
		System.out.print(saida);

	}
}