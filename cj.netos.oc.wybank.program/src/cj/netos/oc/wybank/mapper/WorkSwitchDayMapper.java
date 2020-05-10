package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.WorkSwitchDay;
import cj.netos.oc.wybank.model.WorkSwitchDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkSwitchDayMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(WorkSwitchDayExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(WorkSwitchDayExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(WorkSwitchDay record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(WorkSwitchDay record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<WorkSwitchDay> selectByExample(WorkSwitchDayExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    WorkSwitchDay selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") WorkSwitchDay record, @Param("example") WorkSwitchDayExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") WorkSwitchDay record, @Param("example") WorkSwitchDayExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(WorkSwitchDay record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(WorkSwitchDay record);
}