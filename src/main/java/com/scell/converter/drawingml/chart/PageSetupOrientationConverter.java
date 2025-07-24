package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PageSetupOrientationModel;
import org.docx4j.dml.chart.STPageSetupOrientation;

public class PageSetupOrientationConverter {
  private PageSetupOrientationConverter() {
  }

  public static PageSetupOrientationModel fromDocx4J(STPageSetupOrientation value) {
    if (value == null) return null;
    if (value == STPageSetupOrientation.DEFAULT) return PageSetupOrientationModel.DEFAULT;
    if (value == STPageSetupOrientation.PORTRAIT) return PageSetupOrientationModel.PORTRAIT;
    if (value == STPageSetupOrientation.LANDSCAPE) return PageSetupOrientationModel.LANDSCAPE;
    return null;
  }
}
