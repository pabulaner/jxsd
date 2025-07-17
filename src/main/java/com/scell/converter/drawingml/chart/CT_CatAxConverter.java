package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_CatAxModel;
import org.docx4j.dml.chart.CTCatAx;

public class CT_CatAxConverter {
  private CT_CatAxConverter() {
  }

  public static CT_CatAxModel fromDocx4j(CTCatAx value) {
    if (value == null) return null;
    return new CT_CatAxModel(CT_UnsignedIntConverter.fromDocx4j(value.getAxId()), CT_ScalingConverter.fromDocx4j(value.getScaling()), CT_BooleanConverter.fromDocx4j(value.getDelete()), CT_AxPosConverter.fromDocx4j(value.getAxPos()), CT_ChartLinesConverter.fromDocx4j(value.getMajorGridlines()), CT_ChartLinesConverter.fromDocx4j(value.getMinorGridlines()), CT_TitleConverter.fromDocx4j(value.getTitle()), CT_NumFmtConverter.fromDocx4j(value.getNumFmt()), CT_TickMarkConverter.fromDocx4j(value.getMajorTickMark()), CT_TickMarkConverter.fromDocx4j(value.getMinorTickMark()), CT_TickLblPosConverter.fromDocx4j(value.getTickLblPos()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_UnsignedIntConverter.fromDocx4j(value.getCrossAx()), CrossesOrCrossesAtConverter.fromDocx4j(value.getCrossesOrCrossesAt()), CT_BooleanConverter.fromDocx4j(value.getAuto()), CT_LblAlgnConverter.fromDocx4j(value.getLblAlgn()), CT_LblOffsetConverter.fromDocx4j(value.getLblOffset()), CT_SkipConverter.fromDocx4j(value.getTickLblSkip()), CT_SkipConverter.fromDocx4j(value.getTickMarkSkip()), CT_BooleanConverter.fromDocx4j(value.getNoMultiLvlLbl()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTCatAx toDocx4j(CT_CatAxModel value) {
    return null;
  }

  public static class CrossesOrCrossesAtConverter {
    private CrossesOrCrossesAtConverter() {
    }

    public static CT_CatAxModel.CrossesOrCrossesAtModel fromDocx4j(
        CTCatAx.CrossesOrCrossesAt value) {
      if (value == null) return null;
    }

    public static CTCatAx.CrossesOrCrossesAt toDocx4j(CT_CatAxModel.CrossesOrCrossesAtModel value) {
      return null;
    }
  }
}
