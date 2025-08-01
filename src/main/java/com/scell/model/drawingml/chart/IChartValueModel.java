package com.scell.model.drawingml.chart;

import java.util.List;

public interface IChartValueModel {
  DLblsModel getDLbls();

  ExtensionListModel getExtLst();

  List<ISeriesValueModel> getSer();

  BooleanModel getVaryColors();
}
