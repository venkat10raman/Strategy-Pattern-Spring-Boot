package com.venkat.strategyPattern.fx.validator;

import com.venkat.strategyPattern.fx.enums.Products;

public interface ProductValidator<T> {
	
	Products getProductType();
	void validate(T trade);

}
