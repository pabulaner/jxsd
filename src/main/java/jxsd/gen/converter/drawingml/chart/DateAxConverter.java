package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.DateAxModel;
import org.docx4j.dml.chart.CTDateAx;

/**
 * This is a generated sequence class.
 */
public class DateAxConverter {
  private DateAxConverter() {
  }

  public static DateAxModel fromDocx4j(CTDateAx value) {
    if (value == null) return null;
    DateAxModel.CrossesOrCrossesAt crossesOrCrossesAt = new DateAxModel.CrossesOrCrossesAt();
    if (value.getCrosses() != null) crossesOrCrossesAt = DateAxModel.CrossesOrCrossesAt.newCrosses(CrossesConverter.fromDocx4j(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = DateAxModel.CrossesOrCrossesAt.newCrossesAt(DoubleConverter.fromDocx4j(value.getCrossesAt()));
    return new DateAxModel(UnsignedIntConverter.fromDocx4j(value.getAxId()), ScalingConverter.fromDocx4j(value.getScaling()), BooleanConverter.fromDocx4j(value.getDelete()), AxPosConverter.fromDocx4j(value.getAxPos()), ChartLinesConverter.fromDocx4j(value.getMajorGridlines()), ChartLinesConverter.fromDocx4j(value.getMinorGridlines()), TitleConverter.fromDocx4j(value.getTitle()), NumFmtConverter.fromDocx4j(value.getNumFmt()), TickMarkConverter.fromDocx4j(value.getMajorTickMark()), TickMarkConverter.fromDocx4j(value.getMinorTickMark()), TickLblPosConverter.fromDocx4j(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), UnsignedIntConverter.fromDocx4j(value.getCrossAx()), crossesOrCrossesAt, BooleanConverter.fromDocx4j(value.getAuto()), LblOffsetConverter.fromDocx4j(value.getLblOffset()), TimeUnitConverter.fromDocx4j(value.getBaseTimeUnit()), AxisUnitConverter.fromDocx4j(value.getMajorUnit()), TimeUnitConverter.fromDocx4j(value.getMajorTimeUnit()), AxisUnitConverter.fromDocx4j(value.getMinorUnit()), TimeUnitConverter.fromDocx4j(value.getMinorTimeUnit()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDateAx toDocx4j(DateAxModel value) {
    if (value == null) return null;
    CTDateAx result = new CTDateAx();
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
    result.setAuto(BooleanConverter.toDocx4j(value.getAuto()));
    result.setLblOffset(LblOffsetConverter.toDocx4j(value.getLblOffset()));
    result.setBaseTimeUnit(TimeUnitConverter.toDocx4j(value.getBaseTimeUnit()));
    result.setMajorUnit(AxisUnitConverter.toDocx4j(value.getMajorUnit()));
    result.setMajorTimeUnit(TimeUnitConverter.toDocx4j(value.getMajorTimeUnit()));
    result.setMinorUnit(AxisUnitConverter.toDocx4j(value.getMinorUnit()));
    result.setMinorTimeUnit(TimeUnitConverter.toDocx4j(value.getMinorTimeUnit()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getCrossesOrCrossesAt().isCrosses()) result.setCrosses(CrossesConverter.toDocx4j(value.getCrossesOrCrossesAt().getCrosses()));
    if (value.getCrossesOrCrossesAt().isCrossesAt()) result.setCrossesAt(DoubleConverter.toDocx4j(value.getCrossesOrCrossesAt().getCrossesAt()));
    return result;
  }
}
