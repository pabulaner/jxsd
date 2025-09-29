package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PageSetupOrientationValueBuilder;
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
    if (value == PageSetupOrientationValueBuilder.DEFAULT) return PageSetupOrientationValueModel.DEFAULT;
    if (value == PageSetupOrientationValueBuilder.PORTRAIT) return PageSetupOrientationValueModel.PORTRAIT;
    if (value == PageSetupOrientationValueBuilder.LANDSCAPE) return PageSetupOrientationValueModel.LANDSCAPE;
    return null;
  }

  public static STPageSetupOrientation toDocx4j(PageSetupOrientationValueModel value) {
    if (value == null) return null;
    if (value == PageSetupOrientationValueModel.DEFAULT) return PageSetupOrientationValueBuilder.DEFAULT;
    if (value == PageSetupOrientationValueModel.PORTRAIT) return PageSetupOrientationValueBuilder.PORTRAIT;
    if (value == PageSetupOrientationValueModel.LANDSCAPE) return PageSetupOrientationValueBuilder.LANDSCAPE;
    return null;
  }
}
