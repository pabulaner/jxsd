package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureStackUnitModel;
import org.docx4j.dml.chart.CTPictureStackUnit;

/**
 * This is a generated sequence class.
 */
public class PictureStackUnitConverter {
  private PictureStackUnitConverter() {
  }

  public static PictureStackUnitModel fromDocx4j(CTPictureStackUnit value) {
    if (value == null) return null;
    return new PictureStackUnitModel(PictureStackUnitValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPictureStackUnit toDocx4j(PictureStackUnitModel value) {
    if (value == null) return null;
    CTPictureStackUnit result = new CTPictureStackUnit();
    result.setVal(PictureStackUnitValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
