package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureOptionsModel;
import org.docx4j.dml.chart.CTPictureOptions;

/**
 * This is a generated sequence class.
 */
public class PictureOptionsConverter {
  private PictureOptionsConverter() {
  }

  public static PictureOptionsModel fromDocx4j(CTPictureOptions value) {
    if (value == null) return null;
    return new PictureOptionsModel(BooleanConverter.fromDocx4j(value.getApplyToFront()), BooleanConverter.fromDocx4j(value.getApplyToSides()), BooleanConverter.fromDocx4j(value.getApplyToEnd()), PictureFormatConverter.fromDocx4j(value.getPictureFormat()), PictureStackUnitConverter.fromDocx4j(value.getPictureStackUnit()));
  }

  public static CTPictureOptions toDocx4j(PictureOptionsModel value) {
    if (value == null) return null;
    CTPictureOptions result = new CTPictureOptions();
    result.setApplyToFront(BooleanConverter.toDocx4j(value.getApplyToFront()));
    result.setApplyToSides(BooleanConverter.toDocx4j(value.getApplyToSides()));
    result.setApplyToEnd(BooleanConverter.toDocx4j(value.getApplyToEnd()));
    result.setPictureFormat(PictureFormatConverter.toDocx4j(value.getPictureFormat()));
    result.setPictureStackUnit(PictureStackUnitConverter.toDocx4j(value.getPictureStackUnit()));
    return result;
  }
}
