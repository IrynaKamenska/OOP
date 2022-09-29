package org.example;

import com.sun.source.tree.BreakTree;

public class MyService {
    public int getTextLength(String text){
        if(text == null){
            throw new TextSourceException("Text object is empty");
        }
        if(text.length() > 5){
            throw new TextSourceException("Text object is too large");
        }
        return text.length();
    }


    public Class getClassByName(String name){
        // checked Exceptions
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new TextSourceException("Class name invalid");
        }
    }

//    public Class getClassByName2(String name) throws ClassNotFoundException{
//            return Class.forName(name);
//    }


}
