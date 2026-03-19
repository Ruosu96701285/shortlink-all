package com.nageoffer.shortlink.admin.common.convention.exception;

import com.nageoffer.shortlink.admin.common.convention.errorcode.IErrorCode;

public class ClientException extends AbstractException {
    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }
}
