package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LvlModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLvl;

public class LvlConverter {
  private LvlConverter() {
  }

  public static LvlModel fromDocx4J(CTLvl value) {
    if (value == null) return null;
    return new LvlModel(value.getPt().stream().map(StrValConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
