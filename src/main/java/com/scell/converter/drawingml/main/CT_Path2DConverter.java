package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_Path2DModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2D;

public class CT_Path2DConverter {
  private CT_Path2DConverter() {
  }

  public static CT_Path2DModel fromDocx4j(CTPath2D value) {
    if (value == null) return null;
    return new CT_Path2DModel(ST_PathFillModeConverter.fromDocx4j(value.getFill()), BooleanConverter.fromDocx4j(value.getExtrusionOk()), ST_PositiveCoordinateConverter.fromDocx4j(value.getH()), ST_PositiveCoordinateConverter.fromDocx4j(value.getW()), BooleanConverter.fromDocx4j(value.getStroke()), value.getCloseOrMoveToOrLnTo().stream().map(CloseOrMoveToOrLnToConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPath2D toDocx4j(CT_Path2DModel value) {
    return null;
  }

  public static class CloseOrMoveToOrLnToConverter {
    private CloseOrMoveToOrLnToConverter() {
    }

    public static CT_Path2DModel.CloseOrMoveToOrLnToModel fromDocx4j(
        CTPath2D.CloseOrMoveToOrLnTo value) {
      if (value == null) return null;
    }

    public static CTPath2D.CloseOrMoveToOrLnTo toDocx4j(
        CT_Path2DModel.CloseOrMoveToOrLnToModel value) {
      return null;
    }
  }
}
