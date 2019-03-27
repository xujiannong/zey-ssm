package com.zey.sm.model;

/* *
 *  @Author xujiannong
 *  @Date 2018/10/21  14:00
 **/
public class AopResult {
    private Object result;
    private boolean isSuccess;
    private String message;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public boolean setIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
