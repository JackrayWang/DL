package sds.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sds.db.dao.Roleitem;
import sds.db.dao.RoleitemExample;

public interface RoleitemMapper {
    long countByExample(RoleitemExample example);

    int deleteByExample(RoleitemExample example);

    int deleteByPrimaryKey(String idroleitem);

    int insert(Roleitem record);

    int insertSelective(Roleitem record);

    List<Roleitem> selectByExample(RoleitemExample example);

    Roleitem selectByPrimaryKey(String idroleitem);

    int updateByExampleSelective(@Param("record") Roleitem record, @Param("example") RoleitemExample example);

    int updateByExample(@Param("record") Roleitem record, @Param("example") RoleitemExample example);

    int updateByPrimaryKeySelective(Roleitem record);

    int updateByPrimaryKey(Roleitem record);
}