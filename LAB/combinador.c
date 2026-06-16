#include <stdio.h>

int main() {
    char s1[1001], s2[1001], resultado[2002];
    int i, j, k;

    // lê até o fim da entrada
    while (scanf("%s %s", s1, s2) == 2) {
        i = j = k = 0;

        // intercala caracteres das duas strings
        while (s1[i] != '\0' && s2[j] != '\0') {
            resultado[k++] = s1[i++];
            resultado[k++] = s2[j++];
        }

        // adiciona o resto da primeira string, se tiver
        while (s1[i] != '\0') {
            resultado[k++] = s1[i++];
        }

        // adiciona o resto da segunda string, se tiver
        while (s2[j] != '\0') {
            resultado[k++] = s2[j++];
        }

        // finaliza a string resultante
        resultado[k] = '\0';

        // imprime resultado para esta linha
        printf("%s\n", resultado);
    }

    return 0;
}
