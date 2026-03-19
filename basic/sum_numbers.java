import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    int sum;
    System.out.print("Informe o primeiro numero: ");
    num1 = input.nextInt();
    System.out.print("Informe o segundo numero: ");
    num2 = input.nextInt();
    sum = num1 + num2;
    System.out.printf("A soma eh: %d\n", sum);
}
