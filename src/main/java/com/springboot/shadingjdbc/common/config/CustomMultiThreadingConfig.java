package com.springboot.shadingjdbc.common.config;//package com.springboot.writereader.common.config;
//
//import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
//import org.springframework.scheduling.annotation.AsyncConfigurer;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.Executor;
//
//@Component
//@EnableAsync
//public class CustomMultiThreadingConfig implements AsyncConfigurer {
//
//    @Override
//    public Executor getAsyncExecutor() {
//        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
//        taskExecutor.setCorePoolSize(500000);
//        taskExecutor.setMaxPoolSize(10000000);
//        taskExecutor.setQueueCapacity(25000);
//        taskExecutor.initialize();
//        return taskExecutor;
//    }
//
//    @Override
//    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//        return AsyncConfigurer.super.getAsyncUncaughtExceptionHandler();
//    }
//}
