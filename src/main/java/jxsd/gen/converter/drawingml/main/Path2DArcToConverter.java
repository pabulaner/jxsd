package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Path2DArcToModel;
import org.docx4j.dml.CTPath2DArcTo;

/**
 * This is a generated sequence class.
 */
public class Path2DArcToConverter {
  private Path2DArcToConverter() {
  }

  public static Path2DArcToModel fromDocx4j(CTPath2DArcTo value) {
    if (value == null) return null;
    return new Path2DArcToModel(AdjAngleValueConverter.fromDocx4j(value.getStAng()), AdjAngleValueConverter.fromDocx4j(value.getSwAng()), AdjCoordinateValueConverter.fromDocx4j(value.getWR()), AdjCoordinateValueConverter.fromDocx4j(value.getHR()));
  }

  public static CTPath2DArcTo toDocx4j(Path2DArcToModel value) {
    if (value == null) return null;
    CTPath2DArcTo result = new CTPath2DArcTo();
    result.setStAng(AdjAngleValueConverter.toDocx4j(value.getStAng()));
    result.setSwAng(AdjAngleValueConverter.toDocx4j(value.getSwAng()));
    result.setWR(AdjCoordinateValueConverter.toDocx4j(value.getWR()));
    result.setHR(AdjCoordinateValueConverter.toDocx4j(value.getHR()));
    return result;
  }
}
