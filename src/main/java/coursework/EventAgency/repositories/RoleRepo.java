package coursework.EventAgency.repositories;

import org.springframework.data.repository.CrudRepository;

import coursework.EventAgency.entities.UserRole;

public interface RoleRepo extends CrudRepository<UserRole, Long>{
    
}
