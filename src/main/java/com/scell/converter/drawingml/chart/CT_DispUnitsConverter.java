package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DispUnitsModel;
import org.docx4j.dml.chart.CTDispUnits;

public class CT_DispUnitsConverter {
  private CT_DispUnitsConverter() {
  }

  public static CT_DispUnitsModel fromDocx4j(CTDispUnits value) {
    if (value == null) return null;
    return new CT_DispUnitsModel(CustUnitOrBuiltInUnitConverter.fromDocx4j(value.getCustUnitOrBuiltInUnit()), CT_DispUnitsLblConverter.fromDocx4j(value.getDispUnitsLbl()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDispUnits toDocx4j(CT_DispUnitsModel value) {
    return null;
  }

  public static class CustUnitOrBuiltInUnitConverter {
    private CustUnitOrBuiltInUnitConverter() {
    }

    public static CT_DispUnitsModel.CustUnitOrBuiltInUnitModel fromDocx4j(
        CTDispUnits.CustUnitOrBuiltInUnit value) {
      if (value == null) return null;
    }

    public static CTDispUnits.CustUnitOrBuiltInUnit toDocx4j(
        CT_DispUnitsModel.CustUnitOrBuiltInUnitModel value) {
      return null;
    }
  }
}
