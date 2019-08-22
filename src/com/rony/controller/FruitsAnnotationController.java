package com.rony.controller;

import com.rony.pojo.Fruits;
import com.rony.service.FruitsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FruitsAnnotationController {
    private FruitsService fs=new FruitsService();

    /**
     * 使用RequestMapping实现方法和url的绑定。tips:建议url和方法名对应
     * @return 由于使用的是Controller注解，返回值为ModelAndView
     */
    @RequestMapping("/findAllFruits")
    public ModelAndView findAllFruits(){
        List<Fruits> list = fs.queryFruits();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("fruitsList",list);
//        modelAndView.setViewName("/fruitsList");
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
