package br.com.treinaweb.twclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twclientes.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
