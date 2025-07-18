package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjustHandleListModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTAdjustHandleList;
import org.docx4j.dml.CTPolarAdjustHandle;
import org.docx4j.dml.CTXYAdjustHandle;

public class CT_AdjustHandleListConverter {
  private CT_AdjustHandleListConverter() {
  }

  public static CT_AdjustHandleListModel fromDocx4J(CTAdjustHandleList value) {
    if (value == null) return null;
    // look here true;
    List<CT_AdjustHandleListModel.AhXYOrAhPolarModel> ahXYOrAhPolar = value.getAhXYOrAhPolar().stream().map(val -> {
      if (val instanceof CTXYAdjustHandle) return CT_AdjustHandleListModel.AhXYOrAhPolarModel.newAhXY(CT_XYAdjustHandleConverter.fromDocx4J((CTXYAdjustHandle) val));
      if (val instanceof CTPolarAdjustHandle) return CT_AdjustHandleListModel.AhXYOrAhPolarModel.newAhPolar(CT_PolarAdjustHandleConverter.fromDocx4J((CTPolarAdjustHandle) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_AdjustHandleListModel(ahXYOrAhPolar);
  }

  public static CTAdjustHandleList toDocx4J(CT_AdjustHandleListModel value) {
    return null;
  }
}
