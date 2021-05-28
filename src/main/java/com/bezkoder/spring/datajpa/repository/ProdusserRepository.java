package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Produsser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdusserRepository extends JpaRepository<Produsser, Long> {
	//qqqqq List<Tutorial> findByPublished(boolean published);
	List<Produsser> findByTitleContaining(String title);
}
