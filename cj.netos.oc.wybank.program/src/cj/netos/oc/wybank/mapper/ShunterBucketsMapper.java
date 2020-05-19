package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterBuckets;
import cj.netos.oc.wybank.model.ShunterBucketsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterBucketsMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterBucketsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterBucketsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterBuckets record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterBuckets record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterBuckets> selectByExample(ShunterBucketsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterBuckets selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterBuckets record, @Param("example") ShunterBucketsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterBuckets record, @Param("example") ShunterBucketsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterBuckets record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterBuckets record);
}