package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FreezenBucket;
import cj.netos.oc.wybank.model.FreezenBucketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreezenBucketMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FreezenBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FreezenBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FreezenBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FreezenBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FreezenBucket> selectByExample(FreezenBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FreezenBucket selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") FreezenBucket record, @Param("example") FreezenBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") FreezenBucket record, @Param("example") FreezenBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FreezenBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FreezenBucket record);
}