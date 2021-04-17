package com.dev.hrworker.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * O uso da annotation Entity permite que esse objeto possa ser mapeado para o banco de dados.
 * O Table servira para usar a tabela indicada no parametro name da annotation Table.
 * A interface Serializable será útil para que esse objeto passa ser transformado embytes.
 * */
@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable {
    // ID da versão serializada
    private static final long serialVersionUID = 1L;

    // ID do trabalhador usando as annotations para designa-la
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Nome do trabalhador
    private String name;

    // Tempo do trabalhador
    private Double dailyIncome;

    public Worker() {

    }

    public Worker(long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id == worker.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
