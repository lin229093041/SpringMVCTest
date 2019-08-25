package com.rony.pojo;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
//        只 用于校验User类
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
//        Spring 提供的 判断是否为null的方法
        ValidationUtils.rejectIfEmpty(errors,"name","name.is.Empty" ,"用户名不能为空");
//        也可以自己判断
        User u= (User) o;
        if (u.getPwd().length()<3||u.getPwd().length()>10){
            errors.rejectValue("pwd","lenght.too.short","密码长度不符合要求");
        }
    }
}
