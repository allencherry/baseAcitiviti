package workflow.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import workflow.entity.User;
import workflow.service.WorkFlowService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class WorkFlowServiceTest {
	@Autowired
	private WorkFlowService workFlowService;
	
	@Test
	public void testAdd(){
		User u = new User();
	//	u.setId(1);
		u.setNickName("allen");
		u.setUserName("han");
		u.setPassword("12356");
		workFlowService.add(u);
	}
}
