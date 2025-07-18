package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.IntConverter;
import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_PageSetupModel;
import org.docx4j.dml.chart.CTPageSetup;

public class CT_PageSetupConverter {
  private CT_PageSetupConverter() {
  }

  public static CT_PageSetupModel fromDocx4J(CTPageSetup value) {
    if (value == null) return null;
    return new CT_PageSetupModel(IntConverter.fromDocx4J(value.getVerticalDpi()), IntConverter.fromDocx4J(value.getHorizontalDpi()), UnsignedIntConverter.fromDocx4J(value.getFirstPageNumber()), ST_PageSetupOrientationConverter.fromDocx4J(value.getOrientation()), BooleanConverter.fromDocx4J(value.getDraft()), UnsignedIntConverter.fromDocx4J(value.getCopies()), UnsignedIntConverter.fromDocx4J(value.getPaperSize()), BooleanConverter.fromDocx4J(value.getUseFirstPageNumber()), BooleanConverter.fromDocx4J(value.getBlackAndWhite()));
  }

  public static CTPageSetup toDocx4J(CT_PageSetupModel value) {
    return null;
  }
}
