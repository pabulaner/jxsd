package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ShapeModel;
import org.docx4j.dml.chart.CTShape;

/**
 * This is a generated sequence class.
 */
public class ShapeConverter {
  private ShapeConverter() {
  }

  public static ShapeModel fromDocx4j(CTShape value) {
    if (value == null) return null;
    return new ShapeModel(ShapeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTShape toDocx4j(ShapeModel value) {
    if (value == null) return null;
    CTShape result = new CTShape();
    result.setVal(ShapeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
