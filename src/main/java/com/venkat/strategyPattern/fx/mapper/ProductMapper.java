package com.venkat.strategyPattern.fx.mapper;

import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.enums.Products;

public interface ProductMapper {

	Products getProduct();
	
	String mapFxCashProduct(TradeDto tradeDto);
	
	Integer getProductPrice();
	
	Integer getProductQuantity();
	
}
