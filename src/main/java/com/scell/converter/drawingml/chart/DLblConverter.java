package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.DLblModel;
import org.docx4j.dml.chart.CTDLbl;

public class DLblConverter {
  private DLblConverter() {
  }

  public static DLblModel fromDocx4J(CTDLbl value) {
    if (value == null) return null;
    DLblModel.DeleteOrDLblValueModel deleteOrDLbl = new DLblModel.DeleteOrDLblValueModel();
    if (value.getDelete() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newDelete(BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getLayout() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newLayout(LayoutConverter.fromDocx4J(value.getLayout()));
    if (value.getTx() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newTx(TxConverter.fromDocx4J(value.getTx()));
    if (value.getNumFmt() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newNumFmt(NumFmtConverter.fromDocx4J(value.getNumFmt()));
    if (value.getSpPr() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newSpPr(ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
    if (value.getTxPr() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newTxPr(TextBodyConverter.fromDocx4J(value.getTxPr()));
    if (value.getDLblPos() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newDLblPos(DLblPosConverter.fromDocx4J(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newShowLegendKey(BooleanConverter.fromDocx4J(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newShowVal(BooleanConverter.fromDocx4J(value.getShowVal()));
    if (value.getShowCatName() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newShowCatName(BooleanConverter.fromDocx4J(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newShowSerName(BooleanConverter.fromDocx4J(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newShowPercent(BooleanConverter.fromDocx4J(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newShowBubbleSize(BooleanConverter.fromDocx4J(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteOrDLbl = DLblModel.DeleteOrDLblValueModel.newSeparator(StringValueConverter.fromDocx4J(value.getSeparator()));
    return new DLblModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), deleteOrDLbl, ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
