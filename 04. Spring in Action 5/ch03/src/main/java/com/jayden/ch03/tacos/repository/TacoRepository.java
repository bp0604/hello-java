package com.jayden.ch03.tacos.repository;

import com.jayden.ch03.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
