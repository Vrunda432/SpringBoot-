package com.session.october;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/health/check")
@Slf4j
public class HealthCheckController {
	@GetMapping
	public HttpStatus healthCheck() {
		System.out.println("Reached-> healthCheck");
		log.info("Reached-> healthCheck");
		return HttpStatus.OK;
	}
}
