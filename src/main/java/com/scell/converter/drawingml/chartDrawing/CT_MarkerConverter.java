package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_MarkerModel;
import org.docx4j.dml.chartDrawing.CTMarker;

public class CT_MarkerConverter {
  private CT_MarkerConverter() {
  }

  public static CT_MarkerModel fromDocx4J(CTMarker value) {
    if (value == null) return null;
    return new CT_MarkerModel(ST_MarkerCoordinateConverter.fromDocx4J(value.getX()), ST_MarkerCoordinateConverter.fromDocx4J(value.getY()));
  }

  public static CTMarker toDocx4J(CT_MarkerModel value) {
    return null;
  }
}
