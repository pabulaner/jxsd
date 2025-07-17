package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.IntConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_PageSetupModel;
import org.docx4j.dml.chart.CTPageSetup;

public class CT_PageSetupConverter {
  private CT_PageSetupConverter() {
  }

  public static CT_PageSetupModel fromDocx4j(CTPageSetup value) {
    if (value == null) return null;
    return new CT_PageSetupModel(IntConverter.fromDocx4j(value.getVerticalDpi()), IntConverter.fromDocx4j(value.getHorizontalDpi()), UnsignedIntConverter.fromDocx4j(value.getFirstPageNumber()), ST_PageSetupOrientationConverter.fromDocx4j(value.getOrientation()), BooleanConverter.fromDocx4j(value.getDraft()), UnsignedIntConverter.fromDocx4j(value.getCopies()), UnsignedIntConverter.fromDocx4j(value.getPaperSize()), BooleanConverter.fromDocx4j(value.getUseFirstPageNumber()), BooleanConverter.fromDocx4j(value.getBlackAndWhite()));
  }

  public static CTPageSetup toDocx4j(CT_PageSetupModel value) {
    return null;
  }
}
