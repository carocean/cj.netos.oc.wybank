package cj.netos.oc.wybank.bo;

import cj.netos.oc.wybank.bo.model.ShuntRecord;

public class ShuntoutResponse {
    String operator;
    String operatorName;
    String wenyBankID;
    ShuntRecord record;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getWenyBankID() {
        return wenyBankID;
    }

    public void setWenyBankID(String wenyBankID) {
        this.wenyBankID = wenyBankID;
    }

    public ShuntRecord getRecord() {
        return record;
    }

    public void setRecord(ShuntRecord record) {
        this.record = record;
    }
}
