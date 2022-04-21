package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CancelOrderController {
@GetMapping("/cancelOrder")
	void cancelOrder() {
		System.out.println("cancelled");
	}
}
