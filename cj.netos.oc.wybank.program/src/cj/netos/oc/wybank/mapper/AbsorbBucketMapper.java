package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.AbsorbBucket;
import cj.netos.oc.wybank.model.AbsorbBucketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbsorbBucketMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(AbsorbBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(AbsorbBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(AbsorbBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(AbsorbBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<AbsorbBucket> selectByExample(AbsorbBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    AbsorbBucket selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") AbsorbBucket record, @Param("example") AbsorbBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") AbsorbBucket record, @Param("example") AbsorbBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(AbsorbBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(AbsorbBucket record);
}