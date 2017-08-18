package bat.com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import bat.com.domain.Teacher;
import bat.com.util.MyBatisUtil;

public class TestCRUDMapper {
	
	@Test
	public void addTeacher() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		/**
		 * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * addUser是insert标签的id属性值，通过insert标签的id属性值就可以找到要执行的SQL 
		 */
		String statement = "bat.com.mapping.teacherMapper.addTeacher";//映射sql的标识字符串
		
		Teacher teacher = new Teacher();
		teacher.setName("xmlName");
		teacher.setPassword("123");
		teacher.setIsTutor(false);
		System.out.println(teacher);
		//执行插入操作
		int retInsert = sqlSession.insert(statement, teacher);
		 //手动提交事务
		 //sqlSession.commit();
	     //使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(retInsert);
	}	
	
	@Test
	public void getTeacher () {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.teacherMapper.getTeacher";
		Teacher teacher = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(teacher);
	}
	
	@Test
	public void modifyTeacher() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.teacherMapper.modifyTeacher";
		
		Teacher teacher = new Teacher();
		teacher.setId(5);
		teacher.setName("刚改的名字");
		teacher.setPassword("qwer1234");
		
		int retUpdate = sqlSession.update(statement, teacher);
		System.out.println(retUpdate);
	}
	
	
}
