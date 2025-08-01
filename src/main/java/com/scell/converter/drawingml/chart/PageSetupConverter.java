package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.IntValueConverter;
import com.scell.converter.XMLSchema.UnsignedIntValueConverter;
import com.scell.model.drawingml.chart.PageSetupModel;
import org.docx4j.dml.chart.CTPageSetup;

public class PageSetupConverter {
  private PageSetupConverter() {
  }

  public static PageSetupModel fromDocx4J(CTPageSetup value) {
    if (value == null) return null;
    return new PageSetupModel(IntValueConverter.fromDocx4J(value.getVerticalDpi()), IntValueConverter.fromDocx4J(value.getHorizontalDpi()), UnsignedIntValueConverter.fromDocx4J(value.getFirstPageNumber()), PageSetupOrientationValueConverter.fromDocx4J(value.getOrientation()), BooleanValueConverter.fromDocx4J(value.isDraft()), UnsignedIntValueConverter.fromDocx4J(value.getCopies()), UnsignedIntValueConverter.fromDocx4J(value.getPaperSize()), BooleanValueConverter.fromDocx4J(value.isUseFirstPageNumber()), BooleanValueConverter.fromDocx4J(value.isBlackAndWhite()));
  }
}
