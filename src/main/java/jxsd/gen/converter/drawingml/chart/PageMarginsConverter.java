package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.DoubleValueConverter;
import jxsd.gen.model.drawingml.chart.PageMarginsModel;
import org.docx4j.dml.chart.CTPageMargins;

/**
 * This is a generated sequence class.
 */
public class PageMarginsConverter {
  private PageMarginsConverter() {
  }

  public static PageMarginsModel fromDocx4j(CTPageMargins value) {
    if (value == null) return null;
    return new PageMarginsModel(DoubleValueConverter.fromDocx4j(value.getFooter()), DoubleValueConverter.fromDocx4j(value.getL()), DoubleValueConverter.fromDocx4j(value.getT()), DoubleValueConverter.fromDocx4j(value.getHeader()), DoubleValueConverter.fromDocx4j(value.getR()), DoubleValueConverter.fromDocx4j(value.getB()));
  }

  public static CTPageMargins toDocx4j(PageMarginsModel value) {
    if (value == null) return null;
    CTPageMargins result = new CTPageMargins();
    result.setFooter(DoubleValueConverter.toDocx4j(value.getFooter()));
    result.setL(DoubleValueConverter.toDocx4j(value.getL()));
    result.setT(DoubleValueConverter.toDocx4j(value.getT()));
    result.setHeader(DoubleValueConverter.toDocx4j(value.getHeader()));
    result.setR(DoubleValueConverter.toDocx4j(value.getR()));
    result.setB(DoubleValueConverter.toDocx4j(value.getB()));
    return result;
  }
}
