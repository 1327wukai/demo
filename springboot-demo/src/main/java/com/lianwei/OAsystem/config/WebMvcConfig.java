//package com.lianwei.OAsystem.config;
//
//import com.lianwei.OAsystem.interceptor.UserInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    /**
//     * 自定义拦截器，添加拦截路径和排除拦截路径
//     * addPathPatterns():添加需要拦截的路径
//     * excludePathPatterns():添加不需要拦截的路径
//     */
//    //注册拦截器
//    public void addInterceptors(InterceptorRegistry registry) {
//        List list = new ArrayList();
//        list.add("/oa/Info/login");
//        list.add("/oa/Info/reg");
//        list.add("/oa/Info/updateInfo");
////        list.add("/user/toRegister");
//        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);
//    }
//}
