package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.SphereCoordsModel;
import org.docx4j.dml.CTSphereCoords;

/**
 * This is a generated sequence class.
 */
public class SphereCoordsConverter {
  private SphereCoordsConverter() {
  }

  public static SphereCoordsModel fromDocx4j(CTSphereCoords value) {
    if (value == null) return null;
    return new SphereCoordsModel(PositiveFixedAngleValueConverter.fromDocx4j(value.getLat()), PositiveFixedAngleValueConverter.fromDocx4j(value.getRev()), PositiveFixedAngleValueConverter.fromDocx4j(value.getLon()));
  }

  public static CTSphereCoords toDocx4j(SphereCoordsModel value) {
    if (value == null) return null;
    CTSphereCoords result = new CTSphereCoords();
    result.setLat(PositiveFixedAngleValueConverter.toDocx4j(value.getLat()));
    result.setRev(PositiveFixedAngleValueConverter.toDocx4j(value.getRev()));
    result.setLon(PositiveFixedAngleValueConverter.toDocx4j(value.getLon()));
    return result;
  }
}
