package com.venkat.strategyPattern.fx.validator;

import org.springframework.stereotype.Component;

import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.enums.Products;

@Component
public class FxSpotValidation extends BaseValidator {

	@Override
	public Products getProductType() {
		return Products.FX_SPOT;
	}

	@Override
	public void validate(TradeDto trade) {
		commonValidation(trade);
		System.out.println("Fx-Spot validation is success");
	}

}
