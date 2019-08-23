package com.rony.controller;

import com.rony.pojo.Fruits;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rony")
public class TestController  {
    @RequestMapping(value = "/testController",method = RequestMethod.GET)
    public String test(Model model, String name){

        System.out.println("TestController：\t"+name);
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("login");
        return "login";
    }
    @RequestMapping("/testTwo")
    public String testTwo(FruitsMap goods){
        System.out.println(goods);
        return "login";
    }
}
class FruitsMap{
    private Map<String,Object> map;

    @Override
    public String toString() {
        return "FruitsMap{" +
                "map=" + map +
                '}';
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
class FruitsListModel{
    private List<Fruits> list;

    @Override
    public String toString() {
        return "FruitsList{" +
                "list=" + list +
                '}';
    }

    public List<Fruits> getList() {
        return list;
    }

    public void setList(List<Fruits> list) {
        this.list = list;
    }
}
class Goods{
    private Fruits fruits;

    public Fruits getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "fruits=" + fruits +
                '}';
    }

    public void setFruits(Fruits fruits) {
        this.fruits = fruits;
    }
}