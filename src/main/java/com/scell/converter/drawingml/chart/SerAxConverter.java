package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.SerAxModel;
import org.docx4j.dml.chart.CTSerAx;

public class SerAxConverter {
  private SerAxConverter() {
  }

  public static SerAxModel fromDocx4J(CTSerAx value) {
    if (value == null) return null;
    SerAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt = new SerAxModel.CrossesOrCrossesAtModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = SerAxModel.CrossesOrCrossesAtModel.newCrosses(CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = SerAxModel.CrossesOrCrossesAtModel.newCrossesAt(DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new SerAxModel(UnsignedIntConverter.fromDocx4J(value.getAxId()), ScalingConverter.fromDocx4J(value.getScaling()), BooleanConverter.fromDocx4J(value.getDelete()), AxPosConverter.fromDocx4J(value.getAxPos()), ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), TitleConverter.fromDocx4J(value.getTitle()), NumFmtConverter.fromDocx4J(value.getNumFmt()), TickMarkConverter.fromDocx4J(value.getMajorTickMark()), TickMarkConverter.fromDocx4J(value.getMinorTickMark()), TickLblPosConverter.fromDocx4J(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, SkipConverter.fromDocx4J(value.getTickLblSkip()), SkipConverter.fromDocx4J(value.getTickMarkSkip()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
