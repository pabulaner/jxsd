package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.IntValueConverter;
import jxsd.gen.converter.XMLSchema.UnsignedIntValueConverter;
import jxsd.gen.model.drawingml.chart.PageSetupModel;
import org.docx4j.dml.chart.CTPageSetup;

/**
 * This is a generated sequence class.
 */
public class PageSetupConverter {
  private PageSetupConverter() {
  }

  public static PageSetupModel fromDocx4j(CTPageSetup value) {
    if (value == null) return null;
    return new PageSetupModel(IntValueConverter.fromDocx4j(value.getVerticalDpi()), IntValueConverter.fromDocx4j(value.getHorizontalDpi()), UnsignedIntValueConverter.fromDocx4j(value.getFirstPageNumber()), PageSetupOrientationValueConverter.fromDocx4j(value.getOrientation()), BooleanValueConverter.fromDocx4j(value.isDraft()), UnsignedIntValueConverter.fromDocx4j(value.getCopies()), UnsignedIntValueConverter.fromDocx4j(value.getPaperSize()), BooleanValueConverter.fromDocx4j(value.isUseFirstPageNumber()), BooleanValueConverter.fromDocx4j(value.isBlackAndWhite()));
  }

  public static CTPageSetup toDocx4j(PageSetupModel value) {
    if (value == null) return null;
    CTPageSetup result = new CTPageSetup();
    result.setVerticalDpi(IntValueConverter.toDocx4j(value.getVerticalDpi()));
    result.setHorizontalDpi(IntValueConverter.toDocx4j(value.getHorizontalDpi()));
    result.setFirstPageNumber(UnsignedIntValueConverter.toDocx4j(value.getFirstPageNumber()));
    result.setOrientation(PageSetupOrientationValueConverter.toDocx4j(value.getOrientation()));
    result.setDraft(BooleanValueConverter.toDocx4j(value.getDraft()));
    result.setCopies(UnsignedIntValueConverter.toDocx4j(value.getCopies()));
    result.setPaperSize(UnsignedIntValueConverter.toDocx4j(value.getPaperSize()));
    result.setUseFirstPageNumber(BooleanValueConverter.toDocx4j(value.getUseFirstPageNumber()));
    result.setBlackAndWhite(BooleanValueConverter.toDocx4j(value.getBlackAndWhite()));
    return result;
  }
}
