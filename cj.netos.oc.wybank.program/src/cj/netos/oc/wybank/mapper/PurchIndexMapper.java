package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.PurchIndex;
import cj.netos.oc.wybank.model.PurchIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchIndexMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PurchIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PurchIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PurchIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PurchIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PurchIndex> selectByExample(PurchIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    PurchIndex selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") PurchIndex record, @Param("example") PurchIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") PurchIndex record, @Param("example") PurchIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(PurchIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(PurchIndex record);
}