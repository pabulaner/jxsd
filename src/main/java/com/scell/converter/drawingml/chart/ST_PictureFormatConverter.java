package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PictureFormatModel;
import org.docx4j.dml.chart.STPictureFormat;

public class ST_PictureFormatConverter {
  private ST_PictureFormatConverter() {
  }

  public static ST_PictureFormatModel fromDocx4j(STPictureFormat value) {
    if (value == null) return null;
    if (value == STPictureFormat.STRETCH) return ST_PictureFormatModel.STRETCH;
    if (value == STPictureFormat.STACK) return ST_PictureFormatModel.STACK;
    if (value == STPictureFormat.STACK_SCALE) return ST_PictureFormatModel.STACK_SCALE;
    return null;
  }

  public static STPictureFormat toDocx4j(ST_PictureFormatModel value) {
    return null;
  }
}
