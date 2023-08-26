package com.folder.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.folder.app.dto.UserDTO;

@Mapper
public interface UserMapper {

    @Select("select * from user3")
    public List<UserDTO> findAll();

    @Update("update user3 set name = #{name}, email = #{email}, pwd = #{pwd}, gender = #{gender} where no = #{no} ")
    public int editById(UserDTO uDto);

    // @Update("update user3 set del = true where no = #{no}")
    // public int delete(int no);
    
    @Delete("delete from user3 where no = #{no}")
    public int delete(int no);

    @Insert("insert into user3 (name, email, pwd, gender) values (#{name}, #{email}, #{pwd}, #{gender})")
    public int save(UserDTO uDto);
}
