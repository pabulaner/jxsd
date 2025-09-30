package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SplitTypeValueModel;
import org.docx4j.dml.chart.STSplitType;

/**
 * This is a generated enum class.
 */
public class SplitTypeValueConverter {
  private SplitTypeValueConverter() {
  }

  public static SplitTypeValueModel fromDocx4j(STSplitType value) {
    if (value == null) return null;
    if (value == STSplitType.AUTO) return SplitTypeValueModel.AUTO;
    if (value == STSplitType.CUST) return SplitTypeValueModel.CUST;
    if (value == STSplitType.PERCENT) return SplitTypeValueModel.PERCENT;
    if (value == STSplitType.POS) return SplitTypeValueModel.POS;
    if (value == STSplitType.VAL) return SplitTypeValueModel.VAL;
    return null;
  }

  public static STSplitType toDocx4j(SplitTypeValueModel value) {
    if (value == null) return null;
    if (value == SplitTypeValueModel.AUTO) return STSplitType.AUTO;
    if (value == SplitTypeValueModel.CUST) return STSplitType.CUST;
    if (value == SplitTypeValueModel.PERCENT) return STSplitType.PERCENT;
    if (value == SplitTypeValueModel.POS) return STSplitType.POS;
    if (value == SplitTypeValueModel.VAL) return STSplitType.VAL;
    return null;
  }
}
