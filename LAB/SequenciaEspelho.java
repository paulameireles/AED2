

import java.util.Scanner;

public class SequenciaEspelho {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        do{
            
            int a = sc.nextInt();
            int b = sc.nextInt();


            //construir a sequência direta
            String seq = "";
            for (int i = a; i <= b; i++) {
                seq += i;  // concatenação direta
            }

            //construir a sequência espelhada manualmente
            // Passo 2: inverter sem usar length()
            String espelho = "";
            try {
                int i = 0;
                while (true) {
                    char c = seq.charAt(i);    // pega o caractere na posição i
                    espelho = c + espelho;     // insere no início da string espelho
                    i++;                       // avança
                }
            } catch (StringIndexOutOfBoundsException e) {
                // quando chegar no fim da string, o while quebra
            }

            // Passo 3: imprimir resultado
            System.out.println(seq + espelho);

            
        
        }while(b = '\0');
        
        sc.close();
    }
}
