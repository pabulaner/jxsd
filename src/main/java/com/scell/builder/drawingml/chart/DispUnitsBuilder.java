package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitModel;
import com.scell.model.drawingml.chart.DispUnitsLblModel;
import com.scell.model.drawingml.chart.DispUnitsModel;
import com.scell.model.drawingml.chart.DoubleModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import java.lang.Object;

public class DispUnitsBuilder {
  private DispUnitsModel.CustUnitOrBuiltInUnitValueModel custUnitOrBuiltInUnit;

  private DispUnitsLblModel dispUnitsLbl;

  private ExtensionListModel extLst;

  public DispUnitsBuilder() {
  }

  public DispUnitsBuilder setCustUnitOrBuiltInUnit(
      DispUnitsModel.CustUnitOrBuiltInUnitValueModel custUnitOrBuiltInUnit) {
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

  public static class CustUnitOrBuiltInUnitValueBuilder {
    private int type;

    private Object value;

    public CustUnitOrBuiltInUnitValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public CustUnitOrBuiltInUnitValueBuilder setCustUnit(DoubleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CustUnitOrBuiltInUnitValueBuilder setBuiltInUnit(BuiltInUnitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public DispUnitsModel.CustUnitOrBuiltInUnitValueModel build() {
      if (this.type == -1) return new DispUnitsModel.CustUnitOrBuiltInUnitValueModel();
      if (this.type == 0) return DispUnitsModel.CustUnitOrBuiltInUnitValueModel.newCustUnit((DoubleModel) this.value);
      if (this.type == 1) return DispUnitsModel.CustUnitOrBuiltInUnitValueModel.newBuiltInUnit((BuiltInUnitModel) this.value);
      return null;
    }

    public CustUnitOrBuiltInUnitValueBuilder from(
        DispUnitsModel.CustUnitOrBuiltInUnitValueModel value) {
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
