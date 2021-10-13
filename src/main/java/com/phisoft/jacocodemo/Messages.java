package com.phisoft.jacocodemo;

public class Messages {

    public String getMessage(String name){

        StringBuilder stringBuilder=new StringBuilder();
        if(name==null||name.isEmpty()){
            stringBuilder.append("please enter your name");
        }else {
            stringBuilder.append("Hello " + name);
        }
        return stringBuilder.toString();

    }
}
