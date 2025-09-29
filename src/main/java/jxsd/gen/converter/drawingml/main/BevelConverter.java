package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.BevelModel;
import org.docx4j.dml.CTBevel;

/**
 * This is a generated sequence class.
 */
public class BevelConverter {
  private BevelConverter() {
  }

  public static BevelModel fromDocx4j(CTBevel value) {
    if (value == null) return null;
    return new BevelModel(PositiveCoordinateValueConverter.fromDocx4j(value.getH()), PositiveCoordinateValueConverter.fromDocx4j(value.getW()), BevelPresetTypeValueConverter.fromDocx4j(value.getPrst()));
  }

  public static CTBevel toDocx4j(BevelModel value) {
    if (value == null) return null;
    CTBevel result = new CTBevel();
    result.setH(PositiveCoordinateValueConverter.toDocx4j(value.getH()));
    result.setW(PositiveCoordinateValueConverter.toDocx4j(value.getW()));
    result.setPrst(BevelPresetTypeValueConverter.toDocx4j(value.getPrst()));
    return result;
  }
}
