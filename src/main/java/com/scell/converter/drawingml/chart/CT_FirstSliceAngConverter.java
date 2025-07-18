package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_FirstSliceAngModel;
import org.docx4j.dml.chart.CTFirstSliceAng;

public class CT_FirstSliceAngConverter {
  private CT_FirstSliceAngConverter() {
  }

  public static CT_FirstSliceAngModel fromDocx4J(CTFirstSliceAng value) {
    if (value == null) return null;
    return new CT_FirstSliceAngModel(ST_FirstSliceAngConverter.fromDocx4J(value.getVal()));
  }

  public static CTFirstSliceAng toDocx4J(CT_FirstSliceAngModel value) {
    return null;
  }
}
