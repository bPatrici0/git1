package com.pizzaplaneta.PizzaPlaneta.DAO;

import com.pizzaplaneta.PizzaPlaneta.DTO.PersonaDTO;

import java.util.List;

//Data Access Object
public interface PersonaDAO {
    // CRUD operations
    PersonaDTO obtenerPorId(int id);
    List<PersonaDTO> obtenerTodos();
    boolean insertar(PersonaDTO persona);
    boolean actualizar(PersonaDTO persona);
    boolean eliminar(int id);
}
