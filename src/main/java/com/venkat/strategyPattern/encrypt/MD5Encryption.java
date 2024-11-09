package com.venkat.strategyPattern.encrypt;

import org.springframework.stereotype.Service;

import com.venkat.strategyPattern.enums.EncryptionTypeEnum;

@Service
public class MD5Encryption implements Encryption {

	@Override
	public void encrypt(String message) {
		System.out.println("I am encrypting using MD5 encryption method");
	}

	@Override
	public EncryptionTypeEnum getEncryptionType() {
		return EncryptionTypeEnum.MD5;
	}

}
