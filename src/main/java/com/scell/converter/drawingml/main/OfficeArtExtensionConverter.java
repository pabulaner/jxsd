package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenValueConverter;
import com.scell.model.drawingml.main.OfficeArtExtensionModel;
import org.docx4j.dml.CTOfficeArtExtension;

public class OfficeArtExtensionConverter {
  private OfficeArtExtensionConverter() {
  }

  public static OfficeArtExtensionModel fromDocx4J(CTOfficeArtExtension value) {
    if (value == null) return null;
    return new OfficeArtExtensionModel(TokenValueConverter.fromDocx4J(value.getUri()));
  }
}
