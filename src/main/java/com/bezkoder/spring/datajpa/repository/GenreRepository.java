package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Genre;
import com.bezkoder.spring.datajpa.model.Produsser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	//qqqqq List<Tutorial> findByPublished(boolean published);
	List<Genre> findByTitleContaining(String title);
}
