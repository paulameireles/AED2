import java.util.Scanner;

public class SequenciaEspelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enquanto houver entrada
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // construir a sequência direta
            String seq = "";
            for (int i = a; i <= b; i++) {
                seq += i;  // concatenação direta
            }

            // construir a sequência espelhada manualmente (sem length)
            String espelho = "";
            try {
                int i = 0;
                while (true) {
                    char c = seq.charAt(i);    // pega o caractere
                    espelho = c + espelho;     // insere no início
                    i++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                // fim da string
            }

            // imprimir resultado
            System.out.println(seq + espelho);
        }

        sc.close();
    }
}
