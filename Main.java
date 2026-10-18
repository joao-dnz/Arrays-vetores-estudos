import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[]notas = {6,8,5,10,7};

        int soma = 0;
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];


        if(notas[i]>=7){
        contador++;
    }
    }


    
    
    System.out.println("Soma das notas: " + soma);
        System.out.println("Notas aprovadas: " + contador);
}}