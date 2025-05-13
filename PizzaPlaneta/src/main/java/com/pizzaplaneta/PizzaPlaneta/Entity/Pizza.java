package com.pizzaplaneta.PizzaPlaneta.Entity; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible;
    private String color;
    private String fecha;

    public Pizza(Long id, String nombre, double precio, String color) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;

    }
}