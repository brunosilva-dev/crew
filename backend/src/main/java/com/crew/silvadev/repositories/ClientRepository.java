package com.crew.silvadev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crew.silvadev.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
