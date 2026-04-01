package com.indicesnodoserecursao.insercaoordenada;

public class InsertionSort {
    public static void insertionSort(char[] a) {
        int n = a.length;

        for(int i = 1; i < n; i++) {
            char current = a[i]; //  Você "pega" a carta atual da mesa.
            int j = i - 1; // Aponta para a última carta já ordenada na sua mão.

            while((j >= 0) && (a[j] > current)) { // Enquanto a carta na mão for maior que a carta atual:
                a[j + 1] = a[j--]; // Empurra essa carta uma posição para a direita, abrindo espaço. O j-- já decrementa j após a leitura.
            }

            a[j + 1] = current; // Encaixa a carta atual no espaço aberto.
        }
    }

    public static void main(String[] args) {
        char[] a = {'d', 'a', 'c', 'b', 'e'};

        insertionSort(a);
        /*
            1- pega 'a' (segunda carta) e compara com 'd' (primeira carta). 
                1.1- 'a' é menor, então 'd' é empurrada para a direita e 'a' é colocada na primeira posição.
            2- pega 'c' (terceira carta) e compara com 'd' (agora na segunda posição). 
                2.1- 'c' é menor, então 'd' é empurrada para a direita. 
                2.2- Depois, 'c' é comparada com 'a' (primeira posição). 'c' é maior que 'a', então 'c' é colocada na segunda posição.
            3- pega 'b' (quarta carta) e compara com 'd' (agora na terceira posição).
                3.1- 'b' é menor, então 'd' é empurrada para a direita.
                3.2- Depois, 'b' é comparada com 'c' (segunda posição). 'b' é menor, então 'c' é empurrada para a direita.
                3.3- Depois, 'b' é comparada com 'a' (primeira posição). 'b' é maior que 'a', então 'b' é colocada na terceira posição.
            4- pega 'e' (quinta carta) e compara com 'd' (agora na quarta posição).
                4.1- 'e' é maior, então 'e' é colocada na quinta posição.
        */

        for(char c : a) {
            System.out.print(c + " ");
        }
    }
}
