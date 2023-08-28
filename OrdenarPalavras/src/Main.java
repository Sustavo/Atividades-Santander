import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        System.out.println("Digite as palavras (Enter para terminar):");

        while (true) {
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("")) {
                break;
            }
            palavras.add(palavra);
        }

        Collections.sort(palavras);

        System.out.println("Palavras ordenadas:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}