package com.mycompany.exercicio1;
import java.util.Scanner;

class Questao8{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int i,j;
        int quadrado[][] = new int[4][4];

        for (i =0;i<4;i++){
            for (j=0;j<4;j++){
		System.out.printf("Qual o valor da linha "+(i+1)+" x coluna "+(j+1)+": ");
		quadrado[i][j] = teclado.nextInt();
            }
        }
       
        boolean Magico = true;
    	int l = 0;
    	int c = 0;
        
        for (i=0;i<4;i++){
            int sl = 0;
            int sc = 0;
            for (j=0;j<4;j++){
        	if(i==0){
                    l+=quadrado[i][j];
                    c+=quadrado[j][i];
        	}
        	sl+=quadrado[i][j];
        	sc+=quadrado[j][i];
            }
            if(sl!=l || sl!=c || sc!=c || c!=l){
    		Magico = false;
            }
        }
        
        if(Magico){
            System.out.printf("É um quadrado mágico");
        }
        else {
            System.out.printf("Não é um quadrado mágico");
        }	
    }
}