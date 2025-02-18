package com.ryujm.spring.ex.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ryujm.spring.ex.mvc.domain.Seller;
import com.ryujm.spring.ex.mvc.service.SellerService;



@Controller
@RequestMapping("/mvc/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	// input 주소 연결
	@GetMapping("/input")
	public String inputSeller() {
		
		
		return "/mvc/sellerInput";
	}
	
	// input 기능
	@GetMapping("/create")
	public String inputSeller1(
								@RequestParam("nickname") String nickname
								, @RequestParam("temperature") double temperature
								, @RequestParam("profileImage") String profileImgae
			) {
		int count = sellerService.addSeller(nickname, temperature, profileImgae);
		return "추가 성공 : " + count;
	}
	
}
