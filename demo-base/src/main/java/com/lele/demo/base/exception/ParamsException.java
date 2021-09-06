package com.lele.demo.base.exception;

/**
 * @author: lele
 * @date: 2021/9/6 22:43
 * @description: 参数异常类
 */
public class ParamsException extends RuntimeException {

    private static final long serialVersionUID = 8966565582668811760L;
    private int errorCode = -1;
    private String message;
    private String exceptionMessage;
    private Throwable throwable;

    public String getExceptionMessage() {
//        if(exceptionMessage!=null&&exceptionMessage.contains("java.sql")){
//            exceptionMessage = BaseErrorCode.getMessage("SYSTEM_EXCEPTION");
//        }
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public ParamsException() {
        super("ParamsException");
    }

    public ParamsException(String message) {
        this.message = message;
    }

    public ParamsException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public ParamsException(int errorCode, String message, String exceptionMessage) {
        this.errorCode = errorCode;
        this.message = message;
        this.exceptionMessage = exceptionMessage;
    }

    public ParamsException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public ParamsException(Throwable cause) {
        super(cause);
    }

    public ParamsException(ParamsException e) {
        this.errorCode = e.getErrorCode();
        this.message = e.getMessage();
        this.exceptionMessage = e.getExceptionMessage();
    }


    public static void throwException(ParamsException exception) {
        throw exception;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
//        if(message!=null&&message.contains("java.sql")){
//            message = BaseErrorCode.getMessage("SYSTEM_EXCEPTION");
//        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
