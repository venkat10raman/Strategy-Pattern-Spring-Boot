package com.venkat.strategyPattern.fx.dto;

import lombok.Data;

@Data
public class TradeDto {
	
	private final int id;
	private final String productType;
	private final String fxType;
	private final String scfType;

}
