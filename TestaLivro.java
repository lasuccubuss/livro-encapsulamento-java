import java.util.Scanner;

public class TestaLivro{
	
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   Livro livro = new Livro();
	   
	   int opcao = -1;
	   
	      while(opcao != 0){
			  
			  System.out.println("1 - Cadastrar livro: ");
			  System.out.println("2 - Ver dados do livro: ");
			  System.out.println("3 - Verificar se o livro é extenso: ");
			  System.out.println("4 - Idade do livro: ");
			  System.out.println("0 - Sair: ");
			  
			  System.out.println("Digite uma opção: ");
			  opcao = sc.nextInt();
			  
			  switch(opcao){
				  
				  case 1:
				  System.out.println("Digite o nome do livro: ");
				  sc.nextLine();
				  String digita = sc.nextLine();
				  livro.setTitulo(digita);
				  
				  System.out.println("Digite o nome do autor: ");
				  String digitaAutor = sc.nextLine();
				  livro.setAutor(digitaAutor);
				  
				  System.out.println("Digite o ano do Livro: ");
				  int digitaAno = sc.nextInt();
				  livro.setAnoDePublicacao(digitaAno);
				  
				  System.out.println("Digite o número de páginas: ");
				  int numeroPaginas = sc.nextInt();
				  livro.setNumeroDePaginas(numeroPaginas);
				  break;
				  
				  case 2:
				   livro.imprimirDados();
				  break;
				  
				  case 3:
				  if(livro.livroExtenso()){
					  System.out.println("O livro é extenso! ");
				  } else {
					  System.out.println("O livro não é extenso. ");
				  }
				  break;
				  
				  case 4:
				  livro.idadeDoLivro();
				  break;
				  
			default:
				  
				  
			  }
		  }
       	
	}
}