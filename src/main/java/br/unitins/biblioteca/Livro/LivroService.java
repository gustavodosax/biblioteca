package br.unitins.biblioteca.Livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service

public class LivroService {
    @Autowired
    LivroRepository livroRepository;

    List<livro> getLivros(){
        return (List<livro>) livroRepository.findAll();
    }

    livro criarLivro(livro livro){
        return livroRepository.save(livro);
    }

}
