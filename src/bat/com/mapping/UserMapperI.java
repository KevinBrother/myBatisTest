package bat.com.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bat.com.domain.User;

public interface UserMapperI {
	
	@Insert("insert into user(name, age) values(#{name}, #{age})") 
	public int add(User user);
	
	@Delete("delete from user where id=#{id}")
	public int delete(int id);
	
	@Update("update user set name=#{name}, age=#{age} where id=#{id}")
	public int update(User user);
	
	@Select("select * from user where id=#{id}")
	public User select(int id);
	
	@Select("select * from user")
	public List<User> allUser();
	
}
