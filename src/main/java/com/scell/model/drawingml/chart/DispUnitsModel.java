package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class DispUnitsModel {
  private final CustUnitOrBuiltInUnitValueModel custUnitOrBuiltInUnit;

  private final DispUnitsLblModel dispUnitsLbl;

  private final ExtensionListModel extLst;

  public DispUnitsModel(CustUnitOrBuiltInUnitValueModel custUnitOrBuiltInUnit,
      DispUnitsLblModel dispUnitsLbl, ExtensionListModel extLst) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    this.dispUnitsLbl = dispUnitsLbl;
    this.extLst = extLst;
  }

  public CustUnitOrBuiltInUnitValueModel getCustUnitOrBuiltInUnit() {
    return this.custUnitOrBuiltInUnit;
  }

  public DispUnitsLblModel getDispUnitsLbl() {
    return this.dispUnitsLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class CustUnitOrBuiltInUnitValueModel {
    private final int type;

    private final Object value;

    public CustUnitOrBuiltInUnitValueModel() {
      this(-1, null);
    }

    private CustUnitOrBuiltInUnitValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CustUnitOrBuiltInUnitValueModel newCustUnit(DoubleModel value) {
      return new CustUnitOrBuiltInUnitValueModel(0, value);
    }

    public boolean isCustUnit() {
      return this.type == 0;
    }

    public DoubleModel getCustUnit() {
      return (DoubleModel) this.value;
    }

    public static CustUnitOrBuiltInUnitValueModel newBuiltInUnit(BuiltInUnitModel value) {
      return new CustUnitOrBuiltInUnitValueModel(1, value);
    }

    public boolean isBuiltInUnit() {
      return this.type == 1;
    }

    public BuiltInUnitModel getBuiltInUnit() {
      return (BuiltInUnitModel) this.value;
    }
  }
}
