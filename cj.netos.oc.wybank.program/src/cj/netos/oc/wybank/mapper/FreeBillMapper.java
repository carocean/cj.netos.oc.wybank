package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FreeBill;
import cj.netos.oc.wybank.model.FreeBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeBillMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FreeBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FreeBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FreeBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FreeBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FreeBill> selectByExample(FreeBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FreeBill selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") FreeBill record, @Param("example") FreeBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") FreeBill record, @Param("example") FreeBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FreeBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FreeBill record);
}