import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] vetor = {3, 6, 8, 1, 4, 9, 0};
		int tamanho = vetor.length;
		System.out.println("O vetor original é: "+ (Arrays.toString(vetor)));
		selectionSort(vetor, tamanho);
		System.out.println("O vetor ordenado é: "+ (Arrays.toString(vetor)));
	}
	
	private static void selectionSort(int[] vetor, int tamanho) {
		int menor; 
		int auxiliar;
	    for (int i = 0; i < vetor.length-1; i++) {
	        menor = i;
	        for (int j = (i+1); j < vetor.length; j++) {
	            if (vetor[j] < vetor[menor]) {
	                menor = j;
	            }
	        }
	        if (vetor[i] != vetor[menor]) {
	            auxiliar = vetor[i];
	            vetor[i] = vetor[menor];
	            vetor[menor] = auxiliar;
	        }
	      informa(vetor, menor, i);
	    }
	}

	private static void informa(int[] vetor, int menor, int i) {
		System.out.println("Troquei o " +  vetor[menor] + " de lugar com o " + vetor[i] + ". O vetor ficou assim: "  + Arrays.toString(vetor));
	}
}
