package com.pizzaplaneta.PizzaPlaneta.Repository;

import com.pizzaplaneta.PizzaPlaneta.DTO.PersonaDTO;
import com.pizzaplaneta.PizzaPlaneta.Entity.Pizza;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    List<Pizza> findByDisponibleTrue();
} 