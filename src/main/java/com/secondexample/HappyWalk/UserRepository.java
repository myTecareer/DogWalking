package com.secondexample.HappyWalk;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//this will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

//By extending the CrudRepository interface, Spring Data JPA will provide implementations for the repository's CRUD methods for us.
public interface UserRepository 
            extends CrudRepository<User, Integer>{
    List<User> findByStatus(String status);
    //List<User> findByPasswordAndEmail(String password, String email);
    User findByPasswordAndEmail(String password, String email);

    User findByEmail(String email);
    User findByName(String name);
    @Query("SELECT u FROM User u WHERE u.name LIKE %?1%")
    List<User> findByNameLike(String name);
    @Query("SELECT u FROM User u WHERE u.district LIKE %?1%")
    List<User> findByDistrict(String district);
}
