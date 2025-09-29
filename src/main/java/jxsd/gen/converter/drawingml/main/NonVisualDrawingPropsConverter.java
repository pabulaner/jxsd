package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import org.docx4j.dml.CTNonVisualDrawingProps;

/**
 * This is a generated sequence class.
 */
public class NonVisualDrawingPropsConverter {
  private NonVisualDrawingPropsConverter() {
  }

  public static NonVisualDrawingPropsModel fromDocx4j(CTNonVisualDrawingProps value) {
    if (value == null) return null;
    return new NonVisualDrawingPropsModel(BooleanValueConverter.fromDocx4j(value.getHidden()), StringValueConverter.fromDocx4j(value.getDescr()), DrawingElementIdValueConverter.fromDocx4j(value.getId()), StringValueConverter.fromDocx4j(value.getName()), HyperlinkConverter.fromDocx4j(value.getHlinkClick()), HyperlinkConverter.fromDocx4j(value.getHlinkHover()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualDrawingProps toDocx4j(NonVisualDrawingPropsModel value) {
    if (value == null) return null;
    CTNonVisualDrawingProps result = new CTNonVisualDrawingProps();
    result.setHidden(BooleanValueConverter.toDocx4j(value.getHidden()));
    result.setDescr(StringValueConverter.toDocx4j(value.getDescr()));
    result.setId(DrawingElementIdValueConverter.toDocx4j(value.getId()));
    result.setName(StringValueConverter.toDocx4j(value.getName()));
    result.setHlinkClick(HyperlinkConverter.toDocx4j(value.getHlinkClick()));
    result.setHlinkHover(HyperlinkConverter.toDocx4j(value.getHlinkHover()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
