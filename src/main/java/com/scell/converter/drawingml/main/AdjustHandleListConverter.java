package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AdjustHandleListModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTAdjustHandleList;
import org.docx4j.dml.CTPolarAdjustHandle;
import org.docx4j.dml.CTXYAdjustHandle;

public class AdjustHandleListConverter {
  private AdjustHandleListConverter() {
  }

  public static AdjustHandleListModel fromDocx4J(CTAdjustHandleList value) {
    if (value == null) return null;
    List<AdjustHandleListModel.AhXYOrAhPolarValueModel> ahXYOrAhPolar = value.getAhXYOrAhPolar().stream().map(val -> {
      if (val instanceof CTXYAdjustHandle) return AdjustHandleListModel.AhXYOrAhPolarValueModel.newAhXY(XYAdjustHandleConverter.fromDocx4J((CTXYAdjustHandle) val));
      if (val instanceof CTPolarAdjustHandle) return AdjustHandleListModel.AhXYOrAhPolarValueModel.newAhPolar(PolarAdjustHandleConverter.fromDocx4J((CTPolarAdjustHandle) val));
      return new AdjustHandleListModel.AhXYOrAhPolarValueModel();
    } ).collect(Collectors.toList());
    return new AdjustHandleListModel(ahXYOrAhPolar);
  }
}
