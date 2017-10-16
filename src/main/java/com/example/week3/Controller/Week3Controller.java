package com.example.week3.Controller;

import com.example.week3.Service.Week3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week3Controller {
    @Autowired
    private Week3Service week3Service;

    @RequestMapping(value = "/week3", method = RequestMethod.GET)
    public String week3(){
        String returnValue = "";

        long begin = System.nanoTime();

        returnValue += week3Service.generateArray();

        long end = System.nanoTime();

        returnValue += " " +"起始时间" + begin + " ";

        returnValue += "结束时间" + end + " ";

        returnValue += "耗时" + (end - begin) + "纳秒";

        return returnValue;
    }
}
