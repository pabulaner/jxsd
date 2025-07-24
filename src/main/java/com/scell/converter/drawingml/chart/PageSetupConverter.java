package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.IntConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.PageSetupModel;
import org.docx4j.dml.chart.CTPageSetup;

public class PageSetupConverter {
  private PageSetupConverter() {
  }

  public static PageSetupModel fromDocx4J(CTPageSetup value) {
    if (value == null) return null;
    return new PageSetupModel(IntConverter.fromDocx4J(value.getVerticalDpi()), IntConverter.fromDocx4J(value.getHorizontalDpi()), UnsignedIntConverter.fromDocx4J(value.getFirstPageNumber()), PageSetupOrientationConverter.fromDocx4J(value.getOrientation()), BooleanConverter.fromDocx4J(value.isDraft()), UnsignedIntConverter.fromDocx4J(value.getCopies()), UnsignedIntConverter.fromDocx4J(value.getPaperSize()), BooleanConverter.fromDocx4J(value.isUseFirstPageNumber()), BooleanConverter.fromDocx4J(value.isBlackAndWhite()));
  }
}
