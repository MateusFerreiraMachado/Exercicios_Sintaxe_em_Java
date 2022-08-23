package com.mycompany.exercicio1;
import java.util.Scanner;

class Questao7{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float nota,n025=0,n2550=0,n5075=0,n75100=0,votos=0;
        
        do{
            System.out.printf("Digite a nota: ");
            nota = teclado.nextInt();

            if((nota >= 0) && (nota<=25)){
                n025++;
                votos ++;
            }
            else if((nota >= 25) && (nota<=50)){
                n2550++;
                votos ++;
            }           
            else if((nota >= 50) && (nota<=75)){
                n5075++;
                votos ++;
            }      
            else if((nota >= 75) && (nota<=100)){
                n75100++;
                votos ++;
            }                 
        }while((nota >= 0) && (nota <= 100));
        
        System.out.printf("%.0f porcento funcionários consideram as refeições péssimas.\n",( (n025/votos)* 100 ) );
        System.out.printf("%.0f porcento funcionários consideram as refeições péssimas.\n",( (n2550/votos)* 100 ) );
        System.out.printf("%.0f porcento funcionários consideram as refeições péssimas.\n",( (n5075/votos)* 100 ) );
        System.out.printf("%.0f porcento funcionários consideram as refeições péssimas.\n",( (n75100/votos)* 100 ) );
    }
}