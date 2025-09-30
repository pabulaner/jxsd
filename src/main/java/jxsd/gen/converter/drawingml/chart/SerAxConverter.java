package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.SerAxModel;
import org.docx4j.dml.chart.CTSerAx;

/**
 * This is a generated sequence class.
 */
public class SerAxConverter {
  private SerAxConverter() {
  }

  public static SerAxModel fromDocx4j(CTSerAx value) {
    if (value == null) return null;
    SerAxModel.CrossesOrCrossesAt crossesOrCrossesAt = new SerAxModel.CrossesOrCrossesAt();
    if (value.getCrosses() != null) crossesOrCrossesAt = SerAxModel.CrossesOrCrossesAt.newCrosses(CrossesConverter.fromDocx4j(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = SerAxModel.CrossesOrCrossesAt.newCrossesAt(DoubleConverter.fromDocx4j(value.getCrossesAt()));
    return new SerAxModel(UnsignedIntConverter.fromDocx4j(value.getAxId()), ScalingConverter.fromDocx4j(value.getScaling()), BooleanConverter.fromDocx4j(value.getDelete()), AxPosConverter.fromDocx4j(value.getAxPos()), ChartLinesConverter.fromDocx4j(value.getMajorGridlines()), ChartLinesConverter.fromDocx4j(value.getMinorGridlines()), TitleConverter.fromDocx4j(value.getTitle()), NumFmtConverter.fromDocx4j(value.getNumFmt()), TickMarkConverter.fromDocx4j(value.getMajorTickMark()), TickMarkConverter.fromDocx4j(value.getMinorTickMark()), TickLblPosConverter.fromDocx4j(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), UnsignedIntConverter.fromDocx4j(value.getCrossAx()), crossesOrCrossesAt, SkipConverter.fromDocx4j(value.getTickLblSkip()), SkipConverter.fromDocx4j(value.getTickMarkSkip()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSerAx toDocx4j(SerAxModel value) {
    if (value == null) return null;
    CTSerAx result = new CTSerAx();
    result.setAxId(UnsignedIntConverter.toDocx4j(value.getAxId()));
    result.setScaling(ScalingConverter.toDocx4j(value.getScaling()));
    result.setDelete(BooleanConverter.toDocx4j(value.getDelete()));
    result.setAxPos(AxPosConverter.toDocx4j(value.getAxPos()));
    result.setMajorGridlines(ChartLinesConverter.toDocx4j(value.getMajorGridlines()));
    result.setMinorGridlines(ChartLinesConverter.toDocx4j(value.getMinorGridlines()));
    result.setTitle(TitleConverter.toDocx4j(value.getTitle()));
    result.setNumFmt(NumFmtConverter.toDocx4j(value.getNumFmt()));
    result.setMajorTickMark(TickMarkConverter.toDocx4j(value.getMajorTickMark()));
    result.setMinorTickMark(TickMarkConverter.toDocx4j(value.getMinorTickMark()));
    result.setTickLblPos(TickLblPosConverter.toDocx4j(value.getTickLblPos()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTxPr(TextBodyConverter.toDocx4j(value.getTxPr()));
    result.setCrossAx(UnsignedIntConverter.toDocx4j(value.getCrossAx()));
    result.setTickLblSkip(SkipConverter.toDocx4j(value.getTickLblSkip()));
    result.setTickMarkSkip(SkipConverter.toDocx4j(value.getTickMarkSkip()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getCrossesOrCrossesAt().isCrosses()) result.setCrosses(CrossesConverter.toDocx4j(value.getCrossesOrCrossesAt().getCrosses()));
    if (value.getCrossesOrCrossesAt().isCrossesAt()) result.setCrossesAt(DoubleConverter.toDocx4j(value.getCrossesOrCrossesAt().getCrossesAt()));
    return result;
  }
}
