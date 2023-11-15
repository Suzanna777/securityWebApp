package com.yourcompany.exception;

import java.util.Objects;

public class CustomException extends RuntimeException {

    // Custom fields specific to your exception
    private String errorCode;
    private String additionalInfo;

    // Constructors
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    // Additional Constructors with custom fields
    public CustomException(String message, String errorCode, String additionalInfo) {
        super(message);
        this.errorCode = errorCode;
        this.additionalInfo = additionalInfo;
    }

    // Getter methods for custom fields
    public String getErrorCode() {
        return errorCode;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    // Other methods if needed

    @Override
    public String toString() {
        return "CustomException{" +
                "errorCode='" + errorCode + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}

