package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringValueConverter;
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
    DLblsModel.DeleteOrDLblsValueModel deleteOrDLbls = new DLblsModel.DeleteOrDLblsValueModel();
    if (value.getDelete() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newDelete(BooleanConverter.fromDocx4J(value.getDelete()));
    if (value.getNumFmt() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newNumFmt(NumFmtConverter.fromDocx4J(value.getNumFmt()));
    if (value.getSpPr() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newSpPr(ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
    if (value.getTxPr() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newTxPr(TextBodyConverter.fromDocx4J(value.getTxPr()));
    if (value.getDLblPos() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newDLblPos(DLblPosConverter.fromDocx4J(value.getDLblPos()));
    if (value.getShowLegendKey() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowLegendKey(BooleanConverter.fromDocx4J(value.getShowLegendKey()));
    if (value.getShowVal() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowVal(BooleanConverter.fromDocx4J(value.getShowVal()));
    if (value.getShowCatName() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowCatName(BooleanConverter.fromDocx4J(value.getShowCatName()));
    if (value.getShowSerName() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowSerName(BooleanConverter.fromDocx4J(value.getShowSerName()));
    if (value.getShowPercent() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowPercent(BooleanConverter.fromDocx4J(value.getShowPercent()));
    if (value.getShowBubbleSize() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowBubbleSize(BooleanConverter.fromDocx4J(value.getShowBubbleSize()));
    if (value.getSeparator() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newSeparator(StringValueConverter.fromDocx4J(value.getSeparator()));
    if (value.getShowLeaderLines() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newShowLeaderLines(BooleanConverter.fromDocx4J(value.getShowLeaderLines()));
    if (value.getLeaderLines() != null) deleteOrDLbls = DLblsModel.DeleteOrDLblsValueModel.newLeaderLines(ChartLinesConverter.fromDocx4J(value.getLeaderLines()));
    return new DLblsModel(value.getDLbl().stream().map(DLblConverter::fromDocx4J).collect(Collectors.toList()), deleteOrDLbls, ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
