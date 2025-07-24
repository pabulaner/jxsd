package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.officeDocument.relationships.RelationshipIdConverter;
import com.scell.model.drawingml.main.HyperlinkModel;
import org.docx4j.dml.CTHyperlink;

public class HyperlinkConverter {
  private HyperlinkConverter() {
  }

  public static HyperlinkModel fromDocx4J(CTHyperlink value) {
    if (value == null) return null;
    return new HyperlinkModel(StringConverter.fromDocx4J(value.getInvalidUrl()), StringConverter.fromDocx4J(value.getTgtFrame()), RelationshipIdConverter.fromDocx4J(value.getId()), BooleanConverter.fromDocx4J(value.isHistory()), StringConverter.fromDocx4J(value.getTooltip()), BooleanConverter.fromDocx4J(value.isHighlightClick()), StringConverter.fromDocx4J(value.getAction()), BooleanConverter.fromDocx4J(value.isEndSnd()), EmbeddedWAVAudioFileConverter.fromDocx4J(value.getSnd()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
