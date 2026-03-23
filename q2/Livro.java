package q2;

public class Livro {
    
    String isbn;
    String titulo;
    String autor;
    String editora;
    int edicao;
    int paginas;

    public Livro(String isbn, String titulo, String autor, String editora, int edicao, int paginas) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.paginas = paginas;
    }
}