package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LegendEntryModel;
import org.docx4j.dml.chart.CTLegendEntry;

public class CT_LegendEntryConverter {
  private CT_LegendEntryConverter() {
  }

  public static CT_LegendEntryModel fromDocx4j(CTLegendEntry value) {
    if (value == null) return null;
    return new CT_LegendEntryModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), DeleteOrTxPrConverter.fromDocx4j(value.getDeleteOrTxPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLegendEntry toDocx4j(CT_LegendEntryModel value) {
    return null;
  }

  public static class DeleteOrTxPrConverter {
    private DeleteOrTxPrConverter() {
    }

    public static CT_LegendEntryModel.DeleteOrTxPrModel fromDocx4j(
        CTLegendEntry.DeleteOrTxPr value) {
      if (value == null) return null;
    }

    public static CTLegendEntry.DeleteOrTxPr toDocx4j(CT_LegendEntryModel.DeleteOrTxPrModel value) {
      return null;
    }
  }
}
