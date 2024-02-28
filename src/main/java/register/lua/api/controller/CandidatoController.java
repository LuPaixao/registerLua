package register.lua.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import register.lua.api.candidato.DadosCadastroCandidato;

@RestController
@RequestMapping("candidato")
public class CandidatoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCandidato dados){
        System.out.println(dados);
    }
}
