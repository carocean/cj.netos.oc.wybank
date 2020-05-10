package cj.netos.oc.wybank.mapper;

import cj.netos.oc.wybank.model.ExchangeLedger;
import cj.netos.oc.wybank.model.ExchangeLedgerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeLedgerMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ExchangeLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ExchangeLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ExchangeLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ExchangeLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ExchangeLedger> selectByExample(ExchangeLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ExchangeLedger selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ExchangeLedger record, @Param("example") ExchangeLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ExchangeLedger record, @Param("example") ExchangeLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ExchangeLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ExchangeLedger record);
}