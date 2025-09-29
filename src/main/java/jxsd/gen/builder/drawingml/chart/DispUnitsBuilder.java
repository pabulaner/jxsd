package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import jxsd.gen.model.drawingml.chart.BuiltInUnitModel;
import jxsd.gen.model.drawingml.chart.DispUnitsLblModel;
import jxsd.gen.model.drawingml.chart.DispUnitsModel;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class DispUnitsBuilder {
  private DispUnitsModel.CustUnitOrBuiltInUnit custUnitOrBuiltInUnit;

  private DispUnitsLblModel dispUnitsLbl;

  private ExtensionListModel extLst;

  public DispUnitsBuilder() {
  }

  public DispUnitsBuilder setCustUnitOrBuiltInUnit(
      DispUnitsModel.CustUnitOrBuiltInUnit custUnitOrBuiltInUnit) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    return this;
  }

  public DispUnitsBuilder setDispUnitsLbl(DispUnitsLblModel dispUnitsLbl) {
    this.dispUnitsLbl = dispUnitsLbl;
    return this;
  }

  public DispUnitsBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DispUnitsBuilder from(DispUnitsModel value) {
    this.custUnitOrBuiltInUnit = value.getCustUnitOrBuiltInUnit();
    this.dispUnitsLbl = value.getDispUnitsLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public DispUnitsModel build() {
    return new DispUnitsModel(this.custUnitOrBuiltInUnit, this.dispUnitsLbl, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class CustUnitOrBuiltInUnit {
    private int type;

    private Object value;

    public CustUnitOrBuiltInUnit() {
      this.type = -1;
      this.value = null;
    }

    public CustUnitOrBuiltInUnit setCustUnit(DoubleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CustUnitOrBuiltInUnit setBuiltInUnit(BuiltInUnitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CustUnitOrBuiltInUnit from(DispUnitsModel.CustUnitOrBuiltInUnit value) {
      this.type = -1;
      this.value = null;
      if (value.isCustUnit()) {
        this.type = 0;
        this.value = value.getCustUnit();
      }
      if (value.isBuiltInUnit()) {
        this.type = 1;
        this.value = value.getBuiltInUnit();
      }
      return this;
    }

    public DispUnitsModel.CustUnitOrBuiltInUnit build() {
      if (this.type == -1) return new DispUnitsModel.CustUnitOrBuiltInUnit();
      if (this.type == 0) return DispUnitsModel.CustUnitOrBuiltInUnit.newCustUnit((DoubleModel) this.value);
      if (this.type == 1) return DispUnitsModel.CustUnitOrBuiltInUnit.newBuiltInUnit((BuiltInUnitModel) this.value);
      return null;
    }
  }
}
