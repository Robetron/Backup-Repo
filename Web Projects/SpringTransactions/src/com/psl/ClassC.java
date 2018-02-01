package com.psl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

 //@Transactional(propagation=Propagation.MANDATORY,isolation=Isolation.READ_COMMITTED, readOnly=false, timeout=5)
public class ClassC extends JdbcDaoSupport{

	@Transactional (propagation=Propagation.REQUIRED,readOnly=true, noRollbackFor={org.springframework.jdbc.BadSqlGrammarException.class})//t1
	public void method1(){
		getJdbcTemplate().update("insert into tablea values (92, 'Jack')");
		System.out.println("In method1 added new value");
		method2();
	}

	@Transactional (propagation=Propagation.REQUIRED, readOnly=false)
	public void method2(){
	//try{
			getJdbcTemplate().update("insert into tableb12 values (7, 'Jill')");
			System.out.println("in method 2 added new value");
		//}catch(BadSqlGrammarException e ){
		//	e.printStackTrace();
		//}
	}
	//1.ex in m2 no rb
	//2.ex in m2 rb
	//3.readonly m1
}
