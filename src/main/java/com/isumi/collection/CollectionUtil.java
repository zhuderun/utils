package com.isumi.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUtil {

    public static List<Collection> split(Collection input, int length){
        List<Collection> result = new ArrayList<>();
        if(input.size()<=length){
            result.add(input);
        }else{
            int index = 0;
            List<Object> current = new ArrayList<>();
            result.add(current);
            for(Object o:input){
                if(index % length != 0||index == 0){
                    current.add(o);
                }else{
                    current = new ArrayList<>();
                    result.add(current);
                    current.add(o);
                }
                index++;
            }
        }
        return result;
    }

}
