package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureFormatValueModel;
import org.docx4j.dml.chart.STPictureFormat;

/**
 * This is a generated enum class.
 */
public class PictureFormatValueConverter {
  private PictureFormatValueConverter() {
  }

  public static PictureFormatValueModel fromDocx4j(STPictureFormat value) {
    if (value == null) return null;
    if (value == STPictureFormat.STRETCH) return PictureFormatValueModel.STRETCH;
    if (value == STPictureFormat.STACK) return PictureFormatValueModel.STACK;
    if (value == STPictureFormat.STACK_SCALE) return PictureFormatValueModel.STACK_SCALE;
    return null;
  }

  public static STPictureFormat toDocx4j(PictureFormatValueModel value) {
    if (value == null) return null;
    if (value == PictureFormatValueModel.STRETCH) return STPictureFormat.STRETCH;
    if (value == PictureFormatValueModel.STACK) return STPictureFormat.STACK;
    if (value == PictureFormatValueModel.STACK_SCALE) return STPictureFormat.STACK_SCALE;
    return null;
  }
}
