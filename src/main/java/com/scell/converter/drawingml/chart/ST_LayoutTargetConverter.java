package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LayoutTargetModel;
import org.docx4j.dml.chart.STLayoutTarget;

public class ST_LayoutTargetConverter {
  private ST_LayoutTargetConverter() {
  }

  public static ST_LayoutTargetModel fromDocx4J(STLayoutTarget value) {
    if (value == null) return null;
    if (value == STLayoutTarget.INNER) return ST_LayoutTargetModel.INNER;
    if (value == STLayoutTarget.OUTER) return ST_LayoutTargetModel.OUTER;
    return null;
  }

  public static STLayoutTarget toDocx4J(ST_LayoutTargetModel value) {
    return null;
  }
}
