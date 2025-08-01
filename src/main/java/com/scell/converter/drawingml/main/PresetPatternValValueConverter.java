package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetPatternValValueModel;
import org.docx4j.dml.STPresetPatternVal;

public class PresetPatternValValueConverter {
  private PresetPatternValValueConverter() {
  }

  public static PresetPatternValValueModel fromDocx4J(STPresetPatternVal value) {
    if (value == null) return null;
    if (value == STPresetPatternVal.PCT_5) return PresetPatternValValueModel.PCT_5;
    if (value == STPresetPatternVal.PCT_10) return PresetPatternValValueModel.PCT_10;
    if (value == STPresetPatternVal.PCT_20) return PresetPatternValValueModel.PCT_20;
    if (value == STPresetPatternVal.PCT_25) return PresetPatternValValueModel.PCT_25;
    if (value == STPresetPatternVal.PCT_30) return PresetPatternValValueModel.PCT_30;
    if (value == STPresetPatternVal.PCT_40) return PresetPatternValValueModel.PCT_40;
    if (value == STPresetPatternVal.PCT_50) return PresetPatternValValueModel.PCT_50;
    if (value == STPresetPatternVal.PCT_60) return PresetPatternValValueModel.PCT_60;
    if (value == STPresetPatternVal.PCT_70) return PresetPatternValValueModel.PCT_70;
    if (value == STPresetPatternVal.PCT_75) return PresetPatternValValueModel.PCT_75;
    if (value == STPresetPatternVal.PCT_80) return PresetPatternValValueModel.PCT_80;
    if (value == STPresetPatternVal.PCT_90) return PresetPatternValValueModel.PCT_90;
    if (value == STPresetPatternVal.HORZ) return PresetPatternValValueModel.HORZ;
    if (value == STPresetPatternVal.VERT) return PresetPatternValValueModel.VERT;
    if (value == STPresetPatternVal.LT_HORZ) return PresetPatternValValueModel.LT_HORZ;
    if (value == STPresetPatternVal.LT_VERT) return PresetPatternValValueModel.LT_VERT;
    if (value == STPresetPatternVal.DK_HORZ) return PresetPatternValValueModel.DK_HORZ;
    if (value == STPresetPatternVal.DK_VERT) return PresetPatternValValueModel.DK_VERT;
    if (value == STPresetPatternVal.NAR_HORZ) return PresetPatternValValueModel.NAR_HORZ;
    if (value == STPresetPatternVal.NAR_VERT) return PresetPatternValValueModel.NAR_VERT;
    if (value == STPresetPatternVal.DASH_HORZ) return PresetPatternValValueModel.DASH_HORZ;
    if (value == STPresetPatternVal.DASH_VERT) return PresetPatternValValueModel.DASH_VERT;
    if (value == STPresetPatternVal.CROSS) return PresetPatternValValueModel.CROSS;
    if (value == STPresetPatternVal.DN_DIAG) return PresetPatternValValueModel.DN_DIAG;
    if (value == STPresetPatternVal.UP_DIAG) return PresetPatternValValueModel.UP_DIAG;
    if (value == STPresetPatternVal.LT_DN_DIAG) return PresetPatternValValueModel.LT_DN_DIAG;
    if (value == STPresetPatternVal.LT_UP_DIAG) return PresetPatternValValueModel.LT_UP_DIAG;
    if (value == STPresetPatternVal.DK_DN_DIAG) return PresetPatternValValueModel.DK_DN_DIAG;
    if (value == STPresetPatternVal.DK_UP_DIAG) return PresetPatternValValueModel.DK_UP_DIAG;
    if (value == STPresetPatternVal.WD_DN_DIAG) return PresetPatternValValueModel.WD_DN_DIAG;
    if (value == STPresetPatternVal.WD_UP_DIAG) return PresetPatternValValueModel.WD_UP_DIAG;
    if (value == STPresetPatternVal.DASH_DN_DIAG) return PresetPatternValValueModel.DASH_DN_DIAG;
    if (value == STPresetPatternVal.DASH_UP_DIAG) return PresetPatternValValueModel.DASH_UP_DIAG;
    if (value == STPresetPatternVal.DIAG_CROSS) return PresetPatternValValueModel.DIAG_CROSS;
    if (value == STPresetPatternVal.SM_CHECK) return PresetPatternValValueModel.SM_CHECK;
    if (value == STPresetPatternVal.LG_CHECK) return PresetPatternValValueModel.LG_CHECK;
    if (value == STPresetPatternVal.SM_GRID) return PresetPatternValValueModel.SM_GRID;
    if (value == STPresetPatternVal.LG_GRID) return PresetPatternValValueModel.LG_GRID;
    if (value == STPresetPatternVal.DOT_GRID) return PresetPatternValValueModel.DOT_GRID;
    if (value == STPresetPatternVal.SM_CONFETTI) return PresetPatternValValueModel.SM_CONFETTI;
    if (value == STPresetPatternVal.LG_CONFETTI) return PresetPatternValValueModel.LG_CONFETTI;
    if (value == STPresetPatternVal.HORZ_BRICK) return PresetPatternValValueModel.HORZ_BRICK;
    if (value == STPresetPatternVal.DIAG_BRICK) return PresetPatternValValueModel.DIAG_BRICK;
    if (value == STPresetPatternVal.SOLID_DMND) return PresetPatternValValueModel.SOLID_DMND;
    if (value == STPresetPatternVal.OPEN_DMND) return PresetPatternValValueModel.OPEN_DMND;
    if (value == STPresetPatternVal.DOT_DMND) return PresetPatternValValueModel.DOT_DMND;
    if (value == STPresetPatternVal.PLAID) return PresetPatternValValueModel.PLAID;
    if (value == STPresetPatternVal.SPHERE) return PresetPatternValValueModel.SPHERE;
    if (value == STPresetPatternVal.WEAVE) return PresetPatternValValueModel.WEAVE;
    if (value == STPresetPatternVal.DIVOT) return PresetPatternValValueModel.DIVOT;
    if (value == STPresetPatternVal.SHINGLE) return PresetPatternValValueModel.SHINGLE;
    if (value == STPresetPatternVal.WAVE) return PresetPatternValValueModel.WAVE;
    if (value == STPresetPatternVal.TRELLIS) return PresetPatternValValueModel.TRELLIS;
    if (value == STPresetPatternVal.ZIG_ZAG) return PresetPatternValValueModel.ZIG_ZAG;
    return null;
  }
}
