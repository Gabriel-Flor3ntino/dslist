package com.gabrielflorentino.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielflorentino.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
	

}
