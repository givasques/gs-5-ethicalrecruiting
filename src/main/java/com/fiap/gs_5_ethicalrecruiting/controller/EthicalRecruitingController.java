package com.fiap.gs_5_ethicalrecruiting.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("ethicalrecruiting")
public class EthicalRecruitingController {
    
    @GetMapping ("/info")
    public ResponseEntity<Map<String, String>> getEthicalRecruitingInfo () {

        Map<String, String> info = Map.of (
            "tema", "Ethical Recruiting",
            "membro1", "Giovanna Vasques Alexandre - RM 99884",
            "membro2", "Wemilli Nataly Lima de Oliveira - RM 552301",
            "descricao", "O Ethical Recruiting (sistema de recrutamento ético) propõe o uso de inteligência artificial e análise de dados para tornar os processos seletivos mais justos, transparentes e livres de vieses humanos. A ideia é que a tecnologia, quando bem projetada, possa promover a diversidade e garantir igualdade de oportunidades — ao contrário de reforçar preconceitos existentes."
        );

        return ResponseEntity.ok(info);
    }
}
