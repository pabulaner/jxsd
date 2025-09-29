package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.chart.HeaderFooterModel;
import org.docx4j.dml.chart.CTHeaderFooter;

/**
 * This is a generated sequence class.
 */
public class HeaderFooterConverter {
  private HeaderFooterConverter() {
  }

  public static HeaderFooterModel fromDocx4j(CTHeaderFooter value) {
    if (value == null) return null;
    return new HeaderFooterModel(BooleanValueConverter.fromDocx4j(value.getDifferentOddEven()), BooleanValueConverter.fromDocx4j(value.getDifferentFirst()), BooleanValueConverter.fromDocx4j(value.getAlignWithMargins()), XstringValueConverter.fromDocx4j(value.getOddHeader()), XstringValueConverter.fromDocx4j(value.getOddFooter()), XstringValueConverter.fromDocx4j(value.getEvenHeader()), XstringValueConverter.fromDocx4j(value.getEvenFooter()), XstringValueConverter.fromDocx4j(value.getFirstHeader()), XstringValueConverter.fromDocx4j(value.getFirstFooter()));
  }

  public static CTHeaderFooter toDocx4j(HeaderFooterModel value) {
    if (value == null) return null;
    CTHeaderFooter result = new CTHeaderFooter();
    result.setDifferentOddEven(BooleanValueConverter.toDocx4j(value.getDifferentOddEven()));
    result.setDifferentFirst(BooleanValueConverter.toDocx4j(value.getDifferentFirst()));
    result.setAlignWithMargins(BooleanValueConverter.toDocx4j(value.getAlignWithMargins()));
    result.setOddHeader(XstringValueConverter.toDocx4j(value.getOddHeader()));
    result.setOddFooter(XstringValueConverter.toDocx4j(value.getOddFooter()));
    result.setEvenHeader(XstringValueConverter.toDocx4j(value.getEvenHeader()));
    result.setEvenFooter(XstringValueConverter.toDocx4j(value.getEvenFooter()));
    result.setFirstHeader(XstringValueConverter.toDocx4j(value.getFirstHeader()));
    result.setFirstFooter(XstringValueConverter.toDocx4j(value.getFirstFooter()));
    return result;
  }
}
