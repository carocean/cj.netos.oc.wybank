package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterIndexDetails;
import cj.netos.oc.wybank.model.ShunterIndexDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterIndexDetailsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterIndexDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterIndexDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterIndexDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterIndexDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterIndexDetails> selectByExample(ShunterIndexDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterIndexDetails selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterIndexDetails record, @Param("example") ShunterIndexDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterIndexDetails record, @Param("example") ShunterIndexDetailsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterIndexDetails record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterIndexDetails record);
}