package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SplitTypeValueModel;
import org.docx4j.dml.chart.STSplitType;

public class SplitTypeValueConverter {
  private SplitTypeValueConverter() {
  }

  public static SplitTypeValueModel fromDocx4J(STSplitType value) {
    if (value == null) return null;
    if (value == STSplitType.AUTO) return SplitTypeValueModel.AUTO;
    if (value == STSplitType.CUST) return SplitTypeValueModel.CUST;
    if (value == STSplitType.PERCENT) return SplitTypeValueModel.PERCENT;
    if (value == STSplitType.POS) return SplitTypeValueModel.POS;
    if (value == STSplitType.VAL) return SplitTypeValueModel.VAL;
    return null;
  }
}
