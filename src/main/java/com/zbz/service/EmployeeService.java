package com.zbz.service;

import com.zbz.bean.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author: ag
 * @date: 2019/4/11 21:35
 */

@Service
public class EmployeeService {
    /**监听队列*/
    @RabbitListener(queues = "emp.Queue")
    public void receiveInfo(Employee emp){
        System.out.println("队列emp.Queue接收一条数据开始......");
        System.out.println("收到消息："+emp);
        System.out.println("员工姓名："+emp.getName());
        System.out.println("职位："+emp.getWork());
        System.out.println("队列emp.Queue接收一条数据结束......");
    }
}
