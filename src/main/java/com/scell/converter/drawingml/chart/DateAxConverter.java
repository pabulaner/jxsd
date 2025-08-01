package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.DateAxModel;
import org.docx4j.dml.chart.CTDateAx;

public class DateAxConverter {
  private DateAxConverter() {
  }

  public static DateAxModel fromDocx4J(CTDateAx value) {
    if (value == null) return null;
    DateAxModel.CrossesOrCrossesAtValueModel crossesOrCrossesAt = new DateAxModel.CrossesOrCrossesAtValueModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = DateAxModel.CrossesOrCrossesAtValueModel.newCrosses(CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = DateAxModel.CrossesOrCrossesAtValueModel.newCrossesAt(DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new DateAxModel(UnsignedIntConverter.fromDocx4J(value.getAxId()), ScalingConverter.fromDocx4J(value.getScaling()), BooleanConverter.fromDocx4J(value.getDelete()), AxPosConverter.fromDocx4J(value.getAxPos()), ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), TitleConverter.fromDocx4J(value.getTitle()), NumFmtConverter.fromDocx4J(value.getNumFmt()), TickMarkConverter.fromDocx4J(value.getMajorTickMark()), TickMarkConverter.fromDocx4J(value.getMinorTickMark()), TickLblPosConverter.fromDocx4J(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, BooleanConverter.fromDocx4J(value.getAuto()), LblOffsetConverter.fromDocx4J(value.getLblOffset()), TimeUnitConverter.fromDocx4J(value.getBaseTimeUnit()), AxisUnitConverter.fromDocx4J(value.getMajorUnit()), TimeUnitConverter.fromDocx4J(value.getMajorTimeUnit()), AxisUnitConverter.fromDocx4J(value.getMinorUnit()), TimeUnitConverter.fromDocx4J(value.getMinorTimeUnit()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
