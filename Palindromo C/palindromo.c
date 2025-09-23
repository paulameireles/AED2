#include <stdio.h>
#include <locale.h>

int ehPalindromo(const char *string){
    //definição de variaveis inicio e fim da string 
    int inicio = 0;
    int fim = 0;

    //achar a quantidade de letras da palavra 
    while (string[fim] != '\0') {
        fim++;
    }
    //tirar o caractere nulo 
    fim--;
     
    //verificar em cada posicao de inicio e fim se eles sao diferentes
    while(inicio < fim){
        if(string[inicio] != string[fim]){
            return 0;
        }
        inicio++;
        fim--;
    }
    return 1;
}


int main(){
    
    char arr[50];
    int booleano = 0;
    scanf("%s", arr);
    do{
        booleano = ehPalindromo(arr);
        if(booleano == 0){
            printf("%s", "NAO\n");
        }else if(booleano == 1){
            printf("%s", "SIM\n");
        }
        scanf("%s", arr);
    }while(arr[0] != 'F' && arr[1] != 'I' && arr[2] != 'M');
    return 0;
}