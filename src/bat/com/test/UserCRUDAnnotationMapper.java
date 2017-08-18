package bat.com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import bat.com.domain.User;
import bat.com.mapping.UserMapperI;
import bat.com.util.MyBatisUtil;

public class UserCRUDAnnotationMapper {
	
	@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		//得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		 UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		 
		 User user = new User();
		 user.setName("AnnoName");
		 user.setAge(18);

		 int result = mapper.add(user);
		 //使用SqlSession执行完SQL之后需要关闭SqlSession
		 sqlSession.close();
		 System.out.println(result);
	}
	
	@Test
	public void testDelete() {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		int result = mapper.delete(6);
		
		sqlSession.close();
		
		System.out.println(result);
	}
	
	@Test
	public void testUpdate() {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		User user = new User();
		user.setId(5);
		user.setName("updataName");
		user.setAge(118);
		
		int result = mapper.update(user);
		
		sqlSession.close();
		
		System.out.println(result);
	}
	
	@Test
	public void testGetUser() {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		User result = mapper.select(5);
		
		sqlSession.close();
		
		System.out.println(result);
	}
	
	@Test
	public void testGetAllUser() {
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		List<User> result = mapper.allUser();
		
		sqlSession.close();
		
		System.out.println(result);
	}
}
