package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.GroupTransform2DModel;
import org.docx4j.dml.CTGroupTransform2D;

/**
 * This is a generated sequence class.
 */
public class GroupTransform2DConverter {
  private GroupTransform2DConverter() {
  }

  public static GroupTransform2DModel fromDocx4j(CTGroupTransform2D value) {
    if (value == null) return null;
    return new GroupTransform2DModel(BooleanValueConverter.fromDocx4j(value.isFlipV()), AngleValueConverter.fromDocx4j(value.getRot()), BooleanValueConverter.fromDocx4j(value.isFlipH()), Point2DConverter.fromDocx4j(value.getOff()), PositiveSize2DConverter.fromDocx4j(value.getExt()), Point2DConverter.fromDocx4j(value.getChOff()), PositiveSize2DConverter.fromDocx4j(value.getChExt()));
  }

  public static CTGroupTransform2D toDocx4j(GroupTransform2DModel value) {
    if (value == null) return null;
    CTGroupTransform2D result = new CTGroupTransform2D();
    result.setFlipV(BooleanValueConverter.toDocx4j(value.getFlipV()));
    result.setRot(AngleValueConverter.toDocx4j(value.getRot()));
    result.setFlipH(BooleanValueConverter.toDocx4j(value.getFlipH()));
    result.setOff(Point2DConverter.toDocx4j(value.getOff()));
    result.setExt(PositiveSize2DConverter.toDocx4j(value.getExt()));
    result.setChOff(Point2DConverter.toDocx4j(value.getChOff()));
    result.setChExt(PositiveSize2DConverter.toDocx4j(value.getChExt()));
    return result;
  }
}
