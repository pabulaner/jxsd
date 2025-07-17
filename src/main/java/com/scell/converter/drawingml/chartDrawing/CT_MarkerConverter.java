package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_MarkerModel;
import org.docx4j.dml.chartDrawing.CTMarker;

public class CT_MarkerConverter {
  private CT_MarkerConverter() {
  }

  public static CT_MarkerModel fromDocx4j(CTMarker value) {
    if (value == null) return null;
    return new CT_MarkerModel(ST_MarkerCoordinateConverter.fromDocx4j(value.getX()), ST_MarkerCoordinateConverter.fromDocx4j(value.getY()));
  }

  public static CTMarker toDocx4j(CT_MarkerModel value) {
    return null;
  }
}
