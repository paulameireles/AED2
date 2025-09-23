public class Palindrommo{
  public static boolean palindromo(String palavra){
    //atributos
    int tamanho = palavra.length()/2;
    //palavra = palavra.toLowerCase();
    //verificar se o inicio da palavra e o fim são iguais
    for (int i = 0; i < tamanho; i++){
      if (palavra.charAt(i) != palavra.charAt((palavra.length()-1)-i)){
        return false;
      }
    }
    return true;
  }
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
  public static void main(String[]args) {
    // MyIO.println (equals ("palavra", "oi")==false);
    // MyIO.println (equals ("palavra", "PALAVRA")==false);
    // MyIO.println (equals ("palavra", "palavre")==false);
    // MyIO.println (equals ("palavra", "aysnena")==false);
    // MyIO.println (equals ("palavra", "palavra")==true);
    String palavra;
    do{
      palavra = MyIO.readLine();
      if (!equals(palavra, "FIM")){
        Boolean teste = palindromo (palavra);
        //MyIO.println( teste ? "SIM" : "NAO" );
        if (teste){
          MyIO.println("SIM");
        }else{MyIO.println("NAO");}
      }
    }while(!equals(palavra, "FIM"));
  }
}
