import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int votoPessoa1 = 10;
        int votoPessoa2 = 20;
        int votoPessoa3 = 30;
        int votoPessoa4 = 40;
        int votoPessoa5 = 50;
        int votoPessoa6 = 60;
        int votoPessoa7 = 70;
        int votoPessoa8 = 80;
        int votoPessoa9 = 90;
        int votoPessoa10 = 100;


        //Primeira forma de criar vetor
        //Criamos o vetor vazio
        int[] votos = new int[10];

        //nomeVetor[posicao] = valor
        //Vetor vai da posicao 0 até 9
        votos[0] = 10;
        votos[1] = 20;
        votos[9] = 100;

        String [] nomes = new String[5];

        Scanner entrada = new Scanner(System.in);
        nomes[0] = entrada.next();
        System.out.println("O primeiro nome é: " + nomes[0]);

        double[] valores = {5.5,10,9,99};
    }
}