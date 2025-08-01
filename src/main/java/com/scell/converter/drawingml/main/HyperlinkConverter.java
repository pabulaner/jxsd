package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.officeDocument.relationships.RelationshipIdValueConverter;
import com.scell.model.drawingml.main.HyperlinkModel;
import org.docx4j.dml.CTHyperlink;

public class HyperlinkConverter {
  private HyperlinkConverter() {
  }

  public static HyperlinkModel fromDocx4J(CTHyperlink value) {
    if (value == null) return null;
    return new HyperlinkModel(StringValueConverter.fromDocx4J(value.getInvalidUrl()), StringValueConverter.fromDocx4J(value.getTgtFrame()), RelationshipIdValueConverter.fromDocx4J(value.getId()), BooleanValueConverter.fromDocx4J(value.isHistory()), StringValueConverter.fromDocx4J(value.getTooltip()), BooleanValueConverter.fromDocx4J(value.isHighlightClick()), StringValueConverter.fromDocx4J(value.getAction()), BooleanValueConverter.fromDocx4J(value.isEndSnd()), EmbeddedWAVAudioFileConverter.fromDocx4J(value.getSnd()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
