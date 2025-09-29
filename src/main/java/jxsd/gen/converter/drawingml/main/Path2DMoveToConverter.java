package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Path2DMoveToModel;
import org.docx4j.dml.CTPath2DMoveTo;

/**
 * This is a generated sequence class.
 */
public class Path2DMoveToConverter {
  private Path2DMoveToConverter() {
  }

  public static Path2DMoveToModel fromDocx4j(CTPath2DMoveTo value) {
    if (value == null) return null;
    return new Path2DMoveToModel(AdjPoint2DConverter.fromDocx4j(value.getPt()));
  }

  public static CTPath2DMoveTo toDocx4j(Path2DMoveToModel value) {
    if (value == null) return null;
    CTPath2DMoveTo result = new CTPath2DMoveTo();
    result.setPt(AdjPoint2DConverter.toDocx4j(value.getPt()));
    return result;
  }
}
