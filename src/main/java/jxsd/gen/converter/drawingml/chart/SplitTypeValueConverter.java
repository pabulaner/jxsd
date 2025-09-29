package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SplitTypeValueBuilder;
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
    if (value == SplitTypeValueBuilder.AUTO) return SplitTypeValueModel.AUTO;
    if (value == SplitTypeValueBuilder.CUST) return SplitTypeValueModel.CUST;
    if (value == SplitTypeValueBuilder.PERCENT) return SplitTypeValueModel.PERCENT;
    if (value == SplitTypeValueBuilder.POS) return SplitTypeValueModel.POS;
    if (value == SplitTypeValueBuilder.VAL) return SplitTypeValueModel.VAL;
    return null;
  }

  public static STSplitType toDocx4j(SplitTypeValueModel value) {
    if (value == null) return null;
    if (value == SplitTypeValueModel.AUTO) return SplitTypeValueBuilder.AUTO;
    if (value == SplitTypeValueModel.CUST) return SplitTypeValueBuilder.CUST;
    if (value == SplitTypeValueModel.PERCENT) return SplitTypeValueBuilder.PERCENT;
    if (value == SplitTypeValueModel.POS) return SplitTypeValueBuilder.POS;
    if (value == SplitTypeValueModel.VAL) return SplitTypeValueBuilder.VAL;
    return null;
  }
}
