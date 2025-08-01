package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.PlotAreaModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTCatAx;
import org.docx4j.dml.chart.CTDateAx;
import org.docx4j.dml.chart.CTPlotArea;
import org.docx4j.dml.chart.CTSerAx;
import org.docx4j.dml.chart.CTValAx;

public class PlotAreaConverter {
  private PlotAreaConverter() {
  }

  public static PlotAreaModel fromDocx4J(CTPlotArea value) {
    if (value == null) return null;
    List<PlotAreaModel.ValAxOrCatAxOrDateAxValueModel> valAxOrCatAxOrDateAx = value.getValAxOrCatAxOrDateAx().stream().map(val -> {
      if (val instanceof CTValAx) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newValAx(ValAxConverter.fromDocx4J((CTValAx) val));
      if (val instanceof CTCatAx) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newCatAx(CatAxConverter.fromDocx4J((CTCatAx) val));
      if (val instanceof CTDateAx) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newDateAx(DateAxConverter.fromDocx4J((CTDateAx) val));
      if (val instanceof CTSerAx) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newSerAx(SerAxConverter.fromDocx4J((CTSerAx) val));
      return new PlotAreaModel.ValAxOrCatAxOrDateAxValueModel();
    } ).collect(Collectors.toList());
    return new PlotAreaModel(LayoutConverter.fromDocx4J(value.getLayout()), value.getAreaChartOrArea3DChartOrLineChart().stream().map(PlotAreaConverter.AreaChartOrArea3DChartOrLineChartValueConverter::fromDocx4J).collect(Collectors.toList()), valAxOrCatAxOrDateAx, DTableConverter.fromDocx4J(value.getDTable()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
