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

//	Create new Art
	public void createArt(Art art) {
		artRepo.save(art);
	}
	
//  Update Art	
	public void updateArt(Art art) {
		artRepo.save(art);
	}
	
//  Delete Art
	public void deleteArt(Long id) {
		artRepo.deleteById(id);
	}
//	GetArtDetails 
	public Art artDetails(Long id) {
		return artRepo.findById(id).orElse(null);
	}
}
