package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.TokenValueConverter;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionModel;
import org.docx4j.dml.CTOfficeArtExtension;

/**
 * This is a generated sequence class.
 */
public class OfficeArtExtensionConverter {
  private OfficeArtExtensionConverter() {
  }

  public static OfficeArtExtensionModel fromDocx4j(CTOfficeArtExtension value) {
    if (value == null) return null;
    return new OfficeArtExtensionModel(TokenValueConverter.fromDocx4j(value.getUri()));
  }

  public static CTOfficeArtExtension toDocx4j(OfficeArtExtensionModel value) {
    if (value == null) return null;
    CTOfficeArtExtension result = new CTOfficeArtExtension();
    result.setUri(TokenValueConverter.toDocx4j(value.getUri()));
    return result;
  }
}
