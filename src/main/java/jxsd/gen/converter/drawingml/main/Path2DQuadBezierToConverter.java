package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.Path2DQuadBezierToModel;
import org.docx4j.dml.CTPath2DQuadBezierTo;

/**
 * This is a generated sequence class.
 */
public class Path2DQuadBezierToConverter {
  private Path2DQuadBezierToConverter() {
  }

  public static Path2DQuadBezierToModel fromDocx4j(CTPath2DQuadBezierTo value) {
    if (value == null) return null;
    return new Path2DQuadBezierToModel(value.getPt().stream().map(AdjPoint2DConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPath2DQuadBezierTo toDocx4j(Path2DQuadBezierToModel value) {
    if (value == null) return null;
    CTPath2DQuadBezierTo result = new CTPath2DQuadBezierTo();
    result.getPt().addAll(value.getPt().stream().map(AdjPoint2DConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
