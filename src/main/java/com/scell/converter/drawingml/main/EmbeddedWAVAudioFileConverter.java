package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.officeDocument.relationships.RelationshipIdValueConverter;
import com.scell.model.drawingml.main.EmbeddedWAVAudioFileModel;
import org.docx4j.dml.CTEmbeddedWAVAudioFile;

public class EmbeddedWAVAudioFileConverter {
  private EmbeddedWAVAudioFileConverter() {
  }

  public static EmbeddedWAVAudioFileModel fromDocx4J(CTEmbeddedWAVAudioFile value) {
    if (value == null) return null;
    return new EmbeddedWAVAudioFileModel(RelationshipIdValueConverter.fromDocx4J(value.getEmbed()), BooleanValueConverter.fromDocx4J(value.isBuiltIn()), StringValueConverter.fromDocx4J(value.getName()));
  }
}
