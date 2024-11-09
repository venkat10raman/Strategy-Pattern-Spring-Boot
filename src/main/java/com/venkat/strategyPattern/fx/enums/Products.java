package com.venkat.strategyPattern.fx.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum Products {
	
	FX_FWD("Forward", "1001"),
	FX_SPOT("SPOT", "1002"),
	SCF("SCF", "1003");
	

	private final String productType;
	private final String upi;

	Products(String productType, String upi) {
		this.productType = productType;
		this.upi = upi;
	}
	
	private static final Map<String, Products> PRODUCT_MAP = new HashMap<>();
	
	static {
		Arrays.stream(Products.values()).forEach( product -> {
			PRODUCT_MAP.put(product.productType, product);
		});
	}

}
