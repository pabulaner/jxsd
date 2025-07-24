package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.DLblsModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTDLbls;

public class DLblsConverter {
  private DLblsConverter() {
  }

  public static DLblsModel fromDocx4J(CTDLbls value) {
    if (value == null) return null;
    DLblsModel.DeleteOrGroup_DLblsModel deleteorgroupDLbls = new DLblsModel.DeleteOrGroup_DLblsModel();
    if (value.getDelete() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newDelete(BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getNumFmt() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newNumFmt(NumFmtConverter.fromDocx4J(value.getNumFmt()));
    if (value.getSpPr() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newSpPr(ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
    if (value.getTxPr() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newTxPr(TextBodyConverter.fromDocx4J(value.getTxPr()));
    if (value.getDLblPos() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newDLblPos(DLblPosConverter.fromDocx4J(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowLegendKey(BooleanConverter.fromDocx4J(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowVal(BooleanConverter.fromDocx4J(value.getShowVal()));
    if (value.getShowCatName() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowCatName(BooleanConverter.fromDocx4J(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowSerName(BooleanConverter.fromDocx4J(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowPercent(BooleanConverter.fromDocx4J(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowBubbleSize(BooleanConverter.fromDocx4J(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newSeparator(StringConverter.fromDocx4J(value.getSeparator()));
    if (value.getShowLeaderLines() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newShowLeaderLines(BooleanConverter.fromDocx4J(value.getShowLeaderLines()));
    if (value.getLeaderLines() != null) deleteorgroupDLbls = DLblsModel.DeleteOrGroup_DLblsModel.newLeaderLines(ChartLinesConverter.fromDocx4J(value.getLeaderLines()));
    return new DLblsModel(value.getDLbl().stream().map(DLblConverter::fromDocx4J).collect(Collectors.toList()), deleteorgroupDLbls, ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
