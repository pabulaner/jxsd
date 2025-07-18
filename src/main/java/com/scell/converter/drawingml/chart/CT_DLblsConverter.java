package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTDLbls;

public class CT_DLblsConverter {
  private CT_DLblsConverter() {
  }

  public static CT_DLblsModel fromDocx4J(CTDLbls value) {
    if (value == null) return null;
    // look here false;
    CT_DLblsModel.DeleteOrGroup_DLblsModel deleteorgroupDLbls = new CT_DLblsModel.DeleteOrGroup_DLblsModel();
    if (value.getDelete() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newDelete(CT_BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getNumFmt() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newNumFmt(CT_NumFmtConverter.fromDocx4J(value.getNumFmt()));
    if (value.getSpPr() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newSpPr(CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
    if (value.getTxPr() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newTxPr(CT_TextBodyConverter.fromDocx4J(value.getTxPr()));
    if (value.getDLblPos() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newDLblPos(CT_DLblPosConverter.fromDocx4J(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowLegendKey(CT_BooleanConverter.fromDocx4J(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowVal(CT_BooleanConverter.fromDocx4J(value.getShowVal()));
    if (value.getShowCatName() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowCatName(CT_BooleanConverter.fromDocx4J(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowSerName(CT_BooleanConverter.fromDocx4J(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowPercent(CT_BooleanConverter.fromDocx4J(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowBubbleSize(CT_BooleanConverter.fromDocx4J(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newSeparator(StringConverter.fromDocx4J(value.getSeparator()));
    if (value.getShowLeaderLines() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newShowLeaderLines(CT_BooleanConverter.fromDocx4J(value.getShowLeaderLines()));
    if (value.getLeaderLines() != null) deleteorgroupDLbls = CT_DLblsModel.DeleteOrGroup_DLblsModel.newLeaderLines(CT_ChartLinesConverter.fromDocx4J(value.getLeaderLines()));
    return new CT_DLblsModel(value.getDLbl().stream().map(CT_DLblConverter::fromDocx4J).collect(Collectors.toList()), deleteorgroupDLbls, CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDLbls toDocx4J(CT_DLblsModel value) {
    return null;
  }
}
