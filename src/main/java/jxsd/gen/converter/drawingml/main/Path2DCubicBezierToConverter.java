package jxsd.gen.converter.drawingml.main;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.Path2DCubicBezierToModel;
import org.docx4j.dml.CTPath2DCubicBezierTo;

/**
 * This is a generated sequence class.
 */
public class Path2DCubicBezierToConverter {
  private Path2DCubicBezierToConverter() {
  }

  public static Path2DCubicBezierToModel fromDocx4j(CTPath2DCubicBezierTo value) {
    if (value == null) return null;
    return new Path2DCubicBezierToModel(value.getPt().stream().map(AdjPoint2DConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPath2DCubicBezierTo toDocx4j(Path2DCubicBezierToModel value) {
    if (value == null) return null;
    CTPath2DCubicBezierTo result = new CTPath2DCubicBezierTo();
    result.getPt().addAll(value.getPt().stream().map(AdjPoint2DConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
