package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.LegendEntryModel;
import org.docx4j.dml.chart.CTLegendEntry;

/**
 * This is a generated sequence class.
 */
public class LegendEntryConverter {
  private LegendEntryConverter() {
  }

  public static LegendEntryModel fromDocx4j(CTLegendEntry value) {
    if (value == null) return null;
    LegendEntryModel.DeleteOrLegendEntryData deleteOrLegendEntryData = new LegendEntryModel.DeleteOrLegendEntryData();
    if (value.getDelete() != null) deleteOrLegendEntryData = LegendEntryModel.DeleteOrLegendEntryData.newDelete(BooleanConverter.fromDocx4j(value.getDelete()));
    if (value.getTxPr() != null) deleteOrLegendEntryData = LegendEntryModel.DeleteOrLegendEntryData.newTxPr(TextBodyConverter.fromDocx4j(value.getTxPr()));
    return new LegendEntryModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), deleteOrLegendEntryData, ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLegendEntry toDocx4j(LegendEntryModel value) {
    if (value == null) return null;
    CTLegendEntry result = new CTLegendEntry();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getDeleteOrLegendEntryData().isDelete()) result.setDelete(BooleanConverter.toDocx4j(value.getDeleteOrLegendEntryData().getDelete()));
    if (value.getDeleteOrLegendEntryData().isTxPr()) result.setTxPr(TextBodyConverter.toDocx4j(value.getDeleteOrLegendEntryData().getTxPr()));
    return result;
  }
}
