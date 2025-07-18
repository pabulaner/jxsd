package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DLblModel;
import org.docx4j.dml.chart.CTDLbl;

public class CT_DLblConverter {
  private CT_DLblConverter() {
  }

  public static CT_DLblModel fromDocx4J(CTDLbl value) {
    if (value == null) return null;
    // look here false;
    CT_DLblModel.DeleteOrGroup_DLblModel deleteorgroupDLbl = new CT_DLblModel.DeleteOrGroup_DLblModel();
    if (value.getDelete() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newDelete(CT_BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getLayout() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newLayout(CT_LayoutConverter.fromDocx4J(value.getLayout()));
    if (value.getTx() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newTx(CT_TxConverter.fromDocx4J(value.getTx()));
    if (value.getNumFmt() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newNumFmt(CT_NumFmtConverter.fromDocx4J(value.getNumFmt()));
    if (value.getSpPr() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newSpPr(CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
    if (value.getTxPr() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newTxPr(CT_TextBodyConverter.fromDocx4J(value.getTxPr()));
    if (value.getDLblPos() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newDLblPos(CT_DLblPosConverter.fromDocx4J(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newShowLegendKey(CT_BooleanConverter.fromDocx4J(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newShowVal(CT_BooleanConverter.fromDocx4J(value.getShowVal()));
    if (value.getShowCatName() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newShowCatName(CT_BooleanConverter.fromDocx4J(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newShowSerName(CT_BooleanConverter.fromDocx4J(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newShowPercent(CT_BooleanConverter.fromDocx4J(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newShowBubbleSize(CT_BooleanConverter.fromDocx4J(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteorgroupDLbl = CT_DLblModel.DeleteOrGroup_DLblModel.newSeparator(StringConverter.fromDocx4J(value.getSeparator()));
    return new CT_DLblModel(CT_UnsignedIntConverter.fromDocx4J(value.getIdx()), deleteorgroupDLbl, CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDLbl toDocx4J(CT_DLblModel value) {
    return null;
  }
}
