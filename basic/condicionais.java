import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int nota;
    System.out.print("Informe a nota do aluno: ");
    nota = input.nextInt();
    // if (nota >= 7) {
    // System.out.print("Passou!!\n");
    // } else {
    // System.out.print("Nao passou!\n");
    // }
    //
    System.out.print(nota >= 7 ? "passou!!\n" : "Nao passou!!\n");
}
