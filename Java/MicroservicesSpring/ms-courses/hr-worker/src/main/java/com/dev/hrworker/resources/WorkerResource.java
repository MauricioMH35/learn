package com.dev.hrworker.resources;

import com.dev.hrworker.entities.Worker;
import com.dev.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * A annotation ResController nos ajudará a trabalhar com os recursos web, onde a mesma
 * displonibiliza os end-points necessários para esse processo.
 * A annotation RequestMapping vai mapear a requisição.
 * */
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    /** Uma dependencia do objeto que acessa o banco de dados. */
    @Autowired
    public WorkerRepository repository;

    /** Um end-point para a resposta da requisição que procura pela entidade trabalhador. */
    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        /** Captura os trabalhadores com recurso disponibilizado pela dependencia
         * repository. */
        List<Worker> list = repository.findAll();
        /** Retorna com uma resposta de Ok e com o corpo da resposta sendo a lista de
         * trabalhadores. */
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
