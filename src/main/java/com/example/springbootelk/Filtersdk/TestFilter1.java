package com.example.springbootelk.Filtersdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = {"/*"})
public class TestFilter1 implements Filter {

    private static final Logger log = LoggerFactory.getLogger(TestFilter1.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化方法，在过滤器对象被创建时，服务器软件会执行一次");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        long start = System.currentTimeMillis();
//        执行过滤的方法，每次拦截到请求，都会执行这个方法
        String name = request.getParameter("ceShiElkMethod1");
        System.out.println("请求参数为:"+name);
//        放行请求
        chain.doFilter(request, response);
        log.info("结束了过滤器,耗时:"+(System.currentTimeMillis()-start)+"毫妙");

    }

    @Override
    public void destroy() {
        log.info("在过滤器对象被销毁时，服务器软件会执行一次");

    }
}
