import java.util.Scanner;

void main(){
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    int result;
    System.out.print("Informe o primeiro numero: ");
    num1 = input.nextInt();
    System.out.print("Informe o segundo numero: ");
    num2 = input.nextInt();
    System.out.printf("A Soma: %s\nA Subtracao: %s\nA divisao: %s\nA Multiplicacao: %s\nO Resto: %s\n",num1+num2, num1-num2, num1/num2, num1*num2, num1%num2);
}