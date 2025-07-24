package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.CatAxModel;
import org.docx4j.dml.chart.CTCatAx;

public class CatAxConverter {
  private CatAxConverter() {
  }

  public static CatAxModel fromDocx4J(CTCatAx value) {
    if (value == null) return null;
    CatAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt = new CatAxModel.CrossesOrCrossesAtModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = CatAxModel.CrossesOrCrossesAtModel.newCrosses(CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = CatAxModel.CrossesOrCrossesAtModel.newCrossesAt(DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new CatAxModel(UnsignedIntConverter.fromDocx4J(value.getAxId()), ScalingConverter.fromDocx4J(value.getScaling()), BooleanConverter.fromDocx4J(value.getDelete()), AxPosConverter.fromDocx4J(value.getAxPos()), ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), TitleConverter.fromDocx4J(value.getTitle()), NumFmtConverter.fromDocx4J(value.getNumFmt()), TickMarkConverter.fromDocx4J(value.getMajorTickMark()), TickMarkConverter.fromDocx4J(value.getMinorTickMark()), TickLblPosConverter.fromDocx4J(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, BooleanConverter.fromDocx4J(value.getAuto()), LblAlgnConverter.fromDocx4J(value.getLblAlgn()), LblOffsetConverter.fromDocx4J(value.getLblOffset()), SkipConverter.fromDocx4J(value.getTickLblSkip()), SkipConverter.fromDocx4J(value.getTickMarkSkip()), BooleanConverter.fromDocx4J(value.getNoMultiLvlLbl()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
