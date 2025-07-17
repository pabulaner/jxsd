package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DLblsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTDLbls;

public class CT_DLblsConverter {
  private CT_DLblsConverter() {
  }

  public static CT_DLblsModel fromDocx4j(CTDLbls value) {
    if (value == null) return null;
    return new CT_DLblsModel(value.getDLbl().stream().map(CT_DLblConverter::fromDocx4j).collect(Collectors.toList()), DeleteOrNumFmtConverter.fromDocx4j(value.getDeleteOrNumFmt()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDLbls toDocx4j(CT_DLblsModel value) {
    return null;
  }

  public static class DeleteOrNumFmtConverter {
    private DeleteOrNumFmtConverter() {
    }

    public static CT_DLblsModel.DeleteOrNumFmtModel fromDocx4j(CTDLbls.DeleteOrNumFmt value) {
      if (value == null) return null;
    }

    public static CTDLbls.DeleteOrNumFmt toDocx4j(CT_DLblsModel.DeleteOrNumFmtModel value) {
      return null;
    }
  }
}
