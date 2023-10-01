package com.groupomar.facturadigital;

import com.groupomar.facturadigital.models.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturaDigitalApplication {



	@Autowired
	IUploadFileService uploadFileService;

	public static void main(String[] args) {
		SpringApplication.run(FacturaDigitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Todo Auto.generated method stub
		uploadFileService.deleteAll();
		uploadFileService.init();
	}
}
