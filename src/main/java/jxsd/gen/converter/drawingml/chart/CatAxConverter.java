package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.CatAxModel;
import org.docx4j.dml.chart.CTCatAx;

/**
 * This is a generated sequence class.
 */
public class CatAxConverter {
  private CatAxConverter() {
  }

  public static CatAxModel fromDocx4j(CTCatAx value) {
    if (value == null) return null;
    CatAxModel.CrossesOrCrossesAt crossesOrCrossesAt = new CatAxModel.CrossesOrCrossesAt();
    if (value.getCrosses() != null) crossesOrCrossesAt = CatAxModel.CrossesOrCrossesAt.newCrosses(CrossesConverter.fromDocx4j(value.getCrosses()));
    if (value.getCrossesAt() != null) crossesOrCrossesAt = CatAxModel.CrossesOrCrossesAt.newCrossesAt(DoubleConverter.fromDocx4j(value.getCrossesAt()));
    return new CatAxModel(UnsignedIntConverter.fromDocx4j(value.getAxId()), ScalingConverter.fromDocx4j(value.getScaling()), BooleanConverter.fromDocx4j(value.getDelete()), AxPosConverter.fromDocx4j(value.getAxPos()), ChartLinesConverter.fromDocx4j(value.getMajorGridlines()), ChartLinesConverter.fromDocx4j(value.getMinorGridlines()), TitleConverter.fromDocx4j(value.getTitle()), NumFmtConverter.fromDocx4j(value.getNumFmt()), TickMarkConverter.fromDocx4j(value.getMajorTickMark()), TickMarkConverter.fromDocx4j(value.getMinorTickMark()), TickLblPosConverter.fromDocx4j(value.getTickLblPos()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TextBodyConverter.fromDocx4j(value.getTxPr()), UnsignedIntConverter.fromDocx4j(value.getCrossAx()), crossesOrCrossesAt, BooleanConverter.fromDocx4j(value.getAuto()), LblAlgnConverter.fromDocx4j(value.getLblAlgn()), LblOffsetConverter.fromDocx4j(value.getLblOffset()), SkipConverter.fromDocx4j(value.getTickLblSkip()), SkipConverter.fromDocx4j(value.getTickMarkSkip()), BooleanConverter.fromDocx4j(value.getNoMultiLvlLbl()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTCatAx toDocx4j(CatAxModel value) {
    if (value == null) return null;
    CTCatAx result = new CTCatAx();
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
    result.setLblAlgn(LblAlgnConverter.toDocx4j(value.getLblAlgn()));
    result.setLblOffset(LblOffsetConverter.toDocx4j(value.getLblOffset()));
    result.setTickLblSkip(SkipConverter.toDocx4j(value.getTickLblSkip()));
    result.setTickMarkSkip(SkipConverter.toDocx4j(value.getTickMarkSkip()));
    result.setNoMultiLvlLbl(BooleanConverter.toDocx4j(value.getNoMultiLvlLbl()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getCrossesOrCrossesAt().isCrosses()) result.setCrosses(CrossesConverter.toDocx4j(value.getCrossesOrCrossesAt().getCrosses()));
    if (value.getCrossesOrCrossesAt().isCrossesAt()) result.setCrossesAt(DoubleConverter.toDocx4j(value.getCrossesOrCrossesAt().getCrossesAt()));
    return result;
  }
}
