package com.kuliah.main.services;

import java.util.List;

import com.kuliah.main.entity.Dosen;

public interface ModelDosenInterface {
	public List<Dosen> getAllDosen();
	public Dosen getDosenByName(String name);
}
