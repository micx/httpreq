/**
 * SimpleHandlerAdapter.java
 * Created on  28/12/2015 6:31 PM
 * modify on                user            modify content
 * 28/12/2015 6:31 PM        micx
 * <p/>
 * Dianping.com Inc.
 * Copyright (c) 2003-2014 All Rights Reserved.
 */

package com.demo.designpattern.adapter;

/**
 * Created by micx  on 2015/12/28 6:31 PM.
 */
public class SimpleHandlerAdapter implements HandlerAdapter {


    public void handle(Object handler) {
        ((SimpleController)handler).doSimplerHandler();
    }

    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

}
