package com.pizzaplaneta.PizzaPlaneta.DTO;

public class PersonaDTO {
    private int id;
    private String nombre;
    private String apellido;
    private String email;

    // Constructor vacío
    public PersonaDTO() {}

    // Constructor con parámetros
    public PersonaDTO(int id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ... otros getters y setters

    @Override
    public String toString() {
        return "PersonaDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}