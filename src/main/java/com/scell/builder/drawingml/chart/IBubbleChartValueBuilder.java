package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.IBubbleChartValueModel;

public interface IBubbleChartValueBuilder {
  IBubbleChartValueBuilder setBubble3D(IBubbleChartValueModel value);

  IBubbleChartValueBuilder setBubbleScale(IBubbleChartValueModel value);

  IBubbleChartValueBuilder setShowNegBubbles(IBubbleChartValueModel value);

  IBubbleChartValueBuilder setSizeRepresents(IBubbleChartValueModel value);
}
