package br.unitins.biblioteca.Livro;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")

public class LivroController {
    @Autowired
    LivroService livroService;

    @GetMapping
    List<livro> pegarLivros(){
        return livroService.getLivros();
    }

    @PostMapping
    livro salvarLivro(livro livro){
        return livroService.criarLivro(livro);
    }

}
