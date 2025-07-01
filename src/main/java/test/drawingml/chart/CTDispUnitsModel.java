package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTDispUnitsModel {
  private final CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;

  private final CTDispUnitsLblModel dispUnitsLbl;

  private final CTExtensionListModel extLst;

  public CTDispUnitsModel(CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit,
      CTDispUnitsLblModel dispUnitsLbl, CTExtensionListModel extLst) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    this.dispUnitsLbl = dispUnitsLbl;
    this.extLst = extLst;
  }

  public CustUnitOrBuiltInUnitModel getCustUnitOrBuiltInUnit() {
    return this.custUnitOrBuiltInUnit;
  }

  public CTDispUnitsLblModel getDispUnitsLbl() {
    return this.dispUnitsLbl;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class CustUnitOrBuiltInUnitModel {
    private final Integer type;

    private final Object value;

    public CustUnitOrBuiltInUnitModel() {
      this(-1, null);
    }

    private CustUnitOrBuiltInUnitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static CustUnitOrBuiltInUnitModel newCustUnit(CTDoubleModel value) {
      return new CustUnitOrBuiltInUnitModel(0, value);
    }

    public Boolean isCustUnit() {
      return this.type == 0;
    }

    public CTDoubleModel getCustUnit() {
      return (CTDoubleModel) this.value;
    }

    public static CustUnitOrBuiltInUnitModel newBuiltInUnit(CTBuiltInUnitModel value) {
      return new CustUnitOrBuiltInUnitModel(1, value);
    }

    public Boolean isBuiltInUnit() {
      return this.type == 1;
    }

    public CTBuiltInUnitModel getBuiltInUnit() {
      return (CTBuiltInUnitModel) this.value;
    }
  }
}
