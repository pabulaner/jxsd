package com.scell.model.drawingml.main;

import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class BlipModel {
  private final BlipCompressionValueModel cstate;

  private final RelationshipIdValueModel embed;

  private final RelationshipIdValueModel link;

  private final List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private final OfficeArtExtensionListModel extLst;

  public BlipModel(BlipCompressionValueModel cstate, RelationshipIdValueModel embed,
      RelationshipIdValueModel link,
      List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor,
      OfficeArtExtensionListModel extLst) {
    this.cstate = cstate;
    this.embed = embed;
    this.link = link;
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    this.extLst = extLst;
  }

  public BlipCompressionValueModel getCstate() {
    return this.cstate;
  }

  public RelationshipIdValueModel getEmbed() {
    return this.embed;
  }

  public RelationshipIdValueModel getLink() {
    return this.link;
  }

  public List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel> getAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      ) {
    return this.alphaBiLevelOrAlphaCeilingOrAlphaFloor;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel {
    private final int type;

    private final Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel() {
      this(-1, null);
    }

    private AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaBiLevel(
        AlphaBiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(0, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 0;
    }

    public AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (AlphaBiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaCeiling(
        AlphaCeilingEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(1, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 1;
    }

    public AlphaCeilingEffectModel getAlphaCeiling() {
      return (AlphaCeilingEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaFloor(
        AlphaFloorEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(2, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 2;
    }

    public AlphaFloorEffectModel getAlphaFloor() {
      return (AlphaFloorEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaInv(
        AlphaInverseEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(3, value);
    }

    public boolean isAlphaInv() {
      return this.type == 3;
    }

    public AlphaInverseEffectModel getAlphaInv() {
      return (AlphaInverseEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaMod(
        AlphaModulateEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(4, value);
    }

    public boolean isAlphaMod() {
      return this.type == 4;
    }

    public AlphaModulateEffectModel getAlphaMod() {
      return (AlphaModulateEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaModFix(
        AlphaModulateFixedEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(5, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 5;
    }

    public AlphaModulateFixedEffectModel getAlphaModFix() {
      return (AlphaModulateFixedEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newAlphaRepl(
        AlphaReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(6, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 6;
    }

    public AlphaReplaceEffectModel getAlphaRepl() {
      return (AlphaReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newBiLevel(
        BiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(7, value);
    }

    public boolean isBiLevel() {
      return this.type == 7;
    }

    public BiLevelEffectModel getBiLevel() {
      return (BiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newBlur(BlurEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(8, value);
    }

    public boolean isBlur() {
      return this.type == 8;
    }

    public BlurEffectModel getBlur() {
      return (BlurEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newClrChange(
        ColorChangeEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(9, value);
    }

    public boolean isClrChange() {
      return this.type == 9;
    }

    public ColorChangeEffectModel getClrChange() {
      return (ColorChangeEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newClrRepl(
        ColorReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(10, value);
    }

    public boolean isClrRepl() {
      return this.type == 10;
    }

    public ColorReplaceEffectModel getClrRepl() {
      return (ColorReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newDuotone(
        DuotoneEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(11, value);
    }

    public boolean isDuotone() {
      return this.type == 11;
    }

    public DuotoneEffectModel getDuotone() {
      return (DuotoneEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newFillOverlay(
        FillOverlayEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(12, value);
    }

    public boolean isFillOverlay() {
      return this.type == 12;
    }

    public FillOverlayEffectModel getFillOverlay() {
      return (FillOverlayEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newGrayscl(
        GrayscaleEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(13, value);
    }

    public boolean isGrayscl() {
      return this.type == 13;
    }

    public GrayscaleEffectModel getGrayscl() {
      return (GrayscaleEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newHsl(HSLEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(14, value);
    }

    public boolean isHsl() {
      return this.type == 14;
    }

    public HSLEffectModel getHsl() {
      return (HSLEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newLum(
        LuminanceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(15, value);
    }

    public boolean isLum() {
      return this.type == 15;
    }

    public LuminanceEffectModel getLum() {
      return (LuminanceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel newTint(TintEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel(16, value);
    }

    public boolean isTint() {
      return this.type == 16;
    }

    public TintEffectModel getTint() {
      return (TintEffectModel) this.value;
    }
  }
}
