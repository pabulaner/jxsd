package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_ValAxModel;
import org.docx4j.dml.chart.CTValAx;

public class CT_ValAxConverter {
  private CT_ValAxConverter() {
  }

  public static CT_ValAxModel fromDocx4j(CTValAx value) {
    if (value == null) return null;
    return new CT_ValAxModel(CT_UnsignedIntConverter.fromDocx4j(value.getAxId()), CT_ScalingConverter.fromDocx4j(value.getScaling()), CT_BooleanConverter.fromDocx4j(value.getDelete()), CT_AxPosConverter.fromDocx4j(value.getAxPos()), CT_ChartLinesConverter.fromDocx4j(value.getMajorGridlines()), CT_ChartLinesConverter.fromDocx4j(value.getMinorGridlines()), CT_TitleConverter.fromDocx4j(value.getTitle()), CT_NumFmtConverter.fromDocx4j(value.getNumFmt()), CT_TickMarkConverter.fromDocx4j(value.getMajorTickMark()), CT_TickMarkConverter.fromDocx4j(value.getMinorTickMark()), CT_TickLblPosConverter.fromDocx4j(value.getTickLblPos()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_UnsignedIntConverter.fromDocx4j(value.getCrossAx()), CrossesOrCrossesAtConverter.fromDocx4j(value.getCrossesOrCrossesAt()), CT_CrossBetweenConverter.fromDocx4j(value.getCrossBetween()), CT_AxisUnitConverter.fromDocx4j(value.getMajorUnit()), CT_AxisUnitConverter.fromDocx4j(value.getMinorUnit()), CT_DispUnitsConverter.fromDocx4j(value.getDispUnits()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTValAx toDocx4j(CT_ValAxModel value) {
    return null;
  }

  public static class CrossesOrCrossesAtConverter {
    private CrossesOrCrossesAtConverter() {
    }

    public static CT_ValAxModel.CrossesOrCrossesAtModel fromDocx4j(
        CTValAx.CrossesOrCrossesAt value) {
      if (value == null) return null;
    }

    public static CTValAx.CrossesOrCrossesAt toDocx4j(CT_ValAxModel.CrossesOrCrossesAtModel value) {
      return null;
    }
  }
}
