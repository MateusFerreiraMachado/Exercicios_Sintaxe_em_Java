package com.mycompany.exercicio1;

class Questao6{

    public static void main(String[] args) {
        
        int a = 0;
	int b = 1;
        
	System.out.printf("Série de Fibonacci: %d ",a);
        
	while (b < 100){
            System.out.printf("%d ",b);
            b = a + b; //próximo número fibonacci
            a = b - a; //atualiza número anterior
	}
    }
}  