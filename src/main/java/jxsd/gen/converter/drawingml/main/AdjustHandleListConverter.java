package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.AdjustHandleListModel;
import org.docx4j.dml.CTAdjustHandleList;
import org.docx4j.dml.CTPolarAdjustHandle;
import org.docx4j.dml.CTXYAdjustHandle;

/**
 * This is a generated sequence class.
 */
public class AdjustHandleListConverter {
  private AdjustHandleListConverter() {
  }

  public static AdjustHandleListModel fromDocx4j(CTAdjustHandleList value) {
    if (value == null) return null;
    List<AdjustHandleListModel.AhXYOrAhPolar> ahXYOrAhPolar = value.getAhXYOrAhPolar().stream().map(val -> {
      if (val instanceof CTXYAdjustHandle) return CTAdjustHandleList.AhXYOrAhPolar.newAhXY(XYAdjustHandleConverter.fromDocx4j((CTXYAdjustHandle) val));
      if (val instanceof CTPolarAdjustHandle) return CTAdjustHandleList.AhXYOrAhPolar.newAhPolar(PolarAdjustHandleConverter.fromDocx4j((CTPolarAdjustHandle) val));
      return new AdjustHandleListModel(ahXYOrAhPolar);
    }

    public static CTAdjustHandleList toDocx4j(AdjustHandleListModel value) {
      if (value == null) return null;
      CTAdjustHandleList result = new CTAdjustHandleList();
      result.getAhXYOrAhPolar().addAll(value.getAhXYOrAhPolar().stream().map(val -> {
        if (val.isAhXY()) return AdjustHandleListConverter.toDocx4j(val.getAhXY());
        if (val.isAhPolar()) return AdjustHandleListConverter.toDocx4j(val.getAhPolar());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
