package bat.com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import bat.com.domain.Order;
import bat.com.util.MyBatisUtil;

public class OrderXmlMapper {
	
	
	@Test
	public void getOrder() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.orderMapper.getOrder";//映射sql的标识字符串
		
		Order order = sqlSession.selectOne(statement, 1);
		
		sqlSession.close();
		
		System.out.println(order);
	}
	
	@Test
	public void getRightOrder() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.orderMapper.getRightOrder";//映射sql的标识字符串
		
		Order order = sqlSession.selectOne(statement, 1);
		
		sqlSession.close();
		
		System.out.println(order);
	}
	
	@Test
	public void selectOrderResultMap() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		
		String statement = "bat.com.mapping.orderMapper.selectOrderResultMap";//映射sql的标识字符串
		
		Order order = sqlSession.selectOne(statement, 1);
		
		sqlSession.close();
		
		System.out.println(order);
	}
}
