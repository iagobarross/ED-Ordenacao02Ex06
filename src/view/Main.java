/*6. Criar um projeto Java que receba as bibliotecas BubbleSort, MergeSort e QuickSort. O projeto deve
prever um vetor com 1500 posições ({1499, 1498, 1497, ..., 0}) e apresentar o tempo de ordenação para
cada um dos métodos.
*/
package view;

import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;
import br.edu.fateczl.quicksort.QuickSort;

public class Main {

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		int[] vetor1 = new int[1500];
		int[] vetor2 = new int[1500];
		int[] vetor3 = new int[1500];
		
		for(int i = 0; i < 1500; i++) {
			vetor1[i] = 1499 - i;
			vetor2[i] = 1499 - i;
			vetor3[i] = 1499 - i;
		}
		
		double tempoInicialBubble = System.nanoTime();
		bubble.Bubble(vetor1);
		double tempoFinalBubble = System.nanoTime();
		double tempoTotalBubble = (tempoFinalBubble - tempoInicialBubble) / Math.pow(10, 9);
		
		
		
		double tempoInicialMerge = System.nanoTime();
		merge.Merge(vetor2, 0, 1499);
		double tempoFinalMerge = System.nanoTime();
		double tempoTotalMerge = (tempoFinalMerge - tempoInicialMerge) / Math.pow(10, 9);
		
		double tempoInicialQuick = System.nanoTime();
		quick.quick(vetor3, 0, 1499);
		double tempoFinalQuick = System.nanoTime();
		double tempoTotalQuick = (tempoFinalQuick - tempoInicialQuick) / Math.pow(10, 9);
		
		System.out.println("Bubble Sort: " + tempoTotalBubble + "s");
		System.out.println("\nMerge Sort: " + tempoTotalMerge + "s");
		System.out.println("\nQuick Sort: " + tempoTotalQuick + "s");
		
		
		
	}

}
