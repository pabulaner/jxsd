package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PageSetupOrientationValueModel;
import org.docx4j.dml.chart.STPageSetupOrientation;

/**
 * This is a generated enum class.
 */
public class PageSetupOrientationValueConverter {
  private PageSetupOrientationValueConverter() {
  }

  public static PageSetupOrientationValueModel fromDocx4j(STPageSetupOrientation value) {
    if (value == null) return null;
    if (value == STPageSetupOrientation.DEFAULT) return PageSetupOrientationValueModel.DEFAULT;
    if (value == STPageSetupOrientation.PORTRAIT) return PageSetupOrientationValueModel.PORTRAIT;
    if (value == STPageSetupOrientation.LANDSCAPE) return PageSetupOrientationValueModel.LANDSCAPE;
    return null;
  }

  public static STPageSetupOrientation toDocx4j(PageSetupOrientationValueModel value) {
    if (value == null) return null;
    if (value == PageSetupOrientationValueModel.DEFAULT) return STPageSetupOrientation.DEFAULT;
    if (value == PageSetupOrientationValueModel.PORTRAIT) return STPageSetupOrientation.PORTRAIT;
    if (value == PageSetupOrientationValueModel.LANDSCAPE) return STPageSetupOrientation.LANDSCAPE;
    return null;
  }
}
