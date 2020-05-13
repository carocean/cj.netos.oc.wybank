package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FundBucket;
import cj.netos.oc.wybank.model.FundBucketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundBucketMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FundBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FundBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FundBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FundBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FundBucket> selectByExample(FundBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FundBucket selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") FundBucket record, @Param("example") FundBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") FundBucket record, @Param("example") FundBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FundBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FundBucket record);
}