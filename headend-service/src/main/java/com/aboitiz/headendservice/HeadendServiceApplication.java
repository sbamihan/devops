package com.aboitiz.headendservice;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HeadendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadendServiceApplication.class, args);
	}

}

@RestController
@RequestMapping("/meters/prepaid")
class MainController {

	@GetMapping("switch")
	public ResponseEntity<?> swicthMeter(@RequestParam("serialNumber") String serialNumber,
			@RequestParam("act") String act) {
		MeterControl meterControl = new MeterControl();
		meterControl.setSerialNumber(serialNumber);
		meterControl.setStatus("SUCCESS");
		meterControl.setCompleteDttm(new Date());

		return ResponseEntity.ok().body(meterControl);
	}
}