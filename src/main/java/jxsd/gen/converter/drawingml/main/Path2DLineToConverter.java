package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Path2DLineToModel;
import org.docx4j.dml.CTPath2DLineTo;

/**
 * This is a generated sequence class.
 */
public class Path2DLineToConverter {
  private Path2DLineToConverter() {
  }

  public static Path2DLineToModel fromDocx4j(CTPath2DLineTo value) {
    if (value == null) return null;
    return new Path2DLineToModel(AdjPoint2DConverter.fromDocx4j(value.getPt()));
  }

  public static CTPath2DLineTo toDocx4j(Path2DLineToModel value) {
    if (value == null) return null;
    CTPath2DLineTo result = new CTPath2DLineTo();
    result.setPt(AdjPoint2DConverter.toDocx4j(value.getPt()));
    return result;
  }
}
