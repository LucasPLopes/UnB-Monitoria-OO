package imc;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		double altura, peso;
		String resposta, nome;
		Pessoa p;
		
		try {
			nome = JOptionPane.showInputDialog("Qual o seu nome: ");

			resposta = JOptionPane.showInputDialog("Qual é a sua altura: ");
			altura = Double.parseDouble(resposta);

			resposta = JOptionPane.showInputDialog("Qual o seu peso:");
			peso = Double.parseDouble(resposta);

			p = new Pessoa(nome, altura, peso);
			p.calcIMC();

			JOptionPane.showMessageDialog(null, p.toString());

		} catch (Exception e) {
			System.out.println("algum dado não foi preenchido ou foi fechado");
		}

	}

}
