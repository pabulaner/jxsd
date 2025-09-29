package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.converter.officeDocument.relationships.RelationshipIdValueConverter;
import jxsd.gen.model.drawingml.main.BlipModel;
import org.docx4j.dml.CTAlphaBiLevelEffect;
import org.docx4j.dml.CTAlphaCeilingEffect;
import org.docx4j.dml.CTAlphaFloorEffect;
import org.docx4j.dml.CTAlphaInverseEffect;
import org.docx4j.dml.CTAlphaModulateEffect;
import org.docx4j.dml.CTAlphaModulateFixedEffect;
import org.docx4j.dml.CTAlphaReplaceEffect;
import org.docx4j.dml.CTBiLevelEffect;
import org.docx4j.dml.CTBlip;
import org.docx4j.dml.CTBlurEffect;
import org.docx4j.dml.CTColorChangeEffect;
import org.docx4j.dml.CTColorReplaceEffect;
import org.docx4j.dml.CTDuotoneEffect;
import org.docx4j.dml.CTFillOverlayEffect;
import org.docx4j.dml.CTGrayscaleEffect;
import org.docx4j.dml.CTHSLEffect;
import org.docx4j.dml.CTLuminanceEffect;
import org.docx4j.dml.CTTintEffect;

/**
 * This is a generated sequence class.
 */
public class BlipConverter {
  private BlipConverter() {
  }

  public static BlipModel fromDocx4j(CTBlip value) {
    if (value == null) return null;
    List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloor> alphaBiLevelOrAlphaCeilingOrAlphaFloor = value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(val -> {
      if (val instanceof CTAlphaBiLevelEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaBiLevel(AlphaBiLevelEffectConverter.fromDocx4j((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaCeiling(AlphaCeilingEffectConverter.fromDocx4j((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaFloor(AlphaFloorEffectConverter.fromDocx4j((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaInv(AlphaInverseEffectConverter.fromDocx4j((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaMod(AlphaModulateEffectConverter.fromDocx4j((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaModFix(AlphaModulateFixedEffectConverter.fromDocx4j((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newAlphaRepl(AlphaReplaceEffectConverter.fromDocx4j((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newBiLevel(BiLevelEffectConverter.fromDocx4j((CTBiLevelEffect) val));
      if (val instanceof CTBlurEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newBlur(BlurEffectConverter.fromDocx4j((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newClrChange(ColorChangeEffectConverter.fromDocx4j((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newClrRepl(ColorReplaceEffectConverter.fromDocx4j((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newDuotone(DuotoneEffectConverter.fromDocx4j((CTDuotoneEffect) val));
      if (val instanceof CTFillOverlayEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newFillOverlay(FillOverlayEffectConverter.fromDocx4j((CTFillOverlayEffect) val));
      if (val instanceof CTGrayscaleEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newGrayscl(GrayscaleEffectConverter.fromDocx4j((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newHsl(HSLEffectConverter.fromDocx4j((CTHSLEffect) val));
      if (val instanceof CTLuminanceEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newLum(LuminanceEffectConverter.fromDocx4j((CTLuminanceEffect) val));
      if (val instanceof CTTintEffect) return CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor.newTint(TintEffectConverter.fromDocx4j((CTTintEffect) val));
      return new BlipModel(BlipCompressionValueConverter.fromDocx4j(value.getCstate()), RelationshipIdValueConverter.fromDocx4j(value.getEmbed()), RelationshipIdValueConverter.fromDocx4j(value.getLink()), alphaBiLevelOrAlphaCeilingOrAlphaFloor, OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
    }

    public static CTBlip toDocx4j(BlipModel value) {
      if (value == null) return null;
      CTBlip result = new CTBlip();
      result.setCstate(BlipCompressionValueConverter.toDocx4j(value.getCstate()));
      result.setEmbed(RelationshipIdValueConverter.toDocx4j(value.getEmbed()));
      result.setLink(RelationshipIdValueConverter.toDocx4j(value.getLink()));
      result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
      result.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().addAll(value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(val -> {
        if (val.isAlphaBiLevel()) return BlipConverter.toDocx4j(val.getAlphaBiLevel());
        if (val.isAlphaCeiling()) return BlipConverter.toDocx4j(val.getAlphaCeiling());
        if (val.isAlphaFloor()) return BlipConverter.toDocx4j(val.getAlphaFloor());
        if (val.isAlphaInv()) return BlipConverter.toDocx4j(val.getAlphaInv());
        if (val.isAlphaMod()) return BlipConverter.toDocx4j(val.getAlphaMod());
        if (val.isAlphaModFix()) return BlipConverter.toDocx4j(val.getAlphaModFix());
        if (val.isAlphaRepl()) return BlipConverter.toDocx4j(val.getAlphaRepl());
        if (val.isBiLevel()) return BlipConverter.toDocx4j(val.getBiLevel());
        if (val.isBlur()) return BlipConverter.toDocx4j(val.getBlur());
        if (val.isClrChange()) return BlipConverter.toDocx4j(val.getClrChange());
        if (val.isClrRepl()) return BlipConverter.toDocx4j(val.getClrRepl());
        if (val.isDuotone()) return BlipConverter.toDocx4j(val.getDuotone());
        if (val.isFillOverlay()) return BlipConverter.toDocx4j(val.getFillOverlay());
        if (val.isGrayscl()) return BlipConverter.toDocx4j(val.getGrayscl());
        if (val.isHsl()) return BlipConverter.toDocx4j(val.getHsl());
        if (val.isLum()) return BlipConverter.toDocx4j(val.getLum());
        if (val.isTint()) return BlipConverter.toDocx4j(val.getTint());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
