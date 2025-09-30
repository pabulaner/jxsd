package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DispUnitsModel;
import org.docx4j.dml.chart.CTDispUnits;

/**
 * This is a generated sequence class.
 */
public class DispUnitsConverter {
  private DispUnitsConverter() {
  }

  public static DispUnitsModel fromDocx4j(CTDispUnits value) {
    if (value == null) return null;
    DispUnitsModel.CustUnitOrBuiltInUnit custUnitOrBuiltInUnit = new DispUnitsModel.CustUnitOrBuiltInUnit();
    if (value.getCustUnit() != null) custUnitOrBuiltInUnit = DispUnitsModel.CustUnitOrBuiltInUnit.newCustUnit(DoubleConverter.fromDocx4j(value.getCustUnit()));
    if (value.getBuiltInUnit() != null) custUnitOrBuiltInUnit = DispUnitsModel.CustUnitOrBuiltInUnit.newBuiltInUnit(BuiltInUnitConverter.fromDocx4j(value.getBuiltInUnit()));
    return new DispUnitsModel(custUnitOrBuiltInUnit, DispUnitsLblConverter.fromDocx4j(value.getDispUnitsLbl()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDispUnits toDocx4j(DispUnitsModel value) {
    if (value == null) return null;
    CTDispUnits result = new CTDispUnits();
    result.setDispUnitsLbl(DispUnitsLblConverter.toDocx4j(value.getDispUnitsLbl()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getCustUnitOrBuiltInUnit().isCustUnit()) result.setCustUnit(DoubleConverter.toDocx4j(value.getCustUnitOrBuiltInUnit().getCustUnit()));
    if (value.getCustUnitOrBuiltInUnit().isBuiltInUnit()) result.setBuiltInUnit(BuiltInUnitConverter.toDocx4j(value.getCustUnitOrBuiltInUnit().getBuiltInUnit()));
    return result;
  }
}
