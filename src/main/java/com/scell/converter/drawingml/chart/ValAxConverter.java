package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.ValAxModel;
import org.docx4j.dml.chart.CTValAx;

public class ValAxConverter {
  private ValAxConverter() {
  }

  public static ValAxModel fromDocx4J(CTValAx value) {
    if (value == null) return null;
    ValAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt = new ValAxModel.CrossesOrCrossesAtModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = ValAxModel.CrossesOrCrossesAtModel.newCrosses(CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = ValAxModel.CrossesOrCrossesAtModel.newCrossesAt(DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new ValAxModel(UnsignedIntConverter.fromDocx4J(value.getAxId()), ScalingConverter.fromDocx4J(value.getScaling()), BooleanConverter.fromDocx4J(value.getDelete()), AxPosConverter.fromDocx4J(value.getAxPos()), ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), TitleConverter.fromDocx4J(value.getTitle()), NumFmtConverter.fromDocx4J(value.getNumFmt()), TickMarkConverter.fromDocx4J(value.getMajorTickMark()), TickMarkConverter.fromDocx4J(value.getMinorTickMark()), TickLblPosConverter.fromDocx4J(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, CrossBetweenConverter.fromDocx4J(value.getCrossBetween()), AxisUnitConverter.fromDocx4J(value.getMajorUnit()), AxisUnitConverter.fromDocx4J(value.getMinorUnit()), DispUnitsConverter.fromDocx4J(value.getDispUnits()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
