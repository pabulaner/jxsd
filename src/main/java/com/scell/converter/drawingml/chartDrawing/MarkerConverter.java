package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.MarkerModel;
import org.docx4j.dml.chartDrawing.CTMarker;

public class MarkerConverter {
  private MarkerConverter() {
  }

  public static MarkerModel fromDocx4J(CTMarker value) {
    if (value == null) return null;
    return new MarkerModel(MarkerCoordinateConverter.fromDocx4J(value.getX()), MarkerCoordinateConverter.fromDocx4J(value.getY()));
  }
}
