package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public interface ISeriesValueModel {
  UnsignedIntModel getIdx();

  UnsignedIntModel getOrder();

  SerTxModel getTx();

  ShapePropertiesModel getSpPr();

  List<DPtModel> getDPt();

  DLblsModel getDLbls();

  AxDataSourceModel getCat();

  NumDataSourceModel getVal();

  ExtensionListModel getExtLst();
}
