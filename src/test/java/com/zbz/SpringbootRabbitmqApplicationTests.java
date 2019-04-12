package com.zbz;

import com.zbz.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {
	@Autowired
	RabbitTemplate rabbitTemplate;
	@Test
	public void testEmpQueue() {
		rabbitTemplate.convertAndSend("emp.direct","empRoutingKey",new Employee("zbz","程序猿"));
	}
}
