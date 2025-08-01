package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PageSetupOrientationValueModel;
import org.docx4j.dml.chart.STPageSetupOrientation;

public class PageSetupOrientationValueConverter {
  private PageSetupOrientationValueConverter() {
  }

  public static PageSetupOrientationValueModel fromDocx4J(STPageSetupOrientation value) {
    if (value == null) return null;
    if (value == STPageSetupOrientation.DEFAULT) return PageSetupOrientationValueModel.DEFAULT;
    if (value == STPageSetupOrientation.PORTRAIT) return PageSetupOrientationValueModel.PORTRAIT;
    if (value == STPageSetupOrientation.LANDSCAPE) return PageSetupOrientationValueModel.LANDSCAPE;
    return null;
  }
}
