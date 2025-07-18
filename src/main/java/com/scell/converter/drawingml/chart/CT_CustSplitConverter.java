package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CustSplitModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTCustSplit;

public class CT_CustSplitConverter {
  private CT_CustSplitConverter() {
  }

  public static CT_CustSplitModel fromDocx4J(CTCustSplit value) {
    if (value == null) return null;
    return new CT_CustSplitModel(value.getSecondPiePt().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTCustSplit toDocx4J(CT_CustSplitModel value) {
    return null;
  }
}
