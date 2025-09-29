package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.View3DModel;
import org.docx4j.dml.chart.CTView3D;

/**
 * This is a generated sequence class.
 */
public class View3DConverter {
  private View3DConverter() {
  }

  public static View3DModel fromDocx4j(CTView3D value) {
    if (value == null) return null;
    return new View3DModel(RotXConverter.fromDocx4j(value.getRotX()), HPercentConverter.fromDocx4j(value.getHPercent()), RotYConverter.fromDocx4j(value.getRotY()), DepthPercentConverter.fromDocx4j(value.getDepthPercent()), BooleanConverter.fromDocx4j(value.getRAngAx()), PerspectiveConverter.fromDocx4j(value.getPerspective()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTView3D toDocx4j(View3DModel value) {
    if (value == null) return null;
    CTView3D result = new CTView3D();
    result.setRotX(RotXConverter.toDocx4j(value.getRotX()));
    result.setHPercent(HPercentConverter.toDocx4j(value.getHPercent()));
    result.setRotY(RotYConverter.toDocx4j(value.getRotY()));
    result.setDepthPercent(DepthPercentConverter.toDocx4j(value.getDepthPercent()));
    result.setRAngAx(BooleanConverter.toDocx4j(value.getRAngAx()));
    result.setPerspective(PerspectiveConverter.toDocx4j(value.getPerspective()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
