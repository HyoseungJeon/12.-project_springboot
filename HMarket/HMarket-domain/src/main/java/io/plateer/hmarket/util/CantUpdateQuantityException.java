package io.plateer.hmarket.util;

public class CantUpdateQuantityException extends RuntimeException{

    private static final long serialVersionUID = -8812955226330752284L;

    public CantUpdateQuantityException(String message) { super(message);}
}
