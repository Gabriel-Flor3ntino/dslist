package com.gabrielflorentino.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabrielflorentino.dslist.dto.GameDTO;
import com.gabrielflorentino.dslist.dto.GameMinDTO;
import com.gabrielflorentino.dslist.entities.Game;
import com.gabrielflorentino.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
			Game result = gameRepository.findById(id).get();
			return  new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
}