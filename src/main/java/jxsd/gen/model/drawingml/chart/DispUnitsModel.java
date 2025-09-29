package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.DispUnitsBuilder;

/**
 * This is a generated sequence class.
 */
public class DispUnitsModel {
  private final CustUnitOrBuiltInUnit custUnitOrBuiltInUnit;

  private final DispUnitsLblModel dispUnitsLbl;

  private final ExtensionListModel extLst;

  public DispUnitsModel(CustUnitOrBuiltInUnit custUnitOrBuiltInUnit, DispUnitsLblModel dispUnitsLbl,
      ExtensionListModel extLst) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    this.dispUnitsLbl = dispUnitsLbl;
    this.extLst = extLst;
  }

  public DispUnitsBuilder builder() {
    return new DispUnitsBuilder().from(this);
  }

  public CustUnitOrBuiltInUnit getCustUnitOrBuiltInUnit() {
    return this.custUnitOrBuiltInUnit;
  }

  public DispUnitsLblModel getDispUnitsLbl() {
    return this.dispUnitsLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class CustUnitOrBuiltInUnit {
    private final int type;

    private final Object value;

    public CustUnitOrBuiltInUnit() {
      this(-1, null);
    }

    private CustUnitOrBuiltInUnit(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public DispUnitsBuilder.CustUnitOrBuiltInUnit builder() {
      return new DispUnitsBuilder.CustUnitOrBuiltInUnit().from(this);
    }

    public static CustUnitOrBuiltInUnit newCustUnit(DoubleModel value) {
      return new CustUnitOrBuiltInUnit(0, value);
    }

    public boolean isCustUnit() {
      return this.type == 0;
    }

    public DoubleModel getCustUnit() {
      return (DoubleModel) this.value;
    }

    public static CustUnitOrBuiltInUnit newBuiltInUnit(BuiltInUnitModel value) {
      return new CustUnitOrBuiltInUnit(1, value);
    }

    public boolean isBuiltInUnit() {
      return this.type == 1;
    }

    public BuiltInUnitModel getBuiltInUnit() {
      return (BuiltInUnitModel) this.value;
    }
  }
}
