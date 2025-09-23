#include <stdio.h>

// Verifica se é letra
int ehLetra(char c) {
    return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
}

// Converte para minúscula
char toLower(char c) {
    if (c >= 'A' && c <= 'Z') {
        return c + 32;
    }
    return c;
}

// Função iterativa que verifica se string é palíndromo
int ehPalindromo(char str[]) {
    int i = 0;
    int j;

    // encontrar último caractere válido (antes de \0 ou \n)
    for (j = 0; str[j] != '\0' && str[j] != '\n'; j++);

    j--; // agora j aponta para último caractere

    while (i < j) {
        // avançar i até encontrar letra
        while (i < j && !ehLetra(str[i])) {
            i++;
        }
        // recuar j até encontrar letra
        while (i < j && !ehLetra(str[j])) {
            j--;
        }
        if (i < j) {
            if (toLower(str[i]) != toLower(str[j])) {
                return 0; // não é palíndromo
            }
            i++;
            j--;
        }
    }

    return 1; // é palíndromo
}

int main() {
    char linha[1000];

    while (1) {
        if (fgets(linha, sizeof(linha), stdin) == NULL) {
            break; // fim da entrada
        }

        // condição de parada "FIM"
        if (linha[0] == 'F' && linha[1] == 'I' && linha[2] == 'M' && 
           (linha[3] == '\n' || linha[3] == '\0')) {
            break;
        }

        if (ehPalindromo(linha)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }

    return 0;
}