package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterLedgeDetails;
import cj.netos.oc.wybank.model.ShunterLedgeDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterLedgeDetailsMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterLedgeDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterLedgeDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterLedgeDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterLedgeDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterLedgeDetails> selectByExample(ShunterLedgeDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterLedgeDetails selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterLedgeDetails record, @Param("example") ShunterLedgeDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterLedgeDetails record, @Param("example") ShunterLedgeDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterLedgeDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterLedgeDetails record);
}