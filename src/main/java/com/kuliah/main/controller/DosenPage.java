package com.kuliah.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kuliah.main.services.ModelDosen;

@Controller
public class DosenPage {

	@Autowired
	ModelDosen modelDosen;
	
	@GetMapping("/dosen/view")
	public String viewDosen(Model model) {
		model.addAttribute("listdosen",modelDosen.getAllDosen());
		return "view_dosen";
	}
}
