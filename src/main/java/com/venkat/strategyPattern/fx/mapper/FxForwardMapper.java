package com.venkat.strategyPattern.fx.mapper;

import org.springframework.stereotype.Component;

import com.venkat.strategyPattern.fx.dto.TradeDto;
import com.venkat.strategyPattern.fx.enums.Products;

@Component
public class FxForwardMapper extends FxSingleLegBase {

	@Override
	public Products getProduct() {
		return Products.FX_FWD;
	}

	@Override
	public Integer getProductQuantity() {
		return 25;
	}

	@Override
	public String mapFxCashProduct(TradeDto tradeDto) {
		commonFxMapper();
		return new StringBuilder().append(getProduct())
				.append("_").append(tradeDto.getFxType())
				.append("_").append(tradeDto.getId())
				.toString();
	}

}
