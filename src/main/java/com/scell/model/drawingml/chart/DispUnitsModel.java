package com.scell.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class DispUnitsModel {
  private final CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;

  private final DispUnitsLblModel dispUnitsLbl;

  private final ExtensionListModel extLst;

  public DispUnitsModel(CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit,
      DispUnitsLblModel dispUnitsLbl, ExtensionListModel extLst) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    this.dispUnitsLbl = dispUnitsLbl;
    this.extLst = extLst;
  }

  public CustUnitOrBuiltInUnitModel getCustUnitOrBuiltInUnit() {
    return this.custUnitOrBuiltInUnit;
  }

  public DispUnitsLblModel getDispUnitsLbl() {
    return this.dispUnitsLbl;
  }

  public ExtensionListModel getExtLst() {
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

    public static CustUnitOrBuiltInUnitModel newCustUnit(DoubleModel value) {
      return new CustUnitOrBuiltInUnitModel(0, value);
    }

    public boolean isCustUnit() {
      return this.type == 0;
    }

    public DoubleModel getCustUnit() {
      return (DoubleModel) this.value;
    }

    public static CustUnitOrBuiltInUnitModel newBuiltInUnit(BuiltInUnitModel value) {
      return new CustUnitOrBuiltInUnitModel(1, value);
    }

    public boolean isBuiltInUnit() {
      return this.type == 1;
    }

    public BuiltInUnitModel getBuiltInUnit() {
      return (BuiltInUnitModel) this.value;
    }
  }
}
