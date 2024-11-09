package com.venkat.strategyPattern.fx.validator;

import com.venkat.strategyPattern.fx.dto.TradeDto;

public abstract class BaseValidator implements ProductValidator<TradeDto> {
	
	protected void commonValidation(TradeDto trade) {
		System.out.println(trade);
		System.out.println("common Validation is Passed");
	}

}
