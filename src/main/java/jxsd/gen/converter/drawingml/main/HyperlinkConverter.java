package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.officeDocument.relationships.RelationshipIdValueConverter;
import jxsd.gen.model.drawingml.main.HyperlinkModel;
import org.docx4j.dml.CTHyperlink;

/**
 * This is a generated sequence class.
 */
public class HyperlinkConverter {
  private HyperlinkConverter() {
  }

  public static HyperlinkModel fromDocx4j(CTHyperlink value) {
    if (value == null) return null;
    return new HyperlinkModel(StringValueConverter.fromDocx4j(value.getInvalidUrl()), StringValueConverter.fromDocx4j(value.getTgtFrame()), RelationshipIdValueConverter.fromDocx4j(value.getId()), BooleanValueConverter.fromDocx4j(value.isHistory()), StringValueConverter.fromDocx4j(value.getTooltip()), BooleanValueConverter.fromDocx4j(value.isHighlightClick()), StringValueConverter.fromDocx4j(value.getAction()), BooleanValueConverter.fromDocx4j(value.isEndSnd()), EmbeddedWAVAudioFileConverter.fromDocx4j(value.getSnd()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTHyperlink toDocx4j(HyperlinkModel value) {
    if (value == null) return null;
    CTHyperlink result = new CTHyperlink();
    result.setInvalidUrl(StringValueConverter.toDocx4j(value.getInvalidUrl()));
    result.setTgtFrame(StringValueConverter.toDocx4j(value.getTgtFrame()));
    result.setId(RelationshipIdValueConverter.toDocx4j(value.getId()));
    result.setHistory(BooleanValueConverter.toDocx4j(value.getHistory()));
    result.setTooltip(StringValueConverter.toDocx4j(value.getTooltip()));
    result.setHighlightClick(BooleanValueConverter.toDocx4j(value.getHighlightClick()));
    result.setAction(StringValueConverter.toDocx4j(value.getAction()));
    result.setEndSnd(BooleanValueConverter.toDocx4j(value.getEndSnd()));
    result.setSnd(EmbeddedWAVAudioFileConverter.toDocx4j(value.getSnd()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
