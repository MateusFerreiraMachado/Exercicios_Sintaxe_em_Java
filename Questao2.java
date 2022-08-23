package com.mycompany.exercicio1;
import java.util.Scanner;

class Questao2{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int R,S,T,maior;
        
        System.out.printf("Digite o valor de R: ");
        R = teclado.nextInt();
        
        System.out.printf("Digite o valor de S: ");
        S = teclado.nextInt();
        
        System.out.printf("Digite o valor de T: ");
        T = teclado.nextInt();
        
        if(R > S){
            if(R > T){
                maior = R;
                System.out.printf("O maior valor é o R = %d.",maior);
            }
            else{
                maior = T;
                System.out.printf("O maior valor é o T = %d.",maior);
            }
        }
        else{
            if(S > T){
                maior = S;
                System.out.printf("O maior valor é o S = %d.",maior);
            }
            else
                maior = T;
            System.out.printf("O maior valor é o T = %d.",maior);
        }    
    }
}