package workflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import workflow.dao.UserDao;
import workflow.entity.User;
import workflow.service.WorkFlowService;

@Service
@Transactional
public class WorkFlowServiceImpl implements WorkFlowService {

	@Autowired
	private UserDao userDao;

	public void add(User u) {
		userDao.add(u);
	}

}
