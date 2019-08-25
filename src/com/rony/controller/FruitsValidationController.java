package com.rony.controller;

import com.rony.pojo.Fruits;
import com.rony.pojo.User;
import com.rony.pojo.UserValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class FruitsValidationController {
    @RequestMapping("/validation_test")
    public String find(Model model, @Validated(value = ValidationB.class) Fruits fruits, BindingResult bindingResult){
        List<ObjectError> errors=null;
        if (bindingResult.hasErrors()){

            errors = bindingResult.getAllErrors();
            for (ObjectError error: errors) {
                System.out.println(error.getDefaultMessage());
            }
        }
        System.out.println(fruits);
//        System.out.println(123456);
        return "index.jsp";
    }
    @InitBinder
    public void initBinder(DataBinder dataBinder){
        dataBinder.setValidator(new UserValidation());
    }
    @RequestMapping("/user")
    public String findUser(Model model, @Valid User user, BindingResult bindingResult){
        System.out.println("user  validation");
        if (bindingResult.hasErrors()){
            for (ObjectError e: bindingResult.getAllErrors()
                 ) {
                System.out.println(e.getDefaultMessage());
            }
        }
        return "index.jsp";
    }
}
