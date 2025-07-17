package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.chart.CT_ExtensionModel;
import org.docx4j.dml.chart.CTExtension;

public class CT_ExtensionConverter {
  private CT_ExtensionConverter() {
  }

  public static CT_ExtensionModel fromDocx4j(CTExtension value) {
    if (value == null) return null;
    return new CT_ExtensionModel(TokenConverter.fromDocx4j(value.getUri()));
  }

  public static CTExtension toDocx4j(CT_ExtensionModel value) {
    return null;
  }
}
