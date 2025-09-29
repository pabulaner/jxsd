package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.BackdropModel;
import org.docx4j.dml.CTBackdrop;

/**
 * This is a generated sequence class.
 */
public class BackdropConverter {
  private BackdropConverter() {
  }

  public static BackdropModel fromDocx4j(CTBackdrop value) {
    if (value == null) return null;
    return new BackdropModel(Point3DConverter.fromDocx4j(value.getAnchor()), Vector3DConverter.fromDocx4j(value.getNorm()), Vector3DConverter.fromDocx4j(value.getUp()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBackdrop toDocx4j(BackdropModel value) {
    if (value == null) return null;
    CTBackdrop result = new CTBackdrop();
    result.setAnchor(Point3DConverter.toDocx4j(value.getAnchor()));
    result.setNorm(Vector3DConverter.toDocx4j(value.getNorm()));
    result.setUp(Vector3DConverter.toDocx4j(value.getUp()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
