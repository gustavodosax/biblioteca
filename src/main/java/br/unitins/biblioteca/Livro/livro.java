package br.unitins.biblioteca.Livro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class livro {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;

    private String titulo;
    private String autor;
    private String editora;
    private int qtdPaginas;
}
