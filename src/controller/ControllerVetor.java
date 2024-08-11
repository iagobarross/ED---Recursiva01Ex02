/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
valor con�do neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;
*/
package controller;

public class ControllerVetor {

	public ControllerVetor() {
		super();
	}
	
	public int menorVet(int[] vet, int tamanho, int menorValor) {
		if(tamanho == 0) { 
			return menorValor; //Quando tamanho chegar a 0, significa que o vetor foi percorrido por completo e retorna o menor valor encontrado.
		} else if(vet[tamanho - 1] < menorValor) {
			menorValor = vet[tamanho - 1];
			return menorVet(vet, tamanho - 1, menorValor);//Quando é encontrado um valor menor que o atual, o valor é sobrescrito na variável e é chamada a função novamente decrescendo o tamanho(indice).
		} else {
			return menorVet(vet, tamanho - 1, menorValor);//Se o valor não for menor que o atual, chama-se a função novamente com tamanho(indice) anterior.
		}
	}

}
