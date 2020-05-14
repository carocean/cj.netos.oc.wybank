package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FreeBucket;
import cj.netos.oc.wybank.model.FreeBucketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeBucketMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FreeBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FreeBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FreeBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FreeBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FreeBucket> selectByExample(FreeBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FreeBucket selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") FreeBucket record, @Param("example") FreeBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") FreeBucket record, @Param("example") FreeBucketExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FreeBucket record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FreeBucket record);

    void updateAmount(@Param(value = "amount") Long amount, @Param(value = "bankid") String bankid);
}