package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.CameraModel;
import org.docx4j.dml.CTCamera;

/**
 * This is a generated sequence class.
 */
public class CameraConverter {
  private CameraConverter() {
  }

  public static CameraModel fromDocx4j(CTCamera value) {
    if (value == null) return null;
    return new CameraModel(PresetCameraTypeValueConverter.fromDocx4j(value.getPrst()), FOVAngleValueConverter.fromDocx4j(value.getFov()), PositivePercentageValueConverter.fromDocx4j(value.getZoom()), SphereCoordsConverter.fromDocx4j(value.getRot()));
  }

  public static CTCamera toDocx4j(CameraModel value) {
    if (value == null) return null;
    CTCamera result = new CTCamera();
    result.setPrst(PresetCameraTypeValueConverter.toDocx4j(value.getPrst()));
    result.setFov(FOVAngleValueConverter.toDocx4j(value.getFov()));
    result.setZoom(PositivePercentageValueConverter.toDocx4j(value.getZoom()));
    result.setRot(SphereCoordsConverter.toDocx4j(value.getRot()));
    return result;
  }
}
