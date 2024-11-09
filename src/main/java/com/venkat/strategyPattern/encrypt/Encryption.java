package com.venkat.strategyPattern.encrypt;

import com.venkat.strategyPattern.enums.EncryptionTypeEnum;

public interface Encryption {
	
	public void encrypt(String message);
	
	public EncryptionTypeEnum getEncryptionType();

}
