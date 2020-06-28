package com.example.springbootelk.web;

import com.utils.Utilsdemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elk")
public class ElkdemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "ceShiElkMethod1", method = RequestMethod.POST)
    public String ceShiElkMethod1(String name) {

        final String str = Utilsdemo.getStr();

        logger.info("--------springboot整合ekl--------info日志");
        logger.info("--------springboot整合ekl--------info日志");
        logger.info("--------springboot整合ekl--------info日志");
        logger.info("--------springboot整合ekl--------info日志");
        logger.info("--------springboot整合ekl--------info日志");
        return "elk测试方法！";

    }


}
