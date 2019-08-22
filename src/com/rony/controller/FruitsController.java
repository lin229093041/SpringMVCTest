package com.rony.controller;

import com.rony.pojo.Fruits;
import com.rony.service.FruitsService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class FruitsController implements Controller {
    private FruitsService service=new FruitsService();
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<Fruits> list = service.queryFruits();
        System.out.println(list);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("fruitsList",list);
        modelAndView.setViewName("/WEB-INF/jsp/fruitsList.jsp");
        return modelAndView;
    }
}

