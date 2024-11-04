package com.fire.list;

/**
 * 自定义异常
 */
public class IndexOutOfBoundsException  extends RuntimeException{
    public IndexOutOfBoundsException(String message) {
        super(message);
    }

    public IndexOutOfBoundsException() {
        super();
    }
}
