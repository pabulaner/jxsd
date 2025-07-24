package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.FirstSliceAngModel;
import org.docx4j.dml.chart.CTFirstSliceAng;

public class FirstSliceAngConverter {
  private FirstSliceAngConverter() {
  }

  public static FirstSliceAngModel fromDocx4J(CTFirstSliceAng value) {
    if (value == null) return null;
    return new FirstSliceAngModel(FirstSliceAngConverter.fromDocx4J(value.getVal()));
  }
}
