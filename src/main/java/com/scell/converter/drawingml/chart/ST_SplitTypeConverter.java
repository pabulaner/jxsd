package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SplitTypeModel;
import org.docx4j.dml.chart.STSplitType;

public class ST_SplitTypeConverter {
  private ST_SplitTypeConverter() {
  }

  public static ST_SplitTypeModel fromDocx4J(STSplitType value) {
    if (value == null) return null;
    if (value == STSplitType.AUTO) return ST_SplitTypeModel.AUTO;
    if (value == STSplitType.CUST) return ST_SplitTypeModel.CUST;
    if (value == STSplitType.PERCENT) return ST_SplitTypeModel.PERCENT;
    if (value == STSplitType.POS) return ST_SplitTypeModel.POS;
    if (value == STSplitType.VAL) return ST_SplitTypeModel.VAL;
    return null;
  }

  public static STSplitType toDocx4J(ST_SplitTypeModel value) {
    return null;
  }
}
