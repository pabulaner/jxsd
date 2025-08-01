package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.LegendEntryModel;
import org.docx4j.dml.chart.CTLegendEntry;

public class LegendEntryConverter {
  private LegendEntryConverter() {
  }

  public static LegendEntryModel fromDocx4J(CTLegendEntry value) {
    if (value == null) return null;
    LegendEntryModel.DeleteOrLegendEntryDataValueModel deleteOrLegendEntryData = new LegendEntryModel.DeleteOrLegendEntryDataValueModel();
    if (value.getDelete() != null) deleteOrLegendEntryData = LegendEntryModel.DeleteOrLegendEntryDataValueModel.newDelete(BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getTxPr() != null) deleteOrLegendEntryData = LegendEntryModel.DeleteOrLegendEntryDataValueModel.newTxPr(TextBodyConverter.fromDocx4J(value.getTxPr()));
    return new LegendEntryModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), deleteOrLegendEntryData, ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
