package com.venkat.strategyPattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.venkat.strategyPattern.encrypt.Encryption;
import com.venkat.strategyPattern.enums.EncryptionTypeEnum;

@Component
public class EncryptionFactory {
	
	private static final Map<EncryptionTypeEnum, Encryption> map = new HashMap<>();
	
	@Autowired
	public EncryptionFactory(Set<Encryption> encryptionImplSet) {
		createStrategy(encryptionImplSet);
	}

	private void createStrategy(Set<Encryption> encryptionImplSet) {
		encryptionImplSet.stream().forEach(e -> 
			map.put(e.getEncryptionType(), e));
	}
	
	public Encryption getEncryption(EncryptionTypeEnum encryptionTypeEnum) {
		return map.get(encryptionTypeEnum);
	}
	
}
