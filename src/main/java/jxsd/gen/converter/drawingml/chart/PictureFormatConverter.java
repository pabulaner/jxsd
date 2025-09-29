package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureFormatModel;
import org.docx4j.dml.chart.CTPictureFormat;

/**
 * This is a generated sequence class.
 */
public class PictureFormatConverter {
  private PictureFormatConverter() {
  }

  public static PictureFormatModel fromDocx4j(CTPictureFormat value) {
    if (value == null) return null;
    return new PictureFormatModel(PictureFormatValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPictureFormat toDocx4j(PictureFormatModel value) {
    if (value == null) return null;
    CTPictureFormat result = new CTPictureFormat();
    result.setVal(PictureFormatValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
