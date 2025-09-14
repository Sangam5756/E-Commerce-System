package com.shopify.exceptions;

@SuppressWarnings("serial")
public class DuplicateResourceException extends BaseException {

	public DuplicateResourceException(String message) {
		super(message);
	}

}
