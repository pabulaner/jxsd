package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FlatTextModel;
import org.docx4j.dml.CTFlatText;

/**
 * This is a generated sequence class.
 */
public class FlatTextConverter {
  private FlatTextConverter() {
  }

  public static FlatTextModel fromDocx4j(CTFlatText value) {
    if (value == null) return null;
    return new FlatTextModel(CoordinateValueConverter.fromDocx4j(value.getZ()));
  }

  public static CTFlatText toDocx4j(FlatTextModel value) {
    if (value == null) return null;
    CTFlatText result = new CTFlatText();
    result.setZ(CoordinateValueConverter.toDocx4j(value.getZ()));
    return result;
  }
}
