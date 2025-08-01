package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ISeriesValueModel;

public interface ISeriesValueBuilder {
  ISeriesValueBuilder setIdx(ISeriesValueModel value);

  ISeriesValueBuilder setOrder(ISeriesValueModel value);

  ISeriesValueBuilder setTx(ISeriesValueModel value);

  ISeriesValueBuilder setSpPr(ISeriesValueModel value);

  ISeriesValueBuilder setDPt(ISeriesValueModel value);

  ISeriesValueBuilder setDLbls(ISeriesValueModel value);

  ISeriesValueBuilder setCat(ISeriesValueModel value);

  ISeriesValueBuilder setVal(ISeriesValueModel value);

  ISeriesValueBuilder setExtLst(ISeriesValueModel value);
}
