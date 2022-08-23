package com.mycompany.exercicio1;
import java.util.Scanner;

class Questao5{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int i,fat=1,n;
        
        System.out.printf("Digite o valor de N: ");
        n = teclado.nextInt();
        
        if(n <= 0){
            System.out.printf("Não foi possível retornar o fatorial!\n-1");
        }
        else{
            for(i=1;i<=n;i++){
                fat *= i;
            }
            System.out.printf("O fatorial de %d é: %d.", n, fat);
        }
    }
}