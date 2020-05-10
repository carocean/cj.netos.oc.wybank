package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterDetails;
import cj.netos.oc.wybank.model.ShunterDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterDetailsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterDetails> selectByExample(ShunterDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterDetails selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterDetails record, @Param("example") ShunterDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterDetails record, @Param("example") ShunterDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterDetails record);
}