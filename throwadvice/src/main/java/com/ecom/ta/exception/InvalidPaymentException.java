package com.ecom.ta.exception;

public class InvalidPaymentException extends RuntimeException{

        public InvalidPaymentException(String message) {
            super(message);
        }
}
