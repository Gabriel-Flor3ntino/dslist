package com.gabrielflorentino.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabrielflorentino.dslist.dto.GameListDTO;
import com.gabrielflorentino.dslist.dto.GameMinDTO;
import com.gabrielflorentino.dslist.entities.GameList;
import com.gabrielflorentino.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
}