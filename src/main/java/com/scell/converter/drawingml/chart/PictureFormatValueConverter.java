package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PictureFormatValueModel;
import org.docx4j.dml.chart.STPictureFormat;

public class PictureFormatValueConverter {
  private PictureFormatValueConverter() {
  }

  public static PictureFormatValueModel fromDocx4J(STPictureFormat value) {
    if (value == null) return null;
    if (value == STPictureFormat.STRETCH) return PictureFormatValueModel.STRETCH;
    if (value == STPictureFormat.STACK) return PictureFormatValueModel.STACK;
    if (value == STPictureFormat.STACK_SCALE) return PictureFormatValueModel.STACK_SCALE;
    return null;
  }
}
