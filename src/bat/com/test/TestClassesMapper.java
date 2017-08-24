package bat.com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import bat.com.domain.Classes;
import bat.com.util.MyBatisUtil;

public class TestClassesMapper {
	
	@Test
	public void testGetClass(){
		
		SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.classMapper.getClazz";
		
		Classes clazz = sqlsession.selectOne(statement, 1);
		
		sqlsession.close();
		/*Classes [id=1, name=class_a, leader=Leader [id=1, name=leader1]]*/
		System.out.println(clazz);
	}

	@Test
	public void testGetClass2() {
		
		SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.classMapper.getClass2";
		
		Classes clazz = sqlsession.selectOne(statement, 1);
		
		sqlsession.close();
		
		System.out.println(clazz);
		
	}

}
