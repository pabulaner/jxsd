package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_LegendEntryModel;
import org.docx4j.dml.chart.CTLegendEntry;

public class CT_LegendEntryConverter {
  private CT_LegendEntryConverter() {
  }

  public static CT_LegendEntryModel fromDocx4J(CTLegendEntry value) {
    if (value == null) return null;
    // look here false;
    CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel deleteoregLegendEntryData = new CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel();
    if (value.getDelete() != null) deleteoregLegendEntryData = CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newDelete(CT_BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getTxPr() != null) deleteoregLegendEntryData = CT_LegendEntryModel.DeleteOrEG_LegendEntryDataModel.newTxPr(CT_TextBodyConverter.fromDocx4J(value.getTxPr()));
    return new CT_LegendEntryModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), deleteoregLegendEntryData, CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTLegendEntry toDocx4J(CT_LegendEntryModel value) {
    return null;
  }
}
