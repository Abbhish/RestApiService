package com.abbhish.springBootTut04REST.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abbhish.springBootTut04REST.model.Alien;

public interface IAlienRepo extends JpaRepository<Alien, Integer> {

}
