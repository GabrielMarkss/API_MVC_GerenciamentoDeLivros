package arqtsoftatvd03.controller;

import arqtsoftatvd03.model.LivroModel;
import arqtsoftatvd03.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping("/")
    public String redirectToLivros() {
        return "redirect:/livros";
    }

    @GetMapping("/livros")
    public String listaLivros(Model model) {
        List<LivroModel> livros = livroRepository.findAll();
        model.addAttribute("livros", livros);
        return "listaLivros"; // <- aqui
    }

    @GetMapping("/addLivro")
    public String adicionarLivroForm(Model model) {
        model.addAttribute("livro", new LivroModel());
        return "formularioLivros"; // <- aqui
    }


    @PostMapping("/addLivro")
    public String addLivro(@ModelAttribute("livro") LivroModel livro) {
        livroRepository.save(livro);
        return "redirect:/livros";
    }

    @GetMapping("/livros/excluir/{id}")
    public String deletarLivro(@PathVariable Integer id) {
        livroRepository.deleteById(id);
        return "redirect:/livros";
    }



}