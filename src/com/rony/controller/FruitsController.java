package com.rony.controller;

import com.rony.pojo.Fruits;
import com.rony.service.FruitsService;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//public class FruitsController implements Controller {
public class FruitsController implements HttpRequestHandler {
    private FruitsService service=new FruitsService();

    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Fruits> list = service.queryFruits();
        httpServletRequest.setAttribute("fruitsList",list);
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/fruitsList.jsp").forward(httpServletRequest,httpServletResponse);
    }
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        List<Fruits> list = service.queryFruits();
//        System.out.println(list);
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("fruitsList",list);
//        modelAndView.setViewName("/WEB-INF/jsp/fruitsList.jsp");
//        return modelAndView;
//    }
}

