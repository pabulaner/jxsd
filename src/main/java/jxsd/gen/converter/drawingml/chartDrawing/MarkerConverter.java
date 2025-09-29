package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.MarkerModel;
import org.docx4j.dml.chartDrawing.CTMarker;

/**
 * This is a generated sequence class.
 */
public class MarkerConverter {
  private MarkerConverter() {
  }

  public static MarkerModel fromDocx4j(CTMarker value) {
    if (value == null) return null;
    return new MarkerModel(MarkerCoordinateValueConverter.fromDocx4j(value.getX()), MarkerCoordinateValueConverter.fromDocx4j(value.getY()));
  }

  public static CTMarker toDocx4j(MarkerModel value) {
    if (value == null) return null;
    CTMarker result = new CTMarker();
    result.setX(MarkerCoordinateValueConverter.toDocx4j(value.getX()));
    result.setY(MarkerCoordinateValueConverter.toDocx4j(value.getY()));
    return result;
  }
}
