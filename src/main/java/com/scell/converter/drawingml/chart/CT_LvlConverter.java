package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LvlModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLvl;

public class CT_LvlConverter {
  private CT_LvlConverter() {
  }

  public static CT_LvlModel fromDocx4j(CTLvl value) {
    if (value == null) return null;
    return new CT_LvlModel(value.getPt().stream().map(CT_StrValConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTLvl toDocx4j(CT_LvlModel value) {
    return null;
  }
}
