package com.rony.service;

import com.rony.pojo.Fruits;

import java.util.ArrayList;
import java.util.List;

public class FruitsService {
    public List<Fruits> queryFruits(){
        List<Fruits> list=new ArrayList<>();
        list.add(new Fruits("红富士",2.3,"山东"));
        list.add(new Fruits("香蕉",1.5,"上海"));
//        list.add(new Fruits("香蕉",1.5,"上海"));
        return list;
    }
}
