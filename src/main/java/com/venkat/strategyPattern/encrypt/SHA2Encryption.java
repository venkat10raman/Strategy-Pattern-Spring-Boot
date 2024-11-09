package com.venkat.strategyPattern.encrypt;

import org.springframework.stereotype.Service;

import com.venkat.strategyPattern.enums.EncryptionTypeEnum;

@Service
public class SHA2Encryption implements Encryption {

	@Override
	public void encrypt(String message) {
		System.out.println("I am encrypting using SHA2 encryption method");
	}

	@Override
	public EncryptionTypeEnum getEncryptionType() {
		return EncryptionTypeEnum.SHA2;
	}

}
