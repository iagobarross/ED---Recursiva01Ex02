package view;

import controller.ControllerVetor;

public class Principal {

	public static void main(String[] args) {
		ControllerVetor contVet = new ControllerVetor();
		int[] vet = {5, 3, 8, 2, 9};
		int tamanho = vet.length;
		int menorValor = vet[tamanho - 1];
		
		int resultadoMenor = contVet.menorVet(vet, tamanho, menorValor);
		System.out.println("O menor valor encontrado no vetor é: " + resultadoMenor);

	}

}