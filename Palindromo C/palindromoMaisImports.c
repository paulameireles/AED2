#include <stdio.h>
#include <wchar.h>
#include <wctype.h>
#include <locale.h>

// Função iterativa que verifica se string wide é palíndromo
int ehPalindromo(wchar_t str[]) {
    int i = 0;
    int j;

    // encontrar último caractere válido (antes de \0 ou \n)
    for (j = 0; str[j] != L'\0' && str[j] != L'\n'; j++);

    j--; // último caractere válido

    while (i < j) {
        // avançar i até achar letra
        while (i < j && !iswalpha(str[i])) {
            i++;
        }
        // recuar j até achar letra
        while (i < j && !iswalpha(str[j])) {
            j--;
        }
        if (i < j) {
            if (towlower(str[i]) != towlower(str[j])) {
                return 0; // não é palíndromo
            }
            i++;
            j--;
        }
    }
    return 1; // é palíndromo
}

int main() {
    setlocale(LC_ALL, ""); // habilita UTF-8 no sistema

    wchar_t linha[1000];

    while (1) {
        if (fgetws(linha, 1000, stdin) == NULL) {
            break; // fim da entrada
        }

        // condição de parada "FIM"
        if (linha[0] == L'F' && linha[1] == L'I' && linha[2] == L'M' && 
           (linha[3] == L'\n' || linha[3] == L'\0')) {
            break;
        }

        if (ehPalindromo(linha)) {
            wprintf(L"SIM\n");
        } else {
            wprintf(L"NAO\n");
        }
    }

    return 0;
}