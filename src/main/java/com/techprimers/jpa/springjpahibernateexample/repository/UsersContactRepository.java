package com.techprimers.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techprimers.jpa.springjpahibernateexample.model.UsersContact;
@Repository
public interface UsersContactRepository extends JpaRepository<UsersContact,Integer>{

}
