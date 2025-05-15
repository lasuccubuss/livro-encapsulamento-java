import java.util.Calendar;

public class Livro{
    
	String titulo;
	String autor; 
	int anoDePublicacao; 
	int numeroDePaginas;
	
	public Livro(){
	
	}
	public Livro(String titulo, String autor, int anoDePublicacao, int numeroDePaginas){
	    this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.numeroDePaginas = numeroDePaginas;
	}
	public Livro(Livro livro){
	   this.titulo = livro.getTitulo();
	   this.autor = livro.getAutor();
	   this.anoDePublicacao = livro.getAnoDePublicacao();
       this.numeroDePaginas = livro.getNumeroDePaginas();	   
	}
	
	public String getTitulo(){
		return titulo;
	}
	public String getAutor(){
		return autor;
	}
	public int getAnoDePublicacao(){
		return anoDePublicacao;
	}
	public int getNumeroDePaginas(){
		return numeroDePaginas;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public void setAnoDePublicacao(int anoDePublicacao){
		this.anoDePublicacao = anoDePublicacao;
	}
	public void setNumeroDePaginas(int numeroDePaginas){
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public boolean livroExtenso(){
		if(numeroDePaginas > 300){
			return true;
	} else {
		return false;
	}
}
	
	public void idadeDoLivro(){
		Calendar calendario = Calendar.getInstance();
		int anoAtual = calendario.get(Calendar.YEAR);
		int idadeLivro = anoAtual - getAnoDePublicacao();
		System.out.println("A idade deste livro é de " + idadeLivro + " anos.");
		}
		
	public void imprimirDados(){
		System.out.println("Título do livro: " + getTitulo());
		System.out.println("Autor do livro: " + getAutor());
		System.out.println("Ano de publicação: "+ getAnoDePublicacao());
		System.out.println("Número de páginas: " + getNumeroDePaginas());
	}	
}