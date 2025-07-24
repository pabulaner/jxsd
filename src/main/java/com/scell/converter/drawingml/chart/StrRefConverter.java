package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.chart.StrRefModel;
import org.docx4j.dml.chart.CTStrRef;

public class StrRefConverter {
  private StrRefConverter() {
  }

  public static StrRefModel fromDocx4J(CTStrRef value) {
    if (value == null) return null;
    return new StrRefModel(StringConverter.fromDocx4J(value.getF()), StrDataConverter.fromDocx4J(value.getStrCache()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
