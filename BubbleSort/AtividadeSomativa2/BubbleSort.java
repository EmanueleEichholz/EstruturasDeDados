import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] vetor = {3, 6, 8, 1, 4, 9, 0};
		int tamanho = vetor.length;
		System.out.println("O vetor original é: " + (Arrays.toString(vetor)));
		bubbleSort(vetor, tamanho);
		System.out.println("O vetor ordenado é: " + (Arrays.toString(vetor)));
	}
	
	public static void bubbleSort(int[] vetor, int tamanho) {
		if (tamanho <= 1) return;
		for(int i=0; i < (tamanho-1); i++) {
			if (vetor[i] > vetor[i+1]) {
				int auxiliar = vetor[i];
				vetor[i] = vetor[i+1];
				vetor[i+1] = auxiliar;
				informa(vetor, i);
			}
		}
		bubbleSort(vetor, tamanho-1);
	}
		
	private static void informa(int[] vetor, int i) {
		System.out.println("Inverti de posição o número " + vetor[i+1] + " com o número " + vetor[i] + " e o vetor ficou assim:  " + (Arrays.toString(vetor)));
	}

}
