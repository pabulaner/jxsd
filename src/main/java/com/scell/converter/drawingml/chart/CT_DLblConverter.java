package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DLblModel;
import org.docx4j.dml.chart.CTDLbl;

public class CT_DLblConverter {
  private CT_DLblConverter() {
  }

  public static CT_DLblModel fromDocx4j(CTDLbl value) {
    if (value == null) return null;
    return new CT_DLblModel(CT_UnsignedIntConverter.fromDocx4j(value.getIdx()), DeleteOrLayoutConverter.fromDocx4j(value.getDeleteOrLayout()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDLbl toDocx4j(CT_DLblModel value) {
    return null;
  }

  public static class DeleteOrLayoutConverter {
    private DeleteOrLayoutConverter() {
    }

    public static CT_DLblModel.DeleteOrLayoutModel fromDocx4j(CTDLbl.DeleteOrLayout value) {
      if (value == null) return null;
    }

    public static CTDLbl.DeleteOrLayout toDocx4j(CT_DLblModel.DeleteOrLayoutModel value) {
      return null;
    }
  }
}
