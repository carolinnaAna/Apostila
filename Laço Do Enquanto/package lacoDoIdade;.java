package lacoDo;
import java.util.Scanner;
public class Idade {
     public static void main(String[] args) {

         Scanner in = new Scanner (System.in);

         int i = 1, anoAtual, anoNasc, idade, escolha;
         System.out.println("Digite o ano atual:");
         anoAtual = in.nextInt();
         do{
             System.out.println("Digite o ano do nascimento:");
             anoNasc = in.nextInt();
             idade = anoAtual - anoNasc;
             if(idade <18){
                 System.out.println(idade + "anos. Menor de idade!"); 
             else {
                  System.out.println(idade + "anos. Maior de idade!"); 
             }
             System.out.println("Deseja continuar? 1=Sim 2=Nao:")
             escolha = in.nextInt();
             }

         }while(i==1);
         System.out.println("Obrigada, ate a proxima!")
         in.close();
     }
}