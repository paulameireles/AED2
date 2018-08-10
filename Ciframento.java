public class Ciframento{
  public static String cifra(String palavra){
    int tamanho = palavra.length();
    String msgCriptografada = "";
    for (int i = 0; i < tamanho; i++){
      msgCriptografada = msgCriptografada + (char)(((int) palavra.charAt(i)+3)%256);
    }
    return msgCriptografada;
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
  public static void main(String[]args){
    String palavra = "";
    do{
      palavra = MyIO.readLine();
      if (!equals( palavra, "FIM")){
        MyIO.println (cifra(palavra));
      }
    }while(!equals(palavra, "FIM"));
  }
}
