package com.springAngular.springAngular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springAngular.springAngular.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

}
