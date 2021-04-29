package com.example.annotations.database.sqlite.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.annotations.database.sqlite.model.Person;


public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, JpaSpecificationExecutor<Person> {
    Person findByFirstname(String firstname);
    Optional<Person> findByFirstnameAndLastname(String firstname, String lastname);

    @Query(value = "SELECT p FROM Person p WHERE p.lastname = :lastname OR p.fullname = :fullname")
    List<Person> findPersonUsingByLastnameOrFullname(@Param("lastname") String lastname, @Param("fullname") String fullname);
}

