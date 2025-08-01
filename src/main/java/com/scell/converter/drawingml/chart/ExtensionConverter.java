package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.TokenValueConverter;
import com.scell.model.drawingml.chart.ExtensionModel;
import org.docx4j.dml.chart.CTExtension;

public class ExtensionConverter {
  private ExtensionConverter() {
  }

  public static ExtensionModel fromDocx4J(CTExtension value) {
    if (value == null) return null;
    return new ExtensionModel(TokenValueConverter.fromDocx4J(value.getUri()));
  }
}
