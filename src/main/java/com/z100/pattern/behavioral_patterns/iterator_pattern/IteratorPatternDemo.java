package com.z100.pattern.behavioral_patterns.iterator_pattern;

/**
 * @author Z100
 * @create 2022-05-24 21:40
 * @desc demo
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
