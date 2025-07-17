package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionModel;
import org.docx4j.dml.CTOfficeArtExtension;

public class CT_OfficeArtExtensionConverter {
  private CT_OfficeArtExtensionConverter() {
  }

  public static CT_OfficeArtExtensionModel fromDocx4j(CTOfficeArtExtension value) {
    if (value == null) return null;
    return new CT_OfficeArtExtensionModel(TokenConverter.fromDocx4j(value.getUri()));
  }

  public static CTOfficeArtExtension toDocx4j(CT_OfficeArtExtensionModel value) {
    return null;
  }
}
