import java.util.Scanner;

/*
_ Crie um programa em linguagem Java que solicita ao usuário que digite o salário, 
armazene em uma variável do tipo double e imprima uma mensagem caso o salário seja
 maior que R$ 1997,58, outra mensagem se o salário for maior que R$5399,99 e outra 
 mensagem se o salário digitado for menor ou igual a zero. 
Caso o salário seja menor igual a zero o sistema deve solicitar que o usuário digite o salário 
novamente para então realizar as validações de faixas salariais mais uma vez até que o usuário
 digite um valor acima de zero.

*/

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = 0.0;
        boolean validacao = true;

        System.out.print("Digite o seu salário : ");
        salario = Double.parseDouble(sc.nextLine());

        
        if(salario > 1997.58 && salario < 5399.99){
            System.out.print("Salário maior que R$ 1997.58.");
        } else if(salario > 5399.99){
            System.out.print("Salário maior que R$ 5399.99.");
        } else if (salario <= 0 ){
            do{
                System.out.print("O salário precisa ser maior que 0 : \n");
                System.out.print("Digite o seu salário : ");
                salario = Double.parseDouble(sc.nextLine());
                validacao = false;
            }while(!validacao);
        }
       /* do{
            if(salario <= 0 ){
                System.out.print("O salário precisa ser maior que 0 : \n");
                System.out.print("Digite o seu salário : ");
                salario = Double.parseDouble(sc.nextLine());
                validacao = false;
            }
        }while(!validacao)*/
        
    }
}
