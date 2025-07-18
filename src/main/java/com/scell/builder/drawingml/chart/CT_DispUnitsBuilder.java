package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BuiltInUnitModel;
import com.scell.model.drawingml.chart.CT_DispUnitsLblModel;
import com.scell.model.drawingml.chart.CT_DispUnitsModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import java.lang.Object;

public class CT_DispUnitsBuilder {
  private CT_DispUnitsModel.CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit;

  private CT_DispUnitsLblModel dispUnitsLbl;

  private CT_ExtensionListModel extLst;

  public CT_DispUnitsBuilder() {
  }

  public CT_DispUnitsBuilder setCustUnitOrBuiltInUnit(
      CT_DispUnitsModel.CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit) {
    this.custUnitOrBuiltInUnit = custUnitOrBuiltInUnit;
    return this;
  }

  public CT_DispUnitsBuilder setDispUnitsLbl(CT_DispUnitsLblModel dispUnitsLbl) {
    this.dispUnitsLbl = dispUnitsLbl;
    return this;
  }

  public CT_DispUnitsBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DispUnitsModel build() {
    return new CT_DispUnitsModel(this.custUnitOrBuiltInUnit, this.dispUnitsLbl, this.extLst);
  }

  public CT_DispUnitsBuilder from(CT_DispUnitsModel value) {
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

    public CustUnitOrBuiltInUnitBuilder setCustUnit(CT_DoubleModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public CustUnitOrBuiltInUnitBuilder setBuiltInUnit(CT_BuiltInUnitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public CT_DispUnitsModel.CustUnitOrBuiltInUnitModel build() {
      if (this.type == -1) return new CT_DispUnitsModel.CustUnitOrBuiltInUnitModel();
      if (this.type == 0) return CT_DispUnitsModel.CustUnitOrBuiltInUnitModel.newCustUnit((CT_DoubleModel) this.value);
      if (this.type == 1) return CT_DispUnitsModel.CustUnitOrBuiltInUnitModel.newBuiltInUnit((CT_BuiltInUnitModel) this.value);
      return null;
    }

    public CustUnitOrBuiltInUnitBuilder from(CT_DispUnitsModel.CustUnitOrBuiltInUnitModel value) {
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
