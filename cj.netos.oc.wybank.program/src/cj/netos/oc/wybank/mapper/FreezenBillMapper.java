package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.FreezenBill;
import cj.netos.oc.wybank.model.FreezenBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FreezenBillMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FreezenBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FreezenBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FreezenBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FreezenBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FreezenBill> selectByExample(FreezenBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FreezenBill selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") FreezenBill record, @Param("example") FreezenBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") FreezenBill record, @Param("example") FreezenBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FreezenBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FreezenBill record);

    List<FreezenBill> page(@Param(value = "bankid") String bankid, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

    long totalInBillOfMonth(@Param(value = "bankid") String bankid,  @Param(value = "year") int year,@Param(value = "month") int month);

    long totalOutBillOfMonth(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month);

    long totalInBillOfYear(@Param(value = "bankid") String bankid, @Param(value = "year") int year);

    long totalOutBillOfYear(@Param(value = "bankid") String bankid, @Param(value = "year") int year);

    List<FreezenBill> getBillOfMonth(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month, @Param(value = "limit") int limit, @Param(value = "offset") long offset);


}