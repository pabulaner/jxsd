package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_CameraModel;
import org.docx4j.dml.CTCamera;

public class CT_CameraConverter {
  private CT_CameraConverter() {
  }

  public static CT_CameraModel fromDocx4j(CTCamera value) {
    if (value == null) return null;
    return new CT_CameraModel(ST_PresetCameraTypeConverter.fromDocx4j(value.getPrst()), ST_FOVAngleConverter.fromDocx4j(value.getFov()), ST_PositivePercentageConverter.fromDocx4j(value.getZoom()), CT_SphereCoordsConverter.fromDocx4j(value.getRot()));
  }

  public static CTCamera toDocx4j(CT_CameraModel value) {
    return null;
  }
}
