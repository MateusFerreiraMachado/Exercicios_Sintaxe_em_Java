package com.mycompany.exercicio1;

class Questao3{

    public static void main(String[] args) {      
        int soma=0,i=1;
        
        do{
            soma +=i; 
            i++;
        }while(i<=999);
        
        System.out.printf("A soma é %d.",soma);
    }
}