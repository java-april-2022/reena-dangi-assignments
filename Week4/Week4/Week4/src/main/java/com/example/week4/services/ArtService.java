package com.example.week4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.week4.models.Art;
import com.example.week4.repositories.ArtRepository;

@Service
public class ArtService {
	
	@Autowired
	private ArtRepository artRepo;
	
//	public ArtService(ArtRepository artRepo) {
//		this.artRepo = artRepo;
//	}

	public List<Art> getAllArts() {
		//Business logic
		return artRepo.findAll();
	}
	
//	Find all arts
//	Create new Art
//  Update Art	
//  Delete Art
}
