package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class CT_DispUnitsModel {
  private final CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;

  private final CT_DispUnitsLblModel dispUnitsLbl;

  private final CT_ExtensionListModel extLst;

  public CT_DispUnitsModel(CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit,
      CT_DispUnitsLblModel dispUnitsLbl, CT_ExtensionListModel extLst) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    this.dispUnitsLbl = dispUnitsLbl;
    this.extLst = extLst;
  }

  public CustUnitOrBuiltInUnitModel getCustUnitOrBuiltInUnit() {
    return this.custUnitOrBuiltInUnit;
  }

  public CT_DispUnitsLblModel getDispUnitsLbl() {
    return this.dispUnitsLbl;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class CustUnitOrBuiltInUnitModel {
    private final int type;

    private final Object value;

    public CustUnitOrBuiltInUnitModel() {
      this(-1, null);
    }

    private CustUnitOrBuiltInUnitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CustUnitOrBuiltInUnitModel newCustUnit(CT_DoubleModel value) {
      return new CustUnitOrBuiltInUnitModel(0, value);
    }

    public boolean isCustUnit() {
      return this.type == 0;
    }

    public CT_DoubleModel getCustUnit() {
      return (CT_DoubleModel) this.value;
    }

    public static CustUnitOrBuiltInUnitModel newBuiltInUnit(CT_BuiltInUnitModel value) {
      return new CustUnitOrBuiltInUnitModel(1, value);
    }

    public boolean isBuiltInUnit() {
      return this.type == 1;
    }

    public CT_BuiltInUnitModel getBuiltInUnit() {
      return (CT_BuiltInUnitModel) this.value;
    }
  }
}
