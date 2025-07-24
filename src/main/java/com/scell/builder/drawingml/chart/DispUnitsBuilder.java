package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitModel;
import com.scell.model.drawingml.chart.DispUnitsLblModel;
import com.scell.model.drawingml.chart.DispUnitsModel;
import com.scell.model.drawingml.chart.DoubleModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import java.lang.Object;

public class DispUnitsBuilder {
  private DispUnitsModel.CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;

  private DispUnitsLblModel dispUnitsLbl;

  private ExtensionListModel extLst;

  public DispUnitsBuilder() {
  }

  public DispUnitsBuilder setCustUnitOrBuiltInUnit(
      DispUnitsModel.CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit) {
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

  public DispUnitsModel build() {
    return new DispUnitsModel(this.custUnitOrBuiltInUnit, this.dispUnitsLbl, this.extLst);
  }

  public DispUnitsBuilder from(DispUnitsModel value) {
    this.custUnitOrBuiltInUnit = value.getCustUnitOrBuiltInUnit();
    this.dispUnitsLbl = value.getDispUnitsLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public static class CustUnitOrBuiltInUnitBuilder {
    private int type;

    private Object value;

    public CustUnitOrBuiltInUnitBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CustUnitOrBuiltInUnitBuilder setCustUnit(DoubleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CustUnitOrBuiltInUnitBuilder setBuiltInUnit(BuiltInUnitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DispUnitsModel.CustUnitOrBuiltInUnitModel build() {
      if (this.type == -1) return new DispUnitsModel.CustUnitOrBuiltInUnitModel();
      if (this.type == 0) return DispUnitsModel.CustUnitOrBuiltInUnitModel.newCustUnit((DoubleModel) this.value);
      if (this.type == 1) return DispUnitsModel.CustUnitOrBuiltInUnitModel.newBuiltInUnit((BuiltInUnitModel) this.value);
      return null;
    }

    public CustUnitOrBuiltInUnitBuilder from(DispUnitsModel.CustUnitOrBuiltInUnitModel value) {
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
  }
}
