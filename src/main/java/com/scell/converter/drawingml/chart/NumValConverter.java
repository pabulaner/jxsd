package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.NumValModel;
import org.docx4j.dml.chart.CTNumVal;

public class NumValConverter {
  private NumValConverter() {
  }

  public static NumValModel fromDocx4J(CTNumVal value) {
    if (value == null) return null;
    return new NumValModel(XstringConverter.fromDocx4J(value.getFormatCode()), UnsignedIntConverter.fromDocx4J(value.getIdx()), XstringConverter.fromDocx4J(value.getV()));
  }
}
