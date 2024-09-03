package br.com.estagio;

public class VerificadorString {
    public static void main(String[] args) {
        String texto = "Exemplo de String com algumas letras A e a.";

        String textoMinusculo = texto.toLowerCase();

        if (textoMinusculo.contains("a")) {
            int quantidade = 0;
            for (int i = 0; i < textoMinusculo.length(); i++) {
                if (textoMinusculo.charAt(i) == 'a') {
                    quantidade++;
                }
            }
            System.out.println("A letra 'a' ocorre " + quantidade + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}
