package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.chart.NumRefModel;
import org.docx4j.dml.chart.CTNumRef;

public class NumRefConverter {
  private NumRefConverter() {
  }

  public static NumRefModel fromDocx4J(CTNumRef value) {
    if (value == null) return null;
    return new NumRefModel(StringConverter.fromDocx4J(value.getF()), NumDataConverter.fromDocx4J(value.getNumCache()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
