/*	Nome: Ronan Jorge
 * 	Data: 26/02/2023
 * 	Objetivo: 01) Crie uma função recursiva que exiba o resultado do fatorial de um
	número (Pela limitação da recursividade, o número de entrada deverá
	ser baixo para não dar estouro(limite de entrada = 12)):
 */

package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = 0;
		while(n < 1 || n > 12) {
			int m = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n:"));
			n = m;
			if(n < 1 || n > 12) {
				JOptionPane.showMessageDialog(null, "Entre com um valor inteiro de 1 a 12.");
			}
		}
		System.out.println("O fatorial de n é "+ op.fat(n));
	}
}
