import java.util.Scanner;

/*
_ Crie um programa em linguagem Java que solicita ao usuário que digite a idade, armazene 
em uma variável do tipo byte e imprima uma mensagem para idade maior que 25 anos, 
outra mensagem para idade menor que 25 e uma outra mensagem se idade igual a 25 anos.

*/

public class ex1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte idade = 0;
        boolean valido = true;
        
        
        System.out.print("Digite a sua idade : ");
        idade = Byte.parseByte(sc.nextLine());
        if(idade > 25){
                System.out.print("Você tem mais de 25 anos");
        } else if(idade < 25){
            System.out.print("Você tem menos de 25 anos");
        } else {
            System.out.print("Você tem 25 anos");
        }
        
    }
}
