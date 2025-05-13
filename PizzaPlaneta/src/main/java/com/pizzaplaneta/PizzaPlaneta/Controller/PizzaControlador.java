package com.pizzaplaneta.PizzaPlaneta.Controller;

import lombok.RequiredArgsConstructor;
import com.pizzaplaneta.PizzaPlaneta.Entity.Pizza;
import com.pizzaplaneta.PizzaPlaneta.Service.PizzaService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List; 

@RestController
@RequestMapping("/api/pizzas")
@RequiredArgsConstructor
public class PizzaControlador {

    @Autowired
    private PizzaService pizzaServicio;

    @GetMapping
    public List<Pizza> obtenerTodosLoProductos() {
        return pizzaServicio.obtenerTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pizza> obtenerProductoPorId(@PathVariable Long id) {
        return pizzaServicio.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pizza crearProducto(@RequestBody Pizza pizza) {
        return pizzaServicio.guardar(pizza);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pizza> actualizarProducto(@PathVariable Long id, @RequestBody Pizza pizza) {
        try {
            Pizza productoActualizado = pizzaServicio.actualizar(id, pizza);
            return ResponseEntity.ok(productoActualizado);
        }catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        pizzaServicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}