package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterBill;
import cj.netos.oc.wybank.model.ShunterBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterBillMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterBill> selectByExample(ShunterBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterBill selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterBill record, @Param("example") ShunterBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterBill record, @Param("example") ShunterBillExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterBill record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterBill record);
}