package bat.com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import bat.com.domain.User;
import bat.com.domain.User;
import bat.com.domain.User;
import bat.com.util.MyBatisUtil;

public class UserCRUDMapper {
	
	@Test
	public void addUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		/**
		 * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * addUser是insert标签的id属性值，通过insert标签的id属性值就可以找到要执行的SQL 
		 */
		String statement = "bat.com.mapping.userMapper.addUser";//映射sql的标识字符串
		
		User user = new User();
		user.setName("xmlName");
		user.setAge(12);
		//执行插入操作
		int retInsert = sqlSession.insert(statement, user);
		 //手动提交事务
		 //sqlSession.commit();
	     //使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(retInsert);
	}	
	
	//查询
	@Test
	public void getUser () {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.userMapper.getUser";
		
		User user = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(user);
	}
	
	//删
	@Test
	public void delUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.userMapper.delUser";
		
		int result = sqlSession.delete(statement, 3);
		sqlSession.close();
		System.out.println(result);
	}
	
	//改
	@Test
	public void modifyUser() {
	SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.userMapper.modifyUser";
		
		User user = new User();
		user.setId(3);
		user.setName("刚改的名字");
		user.setAge(12);
		
		int retUpdate = sqlSession.update(statement, user);
		System.out.println(retUpdate);
	}
	
	
	@Test
	public void allUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.userMapper.allUser";
		
		List<User> userList = sqlSession.selectList(statement);
		
		System.out.println(userList);
	}
}
