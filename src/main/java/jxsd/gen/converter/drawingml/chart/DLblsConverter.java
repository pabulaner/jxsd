package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import org.docx4j.dml.chart.CTDLbls;

/**
 * This is a generated sequence class.
 */
public class DLblsConverter {
  private DLblsConverter() {
  }

  public static DLblsModel fromDocx4j(CTDLbls value) {
    if (value == null) return null;
    DLblsModel.DeleteOrDLbls deleteOrDLbls = new DLblsModel.DeleteOrDLbls();
    if (value.getDelete() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newDelete(BooleanConverter.fromDocx4j(value.getDelete()));
    if (value.getNumFmt() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newNumFmt(NumFmtConverter.fromDocx4j(value.getNumFmt()));
    if (value.getSpPr() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newSpPr(ShapePropertiesConverter.fromDocx4j(value.getSpPr()));
    if (value.getTxPr() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newTxPr(TextBodyConverter.fromDocx4j(value.getTxPr()));
    if (value.getDLblPos() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newDLblPos(DLblPosConverter.fromDocx4j(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowLegendKey(BooleanConverter.fromDocx4j(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowVal(BooleanConverter.fromDocx4j(value.getShowVal()));
    if (value.getShowCatName() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowCatName(BooleanConverter.fromDocx4j(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowSerName(BooleanConverter.fromDocx4j(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowPercent(BooleanConverter.fromDocx4j(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowBubbleSize(BooleanConverter.fromDocx4j(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newSeparator(StringValueConverter.fromDocx4j(value.getSeparator()));
    if (value.getShowLeaderLines() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newShowLeaderLines(BooleanConverter.fromDocx4j(value.getShowLeaderLines()));
    if (value.getLeaderLines() != null) deleteOrDLbls = DLblsModel.DeleteOrDLbls.newLeaderLines(ChartLinesConverter.fromDocx4j(value.getLeaderLines()));
    return new DLblsModel(value.getDLbl().stream().map(DLblConverter::fromDocx4j).collect(Collectors.toList()), deleteOrDLbls, ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDLbls toDocx4j(DLblsModel value) {
    if (value == null) return null;
    CTDLbls result = new CTDLbls();
    result.getDLbl().addAll(value.getDLbl().stream().map(DLblConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getDeleteOrDLbls().isDelete()) result.setDelete(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getDelete()));
    if (value.getDeleteOrDLbls().isNumFmt()) result.setNumFmt(NumFmtConverter.toDocx4j(value.getDeleteOrDLbls().getNumFmt()));
    if (value.getDeleteOrDLbls().isSpPr()) result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getDeleteOrDLbls().getSpPr()));
    if (value.getDeleteOrDLbls().isTxPr()) result.setTxPr(TextBodyConverter.toDocx4j(value.getDeleteOrDLbls().getTxPr()));
    if (value.getDeleteOrDLbls().isDLblPos()) result.setDLblPos(DLblPosConverter.toDocx4j(value.getDeleteOrDLbls().getDLblPos()));
    if (value.getDeleteOrDLbls().isShowLegendKey()) result.setShowLegendKey(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowLegendKey()));
    if (value.getDeleteOrDLbls().isShowVal()) result.setShowVal(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowVal()));
    if (value.getDeleteOrDLbls().isShowCatName()) result.setShowCatName(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowCatName()));
    if (value.getDeleteOrDLbls().isShowSerName()) result.setShowSerName(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowSerName()));
    if (value.getDeleteOrDLbls().isShowPercent()) result.setShowPercent(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowPercent()));
    if (value.getDeleteOrDLbls().isShowBubbleSize()) result.setShowBubbleSize(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowBubbleSize()));
    if (value.getDeleteOrDLbls().isSeparator()) result.setSeparator(StringValueConverter.toDocx4j(value.getDeleteOrDLbls().getSeparator()));
    if (value.getDeleteOrDLbls().isShowLeaderLines()) result.setShowLeaderLines(BooleanConverter.toDocx4j(value.getDeleteOrDLbls().getShowLeaderLines()));
    if (value.getDeleteOrDLbls().isLeaderLines()) result.setLeaderLines(ChartLinesConverter.toDocx4j(value.getDeleteOrDLbls().getLeaderLines()));
    return result;
  }
}
