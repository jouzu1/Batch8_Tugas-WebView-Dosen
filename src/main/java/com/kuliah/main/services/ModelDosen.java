package com.kuliah.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.Dosen;
import com.kuliah.main.repository.DosenRepository;

@Service
public class ModelDosen implements ModelDosenInterface{

	@Autowired
	DosenRepository dr;
	@Override
	public List<Dosen> getAllDosen() {
		// TODO Auto-generated method stub
		return (List<Dosen>) this.dr.findAll();
	}

	@Override
	public Dosen getDosenByName(String name) {
		// TODO Auto-generated method stub
		return dr.findByNamaDosen(name);
	}

}
