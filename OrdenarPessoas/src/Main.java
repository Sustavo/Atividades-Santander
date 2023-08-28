import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gustavo", 18));
        pessoas.add(new Pessoa("Vinicius", 19));
        pessoas.add(new Pessoa("Pedro", 20));

        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        }
    }
}