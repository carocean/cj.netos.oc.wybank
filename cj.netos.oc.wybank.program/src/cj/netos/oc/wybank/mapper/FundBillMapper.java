package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FundBill;
import cj.netos.oc.wybank.model.FundBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    List<FundBill> page(@Param(value = "bankid") String bankid, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

    long totalInBillOfMonth(@Param(value = "bankid") String bankid,@Param(value = "year") int year, @Param(value = "month") int month);

    long totalOutBillOfMonth(@Param(value = "bankid") String bankid,@Param(value = "year") int year, @Param(value = "month") int month);

    long totalInBillOfYear(@Param(value = "bankid") String bankid, @Param(value = "year") int year);

    long totalOutBillOfYear(@Param(value = "bankid") String bankid, @Param(value = "year") int year);

    List<FundBill> getBillOfMonth(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month, @Param(value = "limit") int limit, @Param(value = "offset") long offset);


}