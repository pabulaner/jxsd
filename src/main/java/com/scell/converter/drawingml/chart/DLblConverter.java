package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.DLblModel;
import org.docx4j.dml.chart.CTDLbl;

public class DLblConverter {
  private DLblConverter() {
  }

  public static DLblModel fromDocx4J(CTDLbl value) {
    if (value == null) return null;
    DLblModel.DeleteOrGroup_DLblModel deleteorgroupDLbl = new DLblModel.DeleteOrGroup_DLblModel();
    if (value.getDelete() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newDelete(BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getLayout() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newLayout(LayoutConverter.fromDocx4J(value.getLayout()));
    if (value.getTx() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newTx(TxConverter.fromDocx4J(value.getTx()));
    if (value.getNumFmt() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newNumFmt(NumFmtConverter.fromDocx4J(value.getNumFmt()));
    if (value.getSpPr() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newSpPr(ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
    if (value.getTxPr() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newTxPr(TextBodyConverter.fromDocx4J(value.getTxPr()));
    if (value.getDLblPos() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newDLblPos(DLblPosConverter.fromDocx4J(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newShowLegendKey(BooleanConverter.fromDocx4J(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newShowVal(BooleanConverter.fromDocx4J(value.getShowVal()));
    if (value.getShowCatName() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newShowCatName(BooleanConverter.fromDocx4J(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newShowSerName(BooleanConverter.fromDocx4J(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newShowPercent(BooleanConverter.fromDocx4J(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newShowBubbleSize(BooleanConverter.fromDocx4J(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteorgroupDLbl = DLblModel.DeleteOrGroup_DLblModel.newSeparator(StringConverter.fromDocx4J(value.getSeparator()));
    return new DLblModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), deleteorgroupDLbl, ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
