package com.springboot.shadingjdbc.common.sevice;//package com.springboot.writereader.common.sevice;
//
//import com.springboot.writereader.entity.User;
//import com.springboot.writereader.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomMultiThreadingService {
//  private Logger logger = LoggerFactory.getLogger(CustomMultiThreadingService.class);
//    @Autowired
//    private UserService userService;
//  @Async
//    public void executeAsyncTask1(Integer i){
//     // logger.info("CustomMultiThreadingService ==> executeAysncTask1 method: 执行异步任务{} ", i);
//      User user = new User();
//      user.setId(i);
//      user.setUsername("forezp"+(i));
//      user.setPassword("1233edwd");
//      long resutl=   userService.addUser(user);
//      logger.info("insert:"+user.toString()+" result:"+resutl+"id:"+i);
//  }
//    @Async
//    public void executeAsyncTask2(Integer i){
//        //logger.info("CustomMultiThreadingService ==> executeAysncTask2 method: 执行异步任务{} ", i);
//        User user = new User();
//        user.setId(i);
//        user.setUsername("forezp"+(i));
//        user.setPassword("1233edwd");
//        long resutl=   userService.addUser(user);
//        logger.info("insert:"+user.toString()+" result:"+resutl+"id:"+i);
//    }
//}
