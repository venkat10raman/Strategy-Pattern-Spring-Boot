package com.venkat.strategyPattern.fx.mapper;

public abstract class FxSingleLegBase implements ProductMapper {

	public Integer getProductPrice() {
		return 20;
	}
	
	protected void commonFxMapper() {
		System.out.println("Common Fx Mapping has been performed.");
	}

}
