package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.CustSplitModel;
import org.docx4j.dml.chart.CTCustSplit;

/**
 * This is a generated sequence class.
 */
public class CustSplitConverter {
  private CustSplitConverter() {
  }

  public static CustSplitModel fromDocx4j(CTCustSplit value) {
    if (value == null) return null;
    return new CustSplitModel(value.getSecondPiePt().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTCustSplit toDocx4j(CustSplitModel value) {
    if (value == null) return null;
    CTCustSplit result = new CTCustSplit();
    result.getSecondPiePt().addAll(value.getSecondPiePt().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
