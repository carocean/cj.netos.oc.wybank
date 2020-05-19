package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.StockBill;
import cj.netos.oc.wybank.model.StockBillExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface StockBillMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(StockBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(StockBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(StockBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(StockBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<StockBill> selectByExample(StockBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    StockBill selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") StockBill record, @Param("example") StockBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") StockBill record, @Param("example") StockBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(StockBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(StockBill record);

    List<StockBill> page(@Param(value = "bankid") String bankid, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

    BigDecimal totalInBillOfMonth(@Param(value = "bankid") String bankid, @Param(value = "month") int month);

    BigDecimal totalOutBillOfMonth(@Param(value = "bankid") String bankid, @Param(value = "month") int month);

    BigDecimal totalInBillOfYear(@Param(value = "bankid") String bankid, @Param(value = "year") int year);

    BigDecimal totalOutBillOfYear(@Param(value = "bankid") String bankid, @Param(value = "year") int year);
}