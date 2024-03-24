import java.util.Random;

public class AlgoritmosOrdenacaoTeste {
    
    public static void main(String[] args) {
        // Teste de desempenho
        int[] sizes = {100, 1000, 10000, 100000}; // Tamanhos dos arrays
        
        // Imprime cabeçalho da tabela para Bubble Sort
        System.out.println("Tabela para Bubble Sort:");
        System.out.println("Tamanho do Array\t| Bubble Sort (s)\t| Bubble Sort (ms)\t| Bubble Sort (µs)");
        System.out.println("-------------------------------------------------------------------------------------------");
        
        for (int size : sizes) {
            int[] arr = generateRandomArray(size); // Gera array aleatório
            
            // Teste com Bubble Sort
            long startTimeBubble = System.nanoTime(); // Inicia a contagem do tempo
            AlgoritmosOrdenacao.bubbleSort(arr); // Ordena o array com Bubble Sort
            long endTimeBubble = System.nanoTime(); // Finaliza a contagem do tempo
            double durationBubbleSeconds = (endTimeBubble - startTimeBubble) / 1e9; // Tempo em segundos
            double durationBubbleMilliseconds = (endTimeBubble - startTimeBubble) / 1e6; // Tempo em milissegundos
            double durationBubbleMicroseconds = (endTimeBubble - startTimeBubble) / 1e3; // Tempo em microsegundos
            System.out.printf("%d\t\t\t| %.9f\t\t| %.6f\t\t| %.3f\n", size, durationBubbleSeconds, durationBubbleMilliseconds, durationBubbleMicroseconds);
        }
        
        // Imprime cabeçalho da tabela para Quicksort
        System.out.println("\nTabela para Quicksort:");
        System.out.println("Tamanho do Array\t| Quicksort (s)\t| Quicksort (ms)\t| Quicksort (µs)");
        System.out.println("-------------------------------------------------------------------------------------------");
        
        for (int size : sizes) {
            int[] arr = generateRandomArray(size); // Gera array aleatório
            
            // Teste com Quicksort
            long startTimeQuick = System.nanoTime(); // Inicia a contagem do tempo
            AlgoritmosOrdenacao.quickSort(arr, 0, arr.length - 1); // Ordena o array com Quicksort
            long endTimeQuick = System.nanoTime(); // Finaliza a contagem do tempo
            double durationQuickSeconds = (endTimeQuick - startTimeQuick) / 1e9; // Tempo em segundos
            double durationQuickMilliseconds = (endTimeQuick - startTimeQuick) / 1e6; // Tempo em milissegundos
            double durationQuickMicroseconds = (endTimeQuick - startTimeQuick) / 1e3; // Tempo em microsegundos
            System.out.printf("%d\t\t\t| %.9f\t\t| %.6f\t\t| %.3f\n", size, durationQuickSeconds, durationQuickMilliseconds, durationQuickMicroseconds);
        }
    }

    
    // Método para gerar um array de inteiros aleatórios
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }
}