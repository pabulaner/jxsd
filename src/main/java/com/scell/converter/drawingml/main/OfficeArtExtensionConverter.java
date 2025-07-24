package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.OfficeArtExtensionModel;
import org.docx4j.dml.CTOfficeArtExtension;

public class OfficeArtExtensionConverter {
  private OfficeArtExtensionConverter() {
  }

  public static OfficeArtExtensionModel fromDocx4J(CTOfficeArtExtension value) {
    if (value == null) return null;
    return new OfficeArtExtensionModel(TokenConverter.fromDocx4J(value.getUri()));
  }
}
