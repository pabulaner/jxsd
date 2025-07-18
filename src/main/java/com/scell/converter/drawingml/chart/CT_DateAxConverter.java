package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DateAxModel;
import org.docx4j.dml.chart.CTDateAx;

public class CT_DateAxConverter {
  private CT_DateAxConverter() {
  }

  public static CT_DateAxModel fromDocx4J(CTDateAx value) {
    if (value == null) return null;
    // look here false;
    CT_DateAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt = new CT_DateAxModel.CrossesOrCrossesAtModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = CT_DateAxModel.CrossesOrCrossesAtModel.newCrosses(CT_CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = CT_DateAxModel.CrossesOrCrossesAtModel.newCrossesAt(CT_DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new CT_DateAxModel(CT_UnsignedIntConverter.fromDocx4J(value.getAxId()), CT_ScalingConverter.fromDocx4J(value.getScaling()), CT_BooleanConverter.fromDocx4J(value.getDelete()), CT_AxPosConverter.fromDocx4J(value.getAxPos()), CT_ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), CT_ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), CT_TitleConverter.fromDocx4J(value.getTitle()), CT_NumFmtConverter.fromDocx4J(value.getNumFmt()), CT_TickMarkConverter.fromDocx4J(value.getMajorTickMark()), CT_TickMarkConverter.fromDocx4J(value.getMinorTickMark()), CT_TickLblPosConverter.fromDocx4J(value.getTickLblPos()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, CT_BooleanConverter.fromDocx4J(value.getAuto()), CT_LblOffsetConverter.fromDocx4J(value.getLblOffset()), CT_TimeUnitConverter.fromDocx4J(value.getBaseTimeUnit()), CT_AxisUnitConverter.fromDocx4J(value.getMajorUnit()), CT_TimeUnitConverter.fromDocx4J(value.getMajorTimeUnit()), CT_AxisUnitConverter.fromDocx4J(value.getMinorUnit()), CT_TimeUnitConverter.fromDocx4J(value.getMinorTimeUnit()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDateAx toDocx4J(CT_DateAxModel value) {
    return null;
  }
}
