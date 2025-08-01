package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.drawingml.main.BlipFillPropertiesConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.ShapeStyleConverter;
import com.scell.model.drawingml.chartDrawing.PictureModel;
import org.docx4j.dml.chartDrawing.CTPicture;

public class PictureConverter {
  private PictureConverter() {
  }

  public static PictureModel fromDocx4J(CTPicture value) {
    if (value == null) return null;
    return new PictureModel(BooleanValueConverter.fromDocx4J(value.isFPublished()), StringValueConverter.fromDocx4J(value.getMacro()), PictureNonVisualConverter.fromDocx4J(value.getNvPicPr()), BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ShapeStyleConverter.fromDocx4J(value.getStyle()));
  }
}
