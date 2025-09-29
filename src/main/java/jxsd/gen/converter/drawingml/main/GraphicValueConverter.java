package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GraphicValueModel;
import org.docx4j.dml.Graphic;

/**
 * This is a generated sequence class.
 */
public class GraphicValueConverter {
  private GraphicValueConverter() {
  }

  public static GraphicValueModel fromDocx4j(Graphic value) {
    if (value == null) return null;
    return new GraphicValueModel(GraphicDataValueConverter.fromDocx4j(value.getGraphicData()));
  }

  public static Graphic toDocx4j(GraphicValueModel value) {
    if (value == null) return null;
    Graphic result = new Graphic();
    result.setGraphicData(GraphicDataValueConverter.toDocx4j(value.getGraphicData()));
    return result;
  }
}
