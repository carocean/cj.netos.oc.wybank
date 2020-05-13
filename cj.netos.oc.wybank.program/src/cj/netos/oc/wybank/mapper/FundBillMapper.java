package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FundBill;
import cj.netos.oc.wybank.model.FundBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundBillMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FundBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FundBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FundBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FundBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FundBill> selectByExample(FundBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FundBill selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") FundBill record, @Param("example") FundBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") FundBill record, @Param("example") FundBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FundBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FundBill record);
}