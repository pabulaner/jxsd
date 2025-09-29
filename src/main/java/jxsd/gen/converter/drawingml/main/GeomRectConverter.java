package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GeomRectModel;
import org.docx4j.dml.CTGeomRect;

/**
 * This is a generated sequence class.
 */
public class GeomRectConverter {
  private GeomRectConverter() {
  }

  public static GeomRectModel fromDocx4j(CTGeomRect value) {
    if (value == null) return null;
    return new GeomRectModel(AdjCoordinateValueConverter.fromDocx4j(value.getL()), AdjCoordinateValueConverter.fromDocx4j(value.getT()), AdjCoordinateValueConverter.fromDocx4j(value.getR()), AdjCoordinateValueConverter.fromDocx4j(value.getB()));
  }

  public static CTGeomRect toDocx4j(GeomRectModel value) {
    if (value == null) return null;
    CTGeomRect result = new CTGeomRect();
    result.setL(AdjCoordinateValueConverter.toDocx4j(value.getL()));
    result.setT(AdjCoordinateValueConverter.toDocx4j(value.getT()));
    result.setR(AdjCoordinateValueConverter.toDocx4j(value.getR()));
    result.setB(AdjCoordinateValueConverter.toDocx4j(value.getB()));
    return result;
  }
}
