package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CameraModel;
import org.docx4j.dml.CTCamera;

public class CameraConverter {
  private CameraConverter() {
  }

  public static CameraModel fromDocx4J(CTCamera value) {
    if (value == null) return null;
    return new CameraModel(PresetCameraTypeValueConverter.fromDocx4J(value.getPrst()), FOVAngleValueConverter.fromDocx4J(value.getFov()), PositivePercentageValueConverter.fromDocx4J(value.getZoom()), SphereCoordsConverter.fromDocx4J(value.getRot()));
  }
}
