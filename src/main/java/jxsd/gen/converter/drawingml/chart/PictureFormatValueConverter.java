package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PictureFormatValueBuilder;
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
    if (value == PictureFormatValueBuilder.STRETCH) return PictureFormatValueModel.STRETCH;
    if (value == PictureFormatValueBuilder.STACK) return PictureFormatValueModel.STACK;
    if (value == PictureFormatValueBuilder.STACK_SCALE) return PictureFormatValueModel.STACK_SCALE;
    return null;
  }

  public static STPictureFormat toDocx4j(PictureFormatValueModel value) {
    if (value == null) return null;
    if (value == PictureFormatValueModel.STRETCH) return PictureFormatValueBuilder.STRETCH;
    if (value == PictureFormatValueModel.STACK) return PictureFormatValueBuilder.STACK;
    if (value == PictureFormatValueModel.STACK_SCALE) return PictureFormatValueBuilder.STACK_SCALE;
    return null;
  }
}
