package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DispUnitsModel;
import org.docx4j.dml.chart.CTDispUnits;

public class CT_DispUnitsConverter {
  private CT_DispUnitsConverter() {
  }

  public static CT_DispUnitsModel fromDocx4J(CTDispUnits value) {
    if (value == null) return null;
    // look here false;
    CT_DispUnitsModel.CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit = new CT_DispUnitsModel.CustUnitOrBuiltInUnitModel();
    if (value.getCustUnit() != null) custUnitOrBuiltInUnit = CT_DispUnitsModel.CustUnitOrBuiltInUnitModel.newCustUnit(CT_DoubleConverter.fromDocx4J(value.getCustUnit()));
    if (value.getBuiltInUnit() != null) custUnitOrBuiltInUnit = CT_DispUnitsModel.CustUnitOrBuiltInUnitModel.newBuiltInUnit(CT_BuiltInUnitConverter.fromDocx4J(value.getBuiltInUnit()));
    return new CT_DispUnitsModel(custUnitOrBuiltInUnit, CT_DispUnitsLblConverter.fromDocx4J(value.getDispUnitsLbl()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDispUnits toDocx4J(CT_DispUnitsModel value) {
    return null;
  }
}
