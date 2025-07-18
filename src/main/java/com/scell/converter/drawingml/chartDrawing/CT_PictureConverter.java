package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_BlipFillPropertiesConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_ShapeStyleConverter;
import com.scell.model.drawingml.chartDrawing.CT_PictureModel;
import org.docx4j.dml.chartDrawing.CTPicture;

public class CT_PictureConverter {
  private CT_PictureConverter() {
  }

  public static CT_PictureModel fromDocx4J(CTPicture value) {
    if (value == null) return null;
    return new CT_PictureModel(BooleanConverter.fromDocx4J(value.getFPublished()), StringConverter.fromDocx4J(value.getMacro()), CT_PictureNonVisualConverter.fromDocx4J(value.getNvPicPr()), CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_ShapeStyleConverter.fromDocx4J(value.getStyle()));
  }

  public static CTPicture toDocx4J(CT_PictureModel value) {
    return null;
  }
}
