package com.venkat.strategyPattern.fx.validator;

import org.springframework.stereotype.Component;

import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.enums.Products;

@Component
public class SCFValidation implements ProductValidator<TradeDto> {

	@Override
	public Products getProductType() {
		return Products.SCF;
	}

	@Override
	public void validate(TradeDto trade) {
		System.out.println("SCF Validation is success");
	}

}
