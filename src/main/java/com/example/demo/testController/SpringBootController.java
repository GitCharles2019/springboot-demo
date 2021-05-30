package com.example.demo.testController;

import com.example.demo.testBean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpringBootController {
    @Autowired
    private Student student;

    @RequestMapping("/ha")
    public String a(){
        System.out.println("333"+student.getName());
        List<Object> list = new ArrayList<Object>();
        return  student.getName()+"helloWorld!";

    }

}
