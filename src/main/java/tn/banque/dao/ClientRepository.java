package tn.banque.dao;

import tn.banque.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

// deuxieme argument c'est le type de la clé primaire 
public interface ClientRepository extends JpaRepository<Client, Long> {
 

    
}
