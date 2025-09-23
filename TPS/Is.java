public class Is{
  public static boolean isVogal(String palavra){
    int tamanho = palavra.length();
    boolean ehVogal = true;
    //percorrer a palavra e ver se é vogal
    for (int i = 0; i < tamanho; i++){
      switch(palavra.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          ehVogal &= true;
          break;
        default:
          ehVogal &= false;
      }
    }
    return ehVogal;
  }
  public static boolean isConsoante(String palavra){
    int tamanho = palavra.length();
    boolean ehConsoante = true;
    for (int i = 0; i < tamanho; i++){//percorrer a palavra
      if((int)palavra.charAt(i)>=65 && (int)palavra.charAt(i)<=90){// verificar se é maiuscula
        switch(palavra.charAt(i)){//verificar se é vogal
          case 'A':
          case 'E':
          case 'I':
          case 'O':
          case 'U':
            ehConsoante &= false;
            break;
          default:
            ehConsoante &= true;
        }
    }
    if((int)palavra.charAt(i)>=97 && (int)palavra.charAt(i)<=122){//verificar se é minuscula
        switch(palavra.charAt(i)){// verificar se é vogal
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            ehConsoante &= false;
            break;
          default:
            ehConsoante &= true;
        }
      }else{ehConsoante &= false;}
    }
    return ehConsoante;
  }
  public static boolean isInt (String palavra){
    int tamanho = palavra.length();
    boolean ehInt = true;
    int cont = 0;
    for (int i = 0; i < tamanho; i++){
      if( (palavra.charAt(i) >= 'A' && palavra.charAt(i) <= 'Z') || (palavra.charAt(i) >= 'a' && palavra.charAt(i) <= 'z')){// ver se está entre a e z
         ehInt = false;
      }
      if( (palavra.charAt(i) == '.' || palavra.charAt(i) == ',' )){// verificar se é . ou ,
         cont++;
      }
      if(cont > 0){
         ehInt = false;
      }
    }
    return ehInt;
  }
  public static boolean isReal(String s){//metodo que verifica se a String que chegou eh ou nao um numero real;
     boolean tof = true;
     int cont = 0;
     int tamanhoString = s.length();
     for(int i = 0; i<tamanhoString && tof!=false; i++){
        if( (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
           tof = false;
        }
        else if( (s.charAt(i) == '.' || s.charAt(i) == ',' )){
           cont++;
        }
        if(cont > 1){
           tof = false;
        }

     }
     if(cont == 0){
       tof = false;
     }
     return tof;
  }//fim metodo;
  public static boolean equals (String palavra1, String palavra2){
      int tamanho = palavra1.length();
      if (tamanho == palavra2.length()){
        //conferir todas as posições da String e verificar se são iguais
        for (int i = 0; i < tamanho; i++){
          if(palavra1.charAt(i) != palavra2.charAt(i)){
            return false;
          }
        }
      }else{
        return false;
      }
      return true;
  }
  public static void main (String[]args){
    String palavra = "";
    boolean teste4 = true;
    do{
      palavra = MyIO.readLine();
      if (!equals(palavra, "FIM")){
        boolean teste1 = isVogal(palavra);
        boolean teste2 = isConsoante(palavra);
        boolean teste3 = isInt(palavra);
        if(teste3){
          teste4 = true;
        }
        else{
          teste4 = isReal(palavra);
        }
        MyIO.print( teste1 ? "SIM " : "NAO " );
        MyIO.print( teste2 ? "SIM " : "NAO " );
        MyIO.print( teste3 ? "SIM " : "NAO " );
        MyIO.println( teste4 ? "SIM " : "NAO " );
      }
    }while(!equals(palavra, "FIM"));
  }
}
