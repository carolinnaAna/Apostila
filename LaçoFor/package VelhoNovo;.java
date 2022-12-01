package lacoFor;
import.java.util.Scanner;
public class VelhoNovo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in)

        int i, anoAtual, anoNasc, idade, maior=0, menor=200;

        System.out.println("Digite o ano atual:");
        anoAtual = in.nextInt();

        for(i=1; i<=10; i++) {
            System.out.println("Digite o ano de nascimento:");
            anoNasc = in.nextInt();
            idade = anoAtual - anoNasc;
            if(maior <= idade) {
                maior = idade + 0;
            }else if(menor >= idade) {
                menor = idade + 0;
            }

        }   System.out.println("O mais velho tem"+maior+"anos");
            System.out.println("O mais novo tem"+menor+"anos");
    }
}