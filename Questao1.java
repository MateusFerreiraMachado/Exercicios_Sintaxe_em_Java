package com.mycompany.exercicio1;
import java.util.Scanner;

class Questao1{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n,i,num,cont=0;
        
        System.out.printf("Digite a quantidade de números a serem digitados: ");
        n = teclado.nextInt();
        
        for (i=0; i<n; i++) {
            System.out.printf("Digite o %dº número: ",(i+1));
            num = teclado.nextInt();
            
            if(num < 0){
                cont ++;
            }
        }
        System.out.printf("Você digitou %d valores negativos.",cont);
    }
}