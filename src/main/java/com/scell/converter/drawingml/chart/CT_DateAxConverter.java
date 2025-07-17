package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DateAxModel;
import org.docx4j.dml.chart.CTDateAx;

public class CT_DateAxConverter {
  private CT_DateAxConverter() {
  }

  public static CT_DateAxModel fromDocx4j(CTDateAx value) {
    if (value == null) return null;
    return new CT_DateAxModel(CT_UnsignedIntConverter.fromDocx4j(value.getAxId()), CT_ScalingConverter.fromDocx4j(value.getScaling()), CT_BooleanConverter.fromDocx4j(value.getDelete()), CT_AxPosConverter.fromDocx4j(value.getAxPos()), CT_ChartLinesConverter.fromDocx4j(value.getMajorGridlines()), CT_ChartLinesConverter.fromDocx4j(value.getMinorGridlines()), CT_TitleConverter.fromDocx4j(value.getTitle()), CT_NumFmtConverter.fromDocx4j(value.getNumFmt()), CT_TickMarkConverter.fromDocx4j(value.getMajorTickMark()), CT_TickMarkConverter.fromDocx4j(value.getMinorTickMark()), CT_TickLblPosConverter.fromDocx4j(value.getTickLblPos()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_UnsignedIntConverter.fromDocx4j(value.getCrossAx()), CrossesOrCrossesAtConverter.fromDocx4j(value.getCrossesOrCrossesAt()), CT_BooleanConverter.fromDocx4j(value.getAuto()), CT_LblOffsetConverter.fromDocx4j(value.getLblOffset()), CT_TimeUnitConverter.fromDocx4j(value.getBaseTimeUnit()), CT_AxisUnitConverter.fromDocx4j(value.getMajorUnit()), CT_TimeUnitConverter.fromDocx4j(value.getMajorTimeUnit()), CT_AxisUnitConverter.fromDocx4j(value.getMinorUnit()), CT_TimeUnitConverter.fromDocx4j(value.getMinorTimeUnit()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDateAx toDocx4j(CT_DateAxModel value) {
    return null;
  }

  public static class CrossesOrCrossesAtConverter {
    private CrossesOrCrossesAtConverter() {
    }

    public static CT_DateAxModel.CrossesOrCrossesAtModel fromDocx4j(
        CTDateAx.CrossesOrCrossesAt value) {
      if (value == null) return null;
    }

    public static CTDateAx.CrossesOrCrossesAt toDocx4j(
        CT_DateAxModel.CrossesOrCrossesAtModel value) {
      return null;
    }
  }
}
