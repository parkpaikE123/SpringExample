package com.ryujm.spring.ex.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryujm.spring.ex.mvc.service.SellerService;

@Controller
@RequestMapping("/mvc/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/input")
	public String inputSeller(Model model) {
		
		model.addAllAttributes("")
		return "/mvc/sellerInput";
	}
	
}
