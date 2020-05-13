package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ShunterLedger;
import cj.netos.oc.wybank.model.ShunterLedgerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShunterLedgerMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShunterLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShunterLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShunterLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShunterLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShunterLedger> selectByExample(ShunterLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShunterLedger selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShunterLedger record, @Param("example") ShunterLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShunterLedger record, @Param("example") ShunterLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShunterLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShunterLedger record);
}