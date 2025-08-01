package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.IBarChartValueModel;

public interface IBarChartValueBuilder {
  IBarChartValueBuilder setBarDir(IBarChartValueModel value);

  IBarChartValueBuilder setGapWidth(IBarChartValueModel value);
}
