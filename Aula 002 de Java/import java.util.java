import java.util.Scanner;

public class Aula002 {

    public static void calcularMedia() {
        // Código para calcular a média do aluno, se necessário.
    }

    public static void verificarMedia() {
        float media;
        System.out.print("Digite a média do aluno: ");
        media = new Scanner(System.in).nextFloat();

        if (media >= 6) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }

    public static void main(String[] args) {
        verificarMedia();
    }
}
