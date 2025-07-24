package com.scell.model.drawingml.main;

import com.scell.model.officeDocument.relationships.RelationshipIdModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class BlipModel {
  private final BlipCompressionModel cstate;

  private final RelationshipIdModel embed;

  private final RelationshipIdModel link;

  private final List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;

  private final OfficeArtExtensionListModel extLst;

  public BlipModel(BlipCompressionModel cstate, RelationshipIdModel embed, RelationshipIdModel link,
      List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor,
      OfficeArtExtensionListModel extLst) {
    this.cstate = cstate;
    this.embed = embed;
    this.link = link;
    this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
    this.extLst = extLst;
  }

  public BlipCompressionModel getCstate() {
    return this.cstate;
  }

  public RelationshipIdModel getEmbed() {
    return this.embed;
  }

  public RelationshipIdModel getLink() {
    return this.link;
  }

  public List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> getAlphaBiLevelOrAlphaCeilingOrAlphaFloor(
      ) {
    return this.alphaBiLevelOrAlphaCeilingOrAlphaFloor;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel {
    private final int type;

    private final Object value;

    public AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel() {
      this(-1, null);
    }

    private AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaBiLevel(
        AlphaBiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(0, value);
    }

    public boolean isAlphaBiLevel() {
      return this.type == 0;
    }

    public AlphaBiLevelEffectModel getAlphaBiLevel() {
      return (AlphaBiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaCeiling(
        AlphaCeilingEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(1, value);
    }

    public boolean isAlphaCeiling() {
      return this.type == 1;
    }

    public AlphaCeilingEffectModel getAlphaCeiling() {
      return (AlphaCeilingEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaFloor(
        AlphaFloorEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(2, value);
    }

    public boolean isAlphaFloor() {
      return this.type == 2;
    }

    public AlphaFloorEffectModel getAlphaFloor() {
      return (AlphaFloorEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaInv(
        AlphaInverseEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(3, value);
    }

    public boolean isAlphaInv() {
      return this.type == 3;
    }

    public AlphaInverseEffectModel getAlphaInv() {
      return (AlphaInverseEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaMod(
        AlphaModulateEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(4, value);
    }

    public boolean isAlphaMod() {
      return this.type == 4;
    }

    public AlphaModulateEffectModel getAlphaMod() {
      return (AlphaModulateEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaModFix(
        AlphaModulateFixedEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(5, value);
    }

    public boolean isAlphaModFix() {
      return this.type == 5;
    }

    public AlphaModulateFixedEffectModel getAlphaModFix() {
      return (AlphaModulateFixedEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newAlphaRepl(
        AlphaReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(6, value);
    }

    public boolean isAlphaRepl() {
      return this.type == 6;
    }

    public AlphaReplaceEffectModel getAlphaRepl() {
      return (AlphaReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newBiLevel(BiLevelEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(7, value);
    }

    public boolean isBiLevel() {
      return this.type == 7;
    }

    public BiLevelEffectModel getBiLevel() {
      return (BiLevelEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newBlur(BlurEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(8, value);
    }

    public boolean isBlur() {
      return this.type == 8;
    }

    public BlurEffectModel getBlur() {
      return (BlurEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newClrChange(
        ColorChangeEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(9, value);
    }

    public boolean isClrChange() {
      return this.type == 9;
    }

    public ColorChangeEffectModel getClrChange() {
      return (ColorChangeEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newClrRepl(
        ColorReplaceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(10, value);
    }

    public boolean isClrRepl() {
      return this.type == 10;
    }

    public ColorReplaceEffectModel getClrRepl() {
      return (ColorReplaceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newDuotone(DuotoneEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(11, value);
    }

    public boolean isDuotone() {
      return this.type == 11;
    }

    public DuotoneEffectModel getDuotone() {
      return (DuotoneEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newFillOverlay(
        FillOverlayEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(12, value);
    }

    public boolean isFillOverlay() {
      return this.type == 12;
    }

    public FillOverlayEffectModel getFillOverlay() {
      return (FillOverlayEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newGrayscl(
        GrayscaleEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(13, value);
    }

    public boolean isGrayscl() {
      return this.type == 13;
    }

    public GrayscaleEffectModel getGrayscl() {
      return (GrayscaleEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newHsl(HSLEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(14, value);
    }

    public boolean isHsl() {
      return this.type == 14;
    }

    public HSLEffectModel getHsl() {
      return (HSLEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newLum(LuminanceEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(15, value);
    }

    public boolean isLum() {
      return this.type == 15;
    }

    public LuminanceEffectModel getLum() {
      return (LuminanceEffectModel) this.value;
    }

    public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel newTint(TintEffectModel value) {
      return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(16, value);
    }

    public boolean isTint() {
      return this.type == 16;
    }

    public TintEffectModel getTint() {
      return (TintEffectModel) this.value;
    }
  }
}
