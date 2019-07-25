package com.stackroute.pe3;

public class ExceptionCatcher {
    String exceptionMessage = "Default exception message";


    public void setExceptionsMessage(String exceptionsMessage){
        if (exceptionsMessage != null && !(exceptionsMessage.trim().isEmpty())) {
            this.exceptionMessage = exceptionsMessage;
        }
    }

    public String[] createException() {
        String[] exceptions = new String[2];
        try {
            throw new MyException(exceptionMessage);
        } catch (MyException m){
            exceptions[0] = m.message;
        }finally {
            exceptions[1] = "Finally block reached";
        }
        return exceptions;
    }
}

class MyException extends Exception{
    String message;

    public MyException(String message) {
        this.message = message;
    }
}
