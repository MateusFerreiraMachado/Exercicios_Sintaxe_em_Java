package com.mycompany.exercicio1;

class Questao4{

    public static void main(String[] args) {
        int soma=0,i=3;
        
        do{
            soma +=i; 
            i+=3;
        }while(i<100);
        
        System.out.printf("A soma é %d.",soma);
    }
}