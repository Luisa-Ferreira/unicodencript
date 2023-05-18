import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner um = new Scanner(System.in);

        System.out.println("Ponha palavra a palavra.\nQuer descodificar ou codificar?\n1-codificar 2-descodificar");
        int opcao = in.nextInt();

        if (opcao < 1 || opcao > 2) {
            System.out.println("Resposta invalida");
        }

        if (opcao == 1) {
            System.out.println("Insira a frase");
            String palavra = um.nextLine();

            char[] unicode = new char[palavra.length()];


            for (int i = 0; i <= palavra.length() - 1; i++) {
                unicode[i] = palavra.charAt(i);
                int unicody = unicode[i];
                System.out.println(unicody);
            }


        }


        if (opcao == 2) {
            System.out.println("Insira o que quer descodificar");
            String descodify = um.nextLine();

            int[] unicode = new int[(descodify.length()/3)];
            int tres = 2;
            String tamanho;
            int count = 0;
            int numero=0;


            for (int i = 0; i <= descodify.length() - 1; i++) {
               count++;
                if (count % 3 == 0) {
                    tamanho =  descodify.charAt(tres - 2)+ "" + descodify.charAt(tres - 1) + "" +descodify.charAt(tres) ;
                    tres += 3;
                   unicode[numero]=Integer.parseInt(tamanho);
                    numero+=1;
                }

            }

            for (int i = 0; i <= unicode.length - 1; i++) {
                System.out.print((char) unicode[i]);
            }
        }
    }

    //made by luisinha :)
}