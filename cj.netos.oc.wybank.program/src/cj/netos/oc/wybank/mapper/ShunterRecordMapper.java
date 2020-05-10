package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterRecord;
import cj.netos.oc.wybank.model.ShunterRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterRecordMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterRecord record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterRecord record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterRecord> selectByExample(ShunterRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterRecord selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterRecord record, @Param("example") ShunterRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterRecord record, @Param("example") ShunterRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterRecord record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterRecord record);
}