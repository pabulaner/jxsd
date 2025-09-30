package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.converter.drawingml.main.TextBodyConverter;
import jxsd.gen.model.drawingml.chart.DLblModel;
import org.docx4j.dml.chart.CTDLbl;

/**
 * This is a generated sequence class.
 */
public class DLblConverter {
  private DLblConverter() {
  }

  public static DLblModel fromDocx4j(CTDLbl value) {
    if (value == null) return null;
    DLblModel.DeleteOrDLbl deleteOrDLbl = new DLblModel.DeleteOrDLbl();
    if (value.getDelete() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newDelete(BooleanConverter.fromDocx4j(value.getDelete()));
    if (value.getLayout() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newLayout(LayoutConverter.fromDocx4j(value.getLayout()));
    if (value.getTx() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newTx(TxConverter.fromDocx4j(value.getTx()));
    if (value.getNumFmt() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newNumFmt(NumFmtConverter.fromDocx4j(value.getNumFmt()));
    if (value.getSpPr() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newSpPr(ShapePropertiesConverter.fromDocx4j(value.getSpPr()));
    if (value.getTxPr() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newTxPr(TextBodyConverter.fromDocx4j(value.getTxPr()));
    if (value.getDLblPos() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newDLblPos(DLblPosConverter.fromDocx4j(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newShowLegendKey(BooleanConverter.fromDocx4j(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newShowVal(BooleanConverter.fromDocx4j(value.getShowVal()));
    if (value.getShowCatName() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newShowCatName(BooleanConverter.fromDocx4j(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newShowSerName(BooleanConverter.fromDocx4j(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newShowPercent(BooleanConverter.fromDocx4j(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newShowBubbleSize(BooleanConverter.fromDocx4j(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteOrDLbl = DLblModel.DeleteOrDLbl.newSeparator(StringValueConverter.fromDocx4j(value.getSeparator()));
    return new DLblModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), deleteOrDLbl, ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDLbl toDocx4j(DLblModel value) {
    if (value == null) return null;
    CTDLbl result = new CTDLbl();
    result.setIdx(UnsignedIntConverter.toDocx4j(value.getIdx()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    if (value.getDeleteOrDLbl().isDelete()) result.setDelete(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getDelete()));
    if (value.getDeleteOrDLbl().isLayout()) result.setLayout(LayoutConverter.toDocx4j(value.getDeleteOrDLbl().getLayout()));
    if (value.getDeleteOrDLbl().isTx()) result.setTx(TxConverter.toDocx4j(value.getDeleteOrDLbl().getTx()));
    if (value.getDeleteOrDLbl().isNumFmt()) result.setNumFmt(NumFmtConverter.toDocx4j(value.getDeleteOrDLbl().getNumFmt()));
    if (value.getDeleteOrDLbl().isSpPr()) result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getDeleteOrDLbl().getSpPr()));
    if (value.getDeleteOrDLbl().isTxPr()) result.setTxPr(TextBodyConverter.toDocx4j(value.getDeleteOrDLbl().getTxPr()));
    if (value.getDeleteOrDLbl().isDLblPos()) result.setDLblPos(DLblPosConverter.toDocx4j(value.getDeleteOrDLbl().getDLblPos()));
    if (value.getDeleteOrDLbl().isShowLegendKey()) result.setShowLegendKey(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getShowLegendKey()));
    if (value.getDeleteOrDLbl().isShowVal()) result.setShowVal(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getShowVal()));
    if (value.getDeleteOrDLbl().isShowCatName()) result.setShowCatName(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getShowCatName()));
    if (value.getDeleteOrDLbl().isShowSerName()) result.setShowSerName(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getShowSerName()));
    if (value.getDeleteOrDLbl().isShowPercent()) result.setShowPercent(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getShowPercent()));
    if (value.getDeleteOrDLbl().isShowBubbleSize()) result.setShowBubbleSize(BooleanConverter.toDocx4j(value.getDeleteOrDLbl().getShowBubbleSize()));
    if (value.getDeleteOrDLbl().isSeparator()) result.setSeparator(StringValueConverter.toDocx4j(value.getDeleteOrDLbl().getSeparator()));
    return result;
  }
}
