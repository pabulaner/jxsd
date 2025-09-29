package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.LvlModel;
import org.docx4j.dml.chart.CTLvl;

/**
 * This is a generated sequence class.
 */
public class LvlConverter {
  private LvlConverter() {
  }

  public static LvlModel fromDocx4j(CTLvl value) {
    if (value == null) return null;
    return new LvlModel(value.getPt().stream().map(StrValConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTLvl toDocx4j(LvlModel value) {
    if (value == null) return null;
    CTLvl result = new CTLvl();
    result.getPt().addAll(value.getPt().stream().map(StrValConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
