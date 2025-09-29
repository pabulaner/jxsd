package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.TokenValueConverter;
import jxsd.gen.model.drawingml.chart.ExtensionModel;
import org.docx4j.dml.chart.CTExtension;

/**
 * This is a generated sequence class.
 */
public class ExtensionConverter {
  private ExtensionConverter() {
  }

  public static ExtensionModel fromDocx4j(CTExtension value) {
    if (value == null) return null;
    return new ExtensionModel(TokenValueConverter.fromDocx4j(value.getUri()));
  }

  public static CTExtension toDocx4j(ExtensionModel value) {
    if (value == null) return null;
    CTExtension result = new CTExtension();
    result.setUri(TokenValueConverter.toDocx4j(value.getUri()));
    return result;
  }
}
