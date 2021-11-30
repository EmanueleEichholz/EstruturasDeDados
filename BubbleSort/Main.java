public class Main {
    public static void main(String[] args) {

        int vetor[] = {3,6,8,1,4,9,0};

        for(int i=0; i < vetor.length; ++i){

        }

        System.out.println("---- Vetor desordenado ----");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        int pos_menor, aux;
        for(int i=0; i < vetor.length; i++){
            pos_menor = i;
            for(int j = i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[pos_menor]){
                    pos_menor = j;
                }
            }
            aux = vetor[pos_menor];
            vetor[pos_menor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("\n---- Ordenação do vetor - Selection Sort ----");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}