package cn.martin.boot.repository;

import cn.martin.boot.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lcssos on 16/4/21.
 */

public interface LoginMapper {

//    @Select("select * from tlogin where uuid=#{uuid}")
    Login selectByPrimaryKey(@Param("uuid") Long uuid);

}
