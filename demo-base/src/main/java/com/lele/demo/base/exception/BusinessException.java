package com.lele.demo.base.exception;

/**
 * @author: lele
 * @date: 2021/9/6 22:39
 * @description: 业务异常类
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private int errorCode = -1;
    private String message;
    private String exceptionMessage;

    public BusinessException() {
    }

    public BusinessException(Throwable t) {
        super(t);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable t) {
        super(message, t);
    }

    public BusinessException(int errorCode, String message,String exceptionMessage) {
        this.errorCode = errorCode;
        this.message = message;
        this.exceptionMessage = exceptionMessage;

    }
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

}
