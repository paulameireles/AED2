#include <stdio.h>

// Função auxiliar para verificar se é letra (sem <ctype.h>)
int ehLetra(char c) {
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
        return 1;
    }
    return 0;
}

// Função para transformar maiúscula em minúscula
char toLower(char c) {
    if (c >= 'A' && c <= 'Z') {
        return c + 32;
    }
    return c;
}

// Função iterativa que verifica se string é palíndromo
int ehPalindromo(char str[]) {
    char filtro[1000];  // buffer para string apenas com letras
    int len = 0;

    // Filtrar apenas letras e converter para minúsculas
    for (int i = 0; str[i] != '\0' && str[i] != '\n'; i++) {
        if (ehLetra(str[i])) {
            filtro[len++] = toLower(str[i]);
        }
    }
    filtro[len] = '\0';

    // Verificação iterativa de palíndromo
    int i = 0, j = len - 1;
    while (i < j) {
        if (filtro[i] != filtro[j]) {
            return 0; // não é palíndromo
        }
        i++;
        j--;
    }
    return 1; // é palíndromo
}

int main() {
    char linha[1000];

    while (1) {
        if (fgets(linha, sizeof(linha), stdin) == NULL) {
            break; // fim da entrada
        }

        // Verifica parada
        if (linha[0] == 'F' && linha[1] == 'I' && linha[2] == 'M' && (linha[3] == '\n' || linha[3] == '\0')) {
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
