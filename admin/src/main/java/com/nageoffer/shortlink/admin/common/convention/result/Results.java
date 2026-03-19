package com.nageoffer.shortlink.admin.common.convention.result;

import com.nageoffer.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.nageoffer.shortlink.admin.common.convention.exception.AbstractException;

public final class Results {
    public static <T> Result<T> success() {
        return new Result<T>()
                .setCode("0")
                .setMessage("成功");
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>()
                .setCode("0")
                .setMessage("成功")
                .setData(data);
    }

    public static <T> Result<T> failure() {
        return new Result<T>()
                .setCode(BaseErrorCode.SERVICE_ERROR.code())
                .setMessage(BaseErrorCode.SERVICE_ERROR.message());
    }

    public static <T> Result<T> failure(String code, String message) {
        return new Result<T>()
                .setCode(code)
                .setMessage(message);
    }

    public static <T> Result<T> failure(AbstractException ex) {
        return new Result<T>()
                .setCode(ex.getErrorCode())
                .setMessage(ex.getErrorMessage());
    }
}
