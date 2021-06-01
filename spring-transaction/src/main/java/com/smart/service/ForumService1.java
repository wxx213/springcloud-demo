package com.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import com.smart.dao.ForumDao;
import com.smart.domain.Forum;
@Service
public class ForumService1 {
	public ForumDao forumDao;
	public TransactionTemplate template;
	public void addForum(final Forum forum) {
		
		template.execute(new TransactionCallbackWithoutResult() {
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				forumDao.addForum(forum);
				// 后面的任何地方抛出异常，都会导致已有的提交回滚
				// int a = 1/0;
			}
		});

	}

	@Autowired
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	@Autowired
	public void setTemplate(TransactionTemplate template) {
		this.template = template;
	}

	
	
}
