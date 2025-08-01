package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.IChartValueModel;

public interface IChartValueBuilder {
  IChartValueBuilder setDLbls(IChartValueModel value);

  IChartValueBuilder setExtLst(IChartValueModel value);

  IChartValueBuilder setSer(IChartValueModel value);

  IChartValueBuilder setVaryColors(IChartValueModel value);
}
