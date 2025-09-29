package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.TokenValueConverter;
import jxsd.gen.model.drawingml.main.GraphicDataValueModel;
import org.docx4j.dml.GraphicData;

/**
 * This is a generated sequence class.
 */
public class GraphicDataValueConverter {
  private GraphicDataValueConverter() {
  }

  public static GraphicDataValueModel fromDocx4j(GraphicData value) {
    if (value == null) return null;
    return new GraphicDataValueModel(TokenValueConverter.fromDocx4j(value.getUri()));
  }

  public static GraphicData toDocx4j(GraphicDataValueModel value) {
    if (value == null) return null;
    GraphicData result = new GraphicData();
    result.setUri(TokenValueConverter.toDocx4j(value.getUri()));
    return result;
  }
}
