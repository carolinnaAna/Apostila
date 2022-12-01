import java.util.Scanner;
public class Fatorial {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int i=1, f, res=1;
        System.out.println("Digite o valor do fatorial:");
        f = in.nextInt();
        while (i<=f) {
            res= res*i;
            i++;
        }
            System.out.println("O fatorial é :"+ res );
    }
}