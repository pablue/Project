package cn.edu.xyc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDao extends HibernateDaoSupport{

	
	@Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {   
      super.setSessionFactory(sessionFactory);   
    } 
}
