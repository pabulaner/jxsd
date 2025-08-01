package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntValueConverter;
import com.scell.model.drawingml.chart.NumValModel;
import org.docx4j.dml.chart.CTNumVal;

public class NumValConverter {
  private NumValConverter() {
  }

  public static NumValModel fromDocx4J(CTNumVal value) {
    if (value == null) return null;
    return new NumValModel(XstringValueConverter.fromDocx4J(value.getFormatCode()), UnsignedIntValueConverter.fromDocx4J(value.getIdx()), XstringValueConverter.fromDocx4J(value.getV()));
  }
}
