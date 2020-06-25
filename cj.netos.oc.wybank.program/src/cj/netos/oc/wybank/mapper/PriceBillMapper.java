package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.PriceBill;
import cj.netos.oc.wybank.model.PriceBillExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PriceBillMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PriceBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PriceBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PriceBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PriceBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PriceBill> selectByExample(PriceBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    PriceBill selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") PriceBill record, @Param("example") PriceBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") PriceBill record, @Param("example") PriceBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(PriceBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(PriceBill record);

    List<PriceBill> pagePriceBill(@Param(value = "bankid") String bankid, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

    List<PriceBill> getPriceBillOfMonth(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

    List<PriceBill> getPriceBillOfDay(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month, @Param(value = "day") int day, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

    List<PriceBill> getAfterTimePriceBill(@Param(value = "bankid") String bankid,@Param(value = "ctime") String ctime);

    PriceBill getOpenPrice(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month, @Param(value = "day") int day);

    PriceBill getClosePrice(@Param(value = "bankid") String bankid, @Param(value = "year") int year, @Param(value = "month") int month, @Param(value = "day") int day);

}