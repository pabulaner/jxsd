package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.LegendEntryModel;
import org.docx4j.dml.chart.CTLegendEntry;

public class LegendEntryConverter {
  private LegendEntryConverter() {
  }

  public static LegendEntryModel fromDocx4J(CTLegendEntry value) {
    if (value == null) return null;
    LegendEntryModel.DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData = new LegendEntryModel.DeleteOrEG_LegendEntryDataModel();
    if (value.getDelete() != null) deleteoregLegendEntryData = LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newDelete(BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getTxPr() != null) deleteoregLegendEntryData = LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newTxPr(TextBodyConverter.fromDocx4J(value.getTxPr()));
    return new LegendEntryModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), deleteoregLegendEntryData, ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
