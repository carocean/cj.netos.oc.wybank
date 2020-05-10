package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ExchangeIndex;
import cj.netos.oc.wybank.model.ExchangeIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeIndexMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ExchangeIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ExchangeIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ExchangeIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ExchangeIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ExchangeIndex> selectByExample(ExchangeIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ExchangeIndex selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ExchangeIndex record, @Param("example") ExchangeIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ExchangeIndex record, @Param("example") ExchangeIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ExchangeIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ExchangeIndex record);
}