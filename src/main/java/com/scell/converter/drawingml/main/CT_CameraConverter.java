package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_CameraModel;
import org.docx4j.dml.CTCamera;

public class CT_CameraConverter {
  private CT_CameraConverter() {
  }

  public static CT_CameraModel fromDocx4J(CTCamera value) {
    if (value == null) return null;
    return new CT_CameraModel(ST_PresetCameraTypeConverter.fromDocx4J(value.getPrst()), ST_FOVAngleConverter.fromDocx4J(value.getFov()), ST_PositivePercentageConverter.fromDocx4J(value.getZoom()), CT_SphereCoordsConverter.fromDocx4J(value.getRot()));
  }

  public static CTCamera toDocx4J(CT_CameraModel value) {
    return null;
  }
}
