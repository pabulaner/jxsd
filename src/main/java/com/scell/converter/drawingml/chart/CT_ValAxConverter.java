package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_ValAxModel;
import org.docx4j.dml.chart.CTValAx;

public class CT_ValAxConverter {
  private CT_ValAxConverter() {
  }

  public static CT_ValAxModel fromDocx4J(CTValAx value) {
    if (value == null) return null;
    // look here false;
    CT_ValAxModel.CrossesOrCrossesAtModel crossesOrCrossesAt = new CT_ValAxModel.CrossesOrCrossesAtModel();
    if (value.getCrosses() != null) crossesOrCrossesAt = CT_ValAxModel.CrossesOrCrossesAtModel.newCrosses(CT_CrossesConverter.fromDocx4J(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = CT_ValAxModel.CrossesOrCrossesAtModel.newCrossesAt(CT_DoubleConverter.fromDocx4J(value.getCrossesAt()));
    return new CT_ValAxModel(CT_UnsignedIntConverter.fromDocx4J(value.getAxId()), CT_ScalingConverter.fromDocx4J(value.getScaling()), CT_BooleanConverter.fromDocx4J(value.getDelete()), CT_AxPosConverter.fromDocx4J(value.getAxPos()), CT_ChartLinesConverter.fromDocx4J(value.getMajorGridlines()), CT_ChartLinesConverter.fromDocx4J(value.getMinorGridlines()), CT_TitleConverter.fromDocx4J(value.getTitle()), CT_NumFmtConverter.fromDocx4J(value.getNumFmt()), CT_TickMarkConverter.fromDocx4J(value.getMajorTickMark()), CT_TickMarkConverter.fromDocx4J(value.getMinorTickMark()), CT_TickLblPosConverter.fromDocx4J(value.getTickLblPos()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyConverter.fromDocx4J(value.getTxPr()), CT_UnsignedIntConverter.fromDocx4J(value.getCrossAx()), crossesOrCrossesAt, CT_CrossBetweenConverter.fromDocx4J(value.getCrossBetween()), CT_AxisUnitConverter.fromDocx4J(value.getMajorUnit()), CT_AxisUnitConverter.fromDocx4J(value.getMinorUnit()), CT_DispUnitsConverter.fromDocx4J(value.getDispUnits()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTValAx toDocx4J(CT_ValAxModel value) {
    return null;
  }
}
