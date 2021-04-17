package com.dev.hrworker.repositories;

import com.dev.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Para que seja possivel executar operações no banco de dados será útilizado a extensão
 * JPARepository com a entidade Worker e o tipo do ID, Long.
 * */
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
