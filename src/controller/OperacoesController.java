package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public int fat(int n) {
		/* N! = N * (N - 1)!= N * (N - 1) * (N - 2)!
		...
		= N * (N - 1) * ... * 3 * 2 * 1!
		O ponto de parada será o número 1, retornando um para a função
		*/
		if(n == 1) {
			return 1;
		}
		/*Faremos a recursividade retornando o valor de n multiplicado 
		pela função do número anterior a n. */
		else{
			return n * fat(n - 1);
		}
	}
}
