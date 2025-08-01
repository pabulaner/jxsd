package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import org.docx4j.dml.CTNonVisualDrawingProps;

public class NonVisualDrawingPropsConverter {
  private NonVisualDrawingPropsConverter() {
  }

  public static NonVisualDrawingPropsModel fromDocx4J(CTNonVisualDrawingProps value) {
    if (value == null) return null;
    return new NonVisualDrawingPropsModel(BooleanValueConverter.fromDocx4J(value.isHidden()), StringValueConverter.fromDocx4J(value.getDescr()), DrawingElementIdValueConverter.fromDocx4J(value.getId()), StringValueConverter.fromDocx4J(value.getName()), HyperlinkConverter.fromDocx4J(value.getHlinkClick()), HyperlinkConverter.fromDocx4J(value.getHlinkHover()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
