import javax.swing.JOptionPane;

public class ado5 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double valor;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:"));

        if (idade <= 10) {
            valor = 30.00;
        } else if (idade <= 29) {
            valor = 60.00;
        } else if (idade <= 45) {
            valor = 120.00;
        } else if (idade <= 59) {
            valor = 150.00;
        } else if (idade <= 65) {
            valor = 250.00;
        } else {
            valor = 400.00;
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nValor: R$ " + valor);

    }
}
