package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.Service;

@Controller
public class CarsController {

	@GetMapping("/cars")
	public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
		model.addAttribute("cars", Service.getCarList(count));
		return "cars";
	}
}
