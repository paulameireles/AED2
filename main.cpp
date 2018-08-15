#include <stdio.h>
#include <stdlib.h>

int ehPalindromo(char string[]){//metodo que verifica se a palavra eh um palindromo
   int resp = 1;
   int tam = 0;
   int cont1 = 0;
   
   
   while(string[cont1]!='\0'){//tam string;
      tam = tam + 1;
      cont1 = cont1 + 1;
   }
   
   int cont2 = tam - 1;
   
   for(cont1 = 0;cont1 < cont2;cont1++){
      if(string[cont1] != string[cont2]){
         resp = 0;
      }
      cont2--;
   }
   
   return resp;
}

int ehFim(char entrada[]){//metodo que verifica se a palvra de entrada eh igual a "FIM"
   int fim = 0;
   if(entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M'){
      fim = 1;
   }	
   return fim;
}

int main(){
	
   char entrada[1000][1000];
   int contEntrada = 0;
   int i = 0;
   int fim;
   
   do{
      scanf(" %[^\n]s", entrada[contEntrada]);
      fim = ehFim(entrada[contEntrada]);
      contEntrada = contEntrada + 1;
   }while(fim != 1);
   contEntrada--; //desconsiderar a entrada "FIM"
   for(i = 0; i < contEntrada; i++){
      if(ehPalindromo(entrada[i]) == 1){
         printf("SIM\n");
      }
      else{
         printf("NAO\n");
      }
   }
   return 0;
}

