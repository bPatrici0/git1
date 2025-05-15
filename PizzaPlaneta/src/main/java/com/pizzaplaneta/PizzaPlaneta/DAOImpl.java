package com.pizzaplaneta.PizzaPlaneta;

import com.pizzaplaneta.PizzaPlaneta.DAO.PersonaDAO;
import com.pizzaplaneta.PizzaPlaneta.DTO.PersonaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAOImpl {
    // Implementación con JDBC
    public class UsuarioDAOImpl implements PersonaDAO {
        @Override
        public PersonaDTO obtenerPorId(Long id) {
            String sql = "SELECT * FROM usuarios WHERE id = ?";
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setLong(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new PersonaDTO(rs.getLong("id"), rs.getString("nombre"), rs.getString("email"));
                }
            } catch (SQLException e) {
                throw new RuntimeException("Error al buscar usuario", e);
            }
            return null;
        }

        @Override
        public PersonaDTO obtenerPorId(int id) {
            return null;
        }

        @Override
        public List<PersonaDTO> obtenerTodos() {
            return List.of();
        }

        @Override
        public boolean insertar(PersonaDTO persona) {
            return false;
        }

        @Override
        public boolean actualizar(PersonaDTO persona) {
            return false;
        }

        @Override
        public boolean eliminar(int id) {
            return false;
        }
        // Otros métodos...
    }
}
