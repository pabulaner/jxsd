package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.officeDocument.relationships.RelationshipIdValueConverter;
import jxsd.gen.model.drawingml.main.EmbeddedWAVAudioFileModel;
import org.docx4j.dml.CTEmbeddedWAVAudioFile;

/**
 * This is a generated sequence class.
 */
public class EmbeddedWAVAudioFileConverter {
  private EmbeddedWAVAudioFileConverter() {
  }

  public static EmbeddedWAVAudioFileModel fromDocx4j(CTEmbeddedWAVAudioFile value) {
    if (value == null) return null;
    return new EmbeddedWAVAudioFileModel(RelationshipIdValueConverter.fromDocx4j(value.getEmbed()), BooleanValueConverter.fromDocx4j(value.isBuiltIn()), StringValueConverter.fromDocx4j(value.getName()));
  }

  public static CTEmbeddedWAVAudioFile toDocx4j(EmbeddedWAVAudioFileModel value) {
    if (value == null) return null;
    CTEmbeddedWAVAudioFile result = new CTEmbeddedWAVAudioFile();
    result.setEmbed(RelationshipIdValueConverter.toDocx4j(value.getEmbed()));
    result.setBuiltIn(BooleanValueConverter.toDocx4j(value.getBuiltIn()));
    result.setName(StringValueConverter.toDocx4j(value.getName()));
    return result;
  }
}
