package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email); // WHERE email = email
    Optional<Usuario> findByCpf(String cpf); // WHERE cpf = cpf

    List<Usuario> findByNome(String nome); // WHERE nome = nome (trás apenas o nome exato)
    List<Usuario> findByNomeContaining(String busca); // Filtrar pelo nome (busca pelo nome e mais um pouco, é + prático.
}

// PARA BUSCAR POR UM RESULTADO = USO OPTIONAL
// PARA BUSCAR POR VÁRIOS = USO LIST

// Métodos presentes
// - findAll() => SELECT * FROM usuarios;
// - findById(Integer) => SELECT * FROM usuarios WHERE id = ?;
// - save(Usuario) => INSERT INTO(caso id nulo) ou UPDATE (caso id não nulo)
// - delete(Usuario) => DELETE FROM usuarios WHERE id = ?;

// CRUD de Funcionários
// Entidade -> Repository -> DTO -> Service + Controller