package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CameraModel;
import org.docx4j.dml.CTCamera;

public class CameraConverter {
  private CameraConverter() {
  }

  public static CameraModel fromDocx4J(CTCamera value) {
    if (value == null) return null;
    return new CameraModel(PresetCameraTypeConverter.fromDocx4J(value.getPrst()), FOVAngleConverter.fromDocx4J(value.getFov()), PositivePercentageConverter.fromDocx4J(value.getZoom()), SphereCoordsConverter.fromDocx4J(value.getRot()));
  }
}
