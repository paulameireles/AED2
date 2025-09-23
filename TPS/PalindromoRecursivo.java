public class PalindromoRecursivo{
	public static boolean palindromo(String palavra){
		return ehPalindromo(palavra,0,palavra.length()-1);
	}
	public static boolean ehPalindromo(String palavra, int a, int b){
		//boolean ehpalindromo = true;
		if(a > b){
			return  true;
		}
		if(palavra.charAt(a) != palavra.charAt(b)){
			return  false;
		}else{
			return ehPalindromo(palavra, a+1, b-1);
		}
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
		boolean teste = true;

		do{
			palavra = MyIO.readLine();
			if(!equals(palavra, "FIM")){
				teste = palindromo(palavra);
				MyIO.println( teste ? "SIM" : "NAO" );
			}
			
		}while(!equals(palavra,"FIM"));
	}
}