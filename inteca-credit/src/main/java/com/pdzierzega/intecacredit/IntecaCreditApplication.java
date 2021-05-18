package com.pdzierzega.intecacredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class IntecaCreditApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntecaCreditApplication.class, args);

//        Map<Integer,String> map=new HashMap<>();
//
//        map.put(1,"test");
//        map.put(2,"test2");
//        map.put(3,"test3");
//        map.put(4,"test4");
//
//        for (Integer key:map.keySet()){
//            System.out.println(map.get(key));
//            Integer id= new Integer(key);
//            System.out.println(map.get(id));
//        }
    }

}
