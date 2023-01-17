package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

}
