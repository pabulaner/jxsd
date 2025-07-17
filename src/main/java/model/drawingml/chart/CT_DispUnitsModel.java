package model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;

public class CT_DispUnitsModel {
  private final custUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;

  private final CT_DispUnitsLblModel dispUnitsLbl;

  private final CT_ExtensionListModel extLst;

  public CT_DispUnitsModel(custUnitOrBuiltInUnitModel custUnitOrBuiltInUnit,
      CT_DispUnitsLblModel dispUnitsLbl, CT_ExtensionListModel extLst) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    this.dispUnitsLbl = dispUnitsLbl;
    this.extLst = extLst;
  }

  public custUnitOrBuiltInUnitModel getCustUnitOrBuiltInUnit() {
    return this.custUnitOrBuiltInUnit;
  }

  public CT_DispUnitsLblModel getDispUnitsLbl() {
    return this.dispUnitsLbl;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class custUnitOrBuiltInUnitModel {
    private final int type;

    private final Object value;

    public custUnitOrBuiltInUnitModel() {
      this(-1, null);
    }

    private custUnitOrBuiltInUnitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static custUnitOrBuiltInUnitModel newCustUnit(CT_DoubleModel value) {
      return new custUnitOrBuiltInUnitModel(0, value);
    }

    public boolean isCustUnit() {
      return this.type == 0;
    }

    public CT_DoubleModel getCustUnit() {
      return (CT_DoubleModel) this.value;
    }

    public static custUnitOrBuiltInUnitModel newBuiltInUnit(CT_BuiltInUnitModel value) {
      return new custUnitOrBuiltInUnitModel(1, value);
    }

    public boolean isBuiltInUnit() {
      return this.type == 1;
    }

    public CT_BuiltInUnitModel getBuiltInUnit() {
      return (CT_BuiltInUnitModel) this.value;
    }
  }
}
