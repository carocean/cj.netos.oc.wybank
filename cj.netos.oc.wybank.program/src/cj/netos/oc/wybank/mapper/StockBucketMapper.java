package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.StockBucket;
import cj.netos.oc.wybank.model.StockBucketExample;
import org.apache.ibatis.annotations.Param;
import java.math.BigDecimal;
import java.util.List;

public interface StockBucketMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(StockBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(StockBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(StockBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(StockBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<StockBucket> selectByExample(StockBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    StockBucket selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") StockBucket record, @Param("example") StockBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") StockBucket record, @Param("example") StockBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(StockBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(StockBucket record);

    void updateStock(@Param(value = "stock") BigDecimal stock, @Param(value = "bankid") String bankid);

    List<StockBucket> page(@Param(value = "limit") int limit, @Param(value = "offset") long offset);
}