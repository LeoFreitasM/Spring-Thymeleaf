package br.spring.curriculo.portifoliospring.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/exemplo")
public class HelloController {

    @GetMapping("/mensagem1")
    public String saudar1(Model model) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return "index";
    }

    @GetMapping("/exemplo-request-param")
    public ModelAndView exemploRequestParam(
            @RequestParam(value = "param1str", required = true, defaultValue =
                    "valor") String param1,
            @RequestParam(value = "param2int", required = false, defaultValue = "99")
            int param2) {
        ModelAndView resposta = new ModelAndView("index");
        return resposta;
    }

    @GetMapping("/exemplo-view-obj")
    public ModelAndView exemploViewObj() {

        ModelAndView mv = new ModelAndView("index");

        mv.addObject("imagemPath", "/img/minhafoto.jfif");

        mv.addObject("email", "Email: leofreitas798@gmail.com");
        mv.addObject("telefone", "Telefone: (11) 97657-5428");
        mv.addObject("dataNascimento", "Data de Nascimento: 04/06/2003");
        mv.addObject("linkedin", "LinkedIn");
        mv.addObject("github", "GitHub");

        mv.addObject("tituloExperiencias", "EXPERIÊCIAS PROFISSINAIS");
        mv.addObject("subTituloExperiencias", "Troianos Automação");
        mv.addObject("periodoExperiencia", "Período: " );
        mv.addObject("dataExperiencia", "Agosto de 2021 até Outubro de 2023" );

        mv.addObject("tituloFormacao", "CURSOS DE APERFEIÇOAMENTO");

        mv.addObject("tituloCurso", "Pacote Office Microsoft Office Essencial");
        mv.addObject("dataCurso", "6 horas");
        mv.addObject("localCurso", "Udemy");

        mv.addObject("tituloCursoAlgoritmos", "Algoritmos e Lógica de Programação 2022");
        mv.addObject("dataCursoAlgoritmos", "30 horas");
        mv.addObject("localCursoAlgoritmos", "Udemy");

        mv.addObject("tituloCursoMysql", "MySQL");
        mv.addObject("dataCursoMysql", "40 horas");
        mv.addObject("localCursoMysql", "Curso em vídeo (Guanabara)");

        return mv;
    }
}

