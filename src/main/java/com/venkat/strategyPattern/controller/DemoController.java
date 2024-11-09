package com.venkat.strategyPattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.strategyPattern.enums.EncryptionTypeEnum;
import com.venkat.strategyPattern.factory.EncryptionFactory;
import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.factory.FpmlTransformer;

@RestController
public class DemoController {
	
	@Autowired
	private EncryptionFactory encryptionFactory;
	
	@Autowired
	private FpmlTransformer fpmlTransformer;

	@GetMapping("/encrypt")
	public void encryptWithEncoder(@RequestParam EncryptionTypeEnum encryptionType) {
		encryptionFactory.getEncryption(encryptionType)
			.encrypt("Venkat");
		
		String result = fpmlTransformer.trasform(new TradeDto(1, "Forward", "fwd", null));
		System.out.println(result);
		result = fpmlTransformer.trasform(new TradeDto(1, "SPOT", "spot", null));
		System.out.println(result);
		result = fpmlTransformer.trasform(new TradeDto(1, "SCF", null, "scf"));
		System.out.println(result);
	}
}
