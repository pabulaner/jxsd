package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_SerAxModel;
import org.docx4j.dml.chart.CTSerAx;

public class CT_SerAxConverter {
  private CT_SerAxConverter() {
  }

  public static CT_SerAxModel fromDocx4J(CTSerAx value) {
    if (value == null) return null;
    // look here false;
    CT_SerAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt = new CT_SerAxModel.CrossesOrCrossesAtModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = CT_SerAxModel.CrossesOrCrossesAtModel.newCrosses(CT_CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = CT_SerAxModel.CrossesOrCrossesAtModel.newCrossesAt(CT_DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new CT_SerAxModel(CT_UnsignedIntConverter.fromDocx4J(value.getAxId()), CT_ScalingConverter.fromDocx4J(value.getScaling()), CT_BooleanConverter.fromDocx4J(value.getDelete()), CT_AxPosConverter.fromDocx4J(value.getAxPos()), CT_ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), CT_ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), CT_TitleConverter.fromDocx4J(value.getTitle()), CT_NumFmtConverter.fromDocx4J(value.getNumFmt()), CT_TickMarkConverter.fromDocx4J(value.getMajorTickMark()), CT_TickMarkConverter.fromDocx4J(value.getMinorTickMark()), CT_TickLblPosConverter.fromDocx4J(value.getTickLblPos()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, CT_SkipConverter.fromDocx4J(value.getTickLblSkip()), CT_SkipConverter.fromDocx4J(value.getTickMarkSkip()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTSerAx toDocx4J(CT_SerAxModel value) {
    return null;
  }
}
