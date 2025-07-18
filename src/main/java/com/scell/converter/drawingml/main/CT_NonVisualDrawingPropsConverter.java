package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import org.docx4j.dml.CTNonVisualDrawingProps;

public class CT_NonVisualDrawingPropsConverter {
  private CT_NonVisualDrawingPropsConverter() {
  }

  public static CT_NonVisualDrawingPropsModel fromDocx4J(CTNonVisualDrawingProps value) {
    if (value == null) return null;
    return new CT_NonVisualDrawingPropsModel(BooleanConverter.fromDocx4J(value.getHidden()), StringConverter.fromDocx4J(value.getDescr()), ST_DrawingElementIdConverter.fromDocx4J(value.getId()), StringConverter.fromDocx4J(value.getName()), CT_HyperlinkConverter.fromDocx4J(value.getHlinkClick()), CT_HyperlinkConverter.fromDocx4J(value.getHlinkHover()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTNonVisualDrawingProps toDocx4J(CT_NonVisualDrawingPropsModel value) {
    return null;
  }
}
