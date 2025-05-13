package com.pizzaplaneta.PizzaPlaneta.Service;

import com.pizzaplaneta.PizzaPlaneta.Entity.Pizza;
import com.pizzaplaneta.PizzaPlaneta.Repository.PizzaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional; 

@Service
@RequiredArgsConstructor
public class PizzaService {
    
    @Autowired
    private PizzaRepository pizzaRepositorio;

    public List<Pizza> obtenerTodos() {
        return pizzaRepositorio.findAll();
    }

    public Optional<Pizza> obtenerPorId(Long id) {
        return pizzaRepositorio.findById(id);
    }

    public Pizza guardar(Pizza pizza) {
        return pizzaRepositorio.save(pizza);
    }

    public Pizza actualizar(Long id, Pizza productoDetalles) {
        Pizza pizza = pizzaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Pizza no encontrada" ));
            pizza.setNombre(productoDetalles.getNombre());
            pizza.setPrecio(productoDetalles.getPrecio());
            pizza.setDescripcion(productoDetalles.getDescripcion());
        
        return pizzaRepositorio.save(pizza);
    }
    
    public void eliminar(Long id) {
        pizzaRepositorio.deleteById(id);
    }
}