package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CustSplitModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTCustSplit;

public class CustSplitConverter {
  private CustSplitConverter() {
  }

  public static CustSplitModel fromDocx4J(CTCustSplit value) {
    if (value == null) return null;
    return new CustSplitModel(value.getSecondPiePt().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
