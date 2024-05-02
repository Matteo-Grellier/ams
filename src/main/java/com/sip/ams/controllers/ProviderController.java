package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProviderController {

	@GetMapping("/infoprovider")
	// @ResponseBody
	public String listProviders() {
		return "provider/providers";
	}

}
