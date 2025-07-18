package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PageSetupOrientationModel;
import org.docx4j.dml.chart.STPageSetupOrientation;

public class ST_PageSetupOrientationConverter {
  private ST_PageSetupOrientationConverter() {
  }

  public static ST_PageSetupOrientationModel fromDocx4J(STPageSetupOrientation value) {
    if (value == null) return null;
    if (value == STPageSetupOrientation.DEFAULT) return ST_PageSetupOrientationModel.DEFAULT;
    if (value == STPageSetupOrientation.PORTRAIT) return ST_PageSetupOrientationModel.PORTRAIT;
    if (value == STPageSetupOrientation.LANDSCAPE) return ST_PageSetupOrientationModel.LANDSCAPE;
    return null;
  }

  public static STPageSetupOrientation toDocx4J(ST_PageSetupOrientationModel value) {
    return null;
  }
}
