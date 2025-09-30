package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.Path2DModel;
import org.docx4j.dml.CTPath2D;
import org.docx4j.dml.CTPath2DArcTo;
import org.docx4j.dml.CTPath2DClose;
import org.docx4j.dml.CTPath2DCubicBezierTo;
import org.docx4j.dml.CTPath2DLineTo;
import org.docx4j.dml.CTPath2DMoveTo;
import org.docx4j.dml.CTPath2DQuadBezierTo;

/**
 * This is a generated sequence class.
 */
public class Path2DConverter {
  private Path2DConverter() {
  }

  public static Path2DModel fromDocx4j(CTPath2D value) {
    if (value == null) return null;
    List<Path2DModel.CloseOrMoveToOrLnTo> closeOrMoveToOrLnTo = value.getCloseOrMoveToOrLnTo().stream().map(val -> {
      if (val instanceof CTPath2DClose) return Path2DModel.CloseOrMoveToOrLnTo.newClose(Path2DCloseConverter.fromDocx4j((CTPath2DClose) val));
      if (val instanceof CTPath2DMoveTo) return Path2DModel.CloseOrMoveToOrLnTo.newMoveTo(Path2DMoveToConverter.fromDocx4j((CTPath2DMoveTo) val));
      if (val instanceof CTPath2DLineTo) return Path2DModel.CloseOrMoveToOrLnTo.newLnTo(Path2DLineToConverter.fromDocx4j((CTPath2DLineTo) val));
      if (val instanceof CTPath2DArcTo) return Path2DModel.CloseOrMoveToOrLnTo.newArcTo(Path2DArcToConverter.fromDocx4j((CTPath2DArcTo) val));
      if (val instanceof CTPath2DQuadBezierTo) return Path2DModel.CloseOrMoveToOrLnTo.newQuadBezTo(Path2DQuadBezierToConverter.fromDocx4j((CTPath2DQuadBezierTo) val));
      if (val instanceof CTPath2DCubicBezierTo) return Path2DModel.CloseOrMoveToOrLnTo.newCubicBezTo(Path2DCubicBezierToConverter.fromDocx4j((CTPath2DCubicBezierTo) val));
      return null;
    } ).collect(Collectors.toList());
    return new Path2DModel(PathFillModeValueConverter.fromDocx4j(value.getFill()), BooleanValueConverter.fromDocx4j(value.isExtrusionOk()), PositiveCoordinateValueConverter.fromDocx4j(value.getH()), PositiveCoordinateValueConverter.fromDocx4j(value.getW()), BooleanValueConverter.fromDocx4j(value.isStroke()), closeOrMoveToOrLnTo);
  }

  public static CTPath2D toDocx4j(Path2DModel value) {
    if (value == null) return null;
    CTPath2D result = new CTPath2D();
    result.setFill(PathFillModeValueConverter.toDocx4j(value.getFill()));
    result.setExtrusionOk(BooleanValueConverter.toDocx4j(value.getExtrusionOk()));
    result.setH(PositiveCoordinateValueConverter.toDocx4j(value.getH()));
    result.setW(PositiveCoordinateValueConverter.toDocx4j(value.getW()));
    result.setStroke(BooleanValueConverter.toDocx4j(value.getStroke()));
    result.getCloseOrMoveToOrLnTo().addAll(value.getCloseOrMoveToOrLnTo().stream().map(val -> {
      if (val.isClose()) return Path2DCloseConverter.toDocx4j(val.getClose());
      if (val.isMoveTo()) return Path2DMoveToConverter.toDocx4j(val.getMoveTo());
      if (val.isLnTo()) return Path2DLineToConverter.toDocx4j(val.getLnTo());
      if (val.isArcTo()) return Path2DArcToConverter.toDocx4j(val.getArcTo());
      if (val.isQuadBezTo()) return Path2DQuadBezierToConverter.toDocx4j(val.getQuadBezTo());
      if (val.isCubicBezTo()) return Path2DCubicBezierToConverter.toDocx4j(val.getCubicBezTo());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
