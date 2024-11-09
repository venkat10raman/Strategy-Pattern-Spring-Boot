package com.venkat.strategyPattern.fx.mapper;

import org.springframework.stereotype.Component;

import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.enums.Products;

@Component
public class SCFMapper implements ProductMapper {

	@Override
	public Products getProduct() {
		return Products.SCF;
	}

	@Override
	public Integer getProductPrice() {
		return 10;
	}

	@Override
	public Integer getProductQuantity() {
		return 100;
	}

	@Override
	public String mapFxCashProduct(TradeDto tradeDto) {
		return new StringBuilder().append(getProduct())
				.append("_").append(tradeDto.getId())
				.append("_").append(tradeDto.getScfType())
				.toString();
	}
	
	

}
