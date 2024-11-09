package com.venkat.strategyPattern.fx.factory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.enums.Products;
import com.venkat.strategyPattern.fx.mapper.FpmlConverter;
import com.venkat.strategyPattern.fx.mapper.ProductMapper;
import com.venkat.strategyPattern.fx.validator.ProductValidator;

@Component
public class FpmlTransformer implements FpmlConverter<TradeDto> {
	
	private final Map<Products, ProductMapper> productMapperMap;
	private final Map<Products, ProductValidator<TradeDto>> productValidatorMap;
	
	public FpmlTransformer(List<ProductMapper> productMapperList,
			List<ProductValidator<TradeDto>> productValidatorList) {
		this.productMapperMap = productMapperList.stream()
				.collect(Collectors.toMap(ProductMapper::getProduct, Function.identity()));
		this.productValidatorMap = productValidatorList.stream()
				.collect(Collectors.toMap(ProductValidator::getProductType, Function.identity()));
	}

	@Override
	public String trasform(TradeDto trade) {
		Products product = getProductType(trade.getProductType());
		getValidator(product).validate(trade);
		
		System.out.println(getMapper(product).getProductPrice());
		System.out.println(getMapper(product).getProductQuantity());
		return getMapper(product).mapFxCashProduct(trade);
	}
	
	private Products getProductType(String productType) {
		 return productMapperMap.keySet().stream()
		.filter(pt -> pt.getProductType().equals(productType))
		.findFirst().get();
	}

	private ProductMapper getMapper(Products products) {
		 return productMapperMap.get(products);
	}
	
	private ProductValidator<TradeDto> getValidator(Products products) {
		 return productValidatorMap.get(products);
	}

}
