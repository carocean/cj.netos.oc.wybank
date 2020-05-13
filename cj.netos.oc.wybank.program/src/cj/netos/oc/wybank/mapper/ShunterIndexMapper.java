package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterIndex;
import cj.netos.oc.wybank.model.ShunterIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterIndexMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterIndex> selectByExample(ShunterIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterIndex selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterIndex record, @Param("example") ShunterIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterIndex record, @Param("example") ShunterIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterIndex record);
}