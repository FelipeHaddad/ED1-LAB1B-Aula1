// 10437372 - Felipe Bertacco Haddad
// https://www.w3schools.com/java/java_strings.asp
// Gemini: Tem como eu remover espaços de uma string em java?

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String texto = "";
    for (int i = 1; i <= 2; i++) {
        System.out.print("\n\nPara sair do programa, digite /sair\n\nInforme um texto: ");
        texto = scanner.nextLine();
        if (texto.equals("/sair")) {
            System.out.print("Você saiu do programa\n");
            break;
        } else {
            Palindromo teste = new Palindromo(texto);
            System.out.print(teste.verificar(texto));
            i--;
        }
    }
    scanner.close();
    }
}