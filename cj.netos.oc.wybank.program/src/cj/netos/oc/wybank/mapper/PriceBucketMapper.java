package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.PriceBucket;
import cj.netos.oc.wybank.model.PriceBucketExample;
import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;
import java.util.List;

public interface PriceBucketMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PriceBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PriceBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PriceBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PriceBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PriceBucket> selectByExample(PriceBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    PriceBucket selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") PriceBucket record, @Param("example") PriceBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") PriceBucket record, @Param("example") PriceBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(PriceBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(PriceBucket record);

    void updatePrice(@Param(value = "price") BigDecimal price, @Param(value = "bankid") String bankid);
}