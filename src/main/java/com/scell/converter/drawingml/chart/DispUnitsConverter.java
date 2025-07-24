package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DispUnitsModel;
import org.docx4j.dml.chart.CTDispUnits;

public class DispUnitsConverter {
  private DispUnitsConverter() {
  }

  public static DispUnitsModel fromDocx4J(CTDispUnits value) {
    if (value == null) return null;
    DispUnitsModel.CustUnitOrBuiltInUnitModel custUnitOrBuiltInUnit = new DispUnitsModel.CustUnitOrBuiltInUnitModel();
    if (value.getCustUnit() != null) custUnitOrBuiltInUnit = DispUnitsModel.CustUnitOrBuiltInUnitModel.newCustUnit(DoubleConverter.fromDocx4J(value.getCustUnit()));
    if (value.getBuiltInUnit() != null) custUnitOrBuiltInUnit = DispUnitsModel.CustUnitOrBuiltInUnitModel.newBuiltInUnit(BuiltInUnitConverter.fromDocx4J(value.getBuiltInUnit()));
    return new DispUnitsModel(custUnitOrBuiltInUnit, DispUnitsLblConverter.fromDocx4J(value.getDispUnitsLbl()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
