package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetPatternValModel;
import org.docx4j.dml.STPresetPatternVal;

public class PresetPatternValConverter {
  private PresetPatternValConverter() {
  }

  public static PresetPatternValModel fromDocx4J(STPresetPatternVal value) {
    if (value == null) return null;
    if (value == STPresetPatternVal.PCT_5) return PresetPatternValModel.PCT_5;
    if (value == STPresetPatternVal.PCT_10) return PresetPatternValModel.PCT_10;
    if (value == STPresetPatternVal.PCT_20) return PresetPatternValModel.PCT_20;
    if (value == STPresetPatternVal.PCT_25) return PresetPatternValModel.PCT_25;
    if (value == STPresetPatternVal.PCT_30) return PresetPatternValModel.PCT_30;
    if (value == STPresetPatternVal.PCT_40) return PresetPatternValModel.PCT_40;
    if (value == STPresetPatternVal.PCT_50) return PresetPatternValModel.PCT_50;
    if (value == STPresetPatternVal.PCT_60) return PresetPatternValModel.PCT_60;
    if (value == STPresetPatternVal.PCT_70) return PresetPatternValModel.PCT_70;
    if (value == STPresetPatternVal.PCT_75) return PresetPatternValModel.PCT_75;
    if (value == STPresetPatternVal.PCT_80) return PresetPatternValModel.PCT_80;
    if (value == STPresetPatternVal.PCT_90) return PresetPatternValModel.PCT_90;
    if (value == STPresetPatternVal.HORZ) return PresetPatternValModel.HORZ;
    if (value == STPresetPatternVal.VERT) return PresetPatternValModel.VERT;
    if (value == STPresetPatternVal.LT_HORZ) return PresetPatternValModel.LT_HORZ;
    if (value == STPresetPatternVal.LT_VERT) return PresetPatternValModel.LT_VERT;
    if (value == STPresetPatternVal.DK_HORZ) return PresetPatternValModel.DK_HORZ;
    if (value == STPresetPatternVal.DK_VERT) return PresetPatternValModel.DK_VERT;
    if (value == STPresetPatternVal.NAR_HORZ) return PresetPatternValModel.NAR_HORZ;
    if (value == STPresetPatternVal.NAR_VERT) return PresetPatternValModel.NAR_VERT;
    if (value == STPresetPatternVal.DASH_HORZ) return PresetPatternValModel.DASH_HORZ;
    if (value == STPresetPatternVal.DASH_VERT) return PresetPatternValModel.DASH_VERT;
    if (value == STPresetPatternVal.CROSS) return PresetPatternValModel.CROSS;
    if (value == STPresetPatternVal.DN_DIAG) return PresetPatternValModel.DN_DIAG;
    if (value == STPresetPatternVal.UP_DIAG) return PresetPatternValModel.UP_DIAG;
    if (value == STPresetPatternVal.LT_DN_DIAG) return PresetPatternValModel.LT_DN_DIAG;
    if (value == STPresetPatternVal.LT_UP_DIAG) return PresetPatternValModel.LT_UP_DIAG;
    if (value == STPresetPatternVal.DK_DN_DIAG) return PresetPatternValModel.DK_DN_DIAG;
    if (value == STPresetPatternVal.DK_UP_DIAG) return PresetPatternValModel.DK_UP_DIAG;
    if (value == STPresetPatternVal.WD_DN_DIAG) return PresetPatternValModel.WD_DN_DIAG;
    if (value == STPresetPatternVal.WD_UP_DIAG) return PresetPatternValModel.WD_UP_DIAG;
    if (value == STPresetPatternVal.DASH_DN_DIAG) return PresetPatternValModel.DASH_DN_DIAG;
    if (value == STPresetPatternVal.DASH_UP_DIAG) return PresetPatternValModel.DASH_UP_DIAG;
    if (value == STPresetPatternVal.DIAG_CROSS) return PresetPatternValModel.DIAG_CROSS;
    if (value == STPresetPatternVal.SM_CHECK) return PresetPatternValModel.SM_CHECK;
    if (value == STPresetPatternVal.LG_CHECK) return PresetPatternValModel.LG_CHECK;
    if (value == STPresetPatternVal.SM_GRID) return PresetPatternValModel.SM_GRID;
    if (value == STPresetPatternVal.LG_GRID) return PresetPatternValModel.LG_GRID;
    if (value == STPresetPatternVal.DOT_GRID) return PresetPatternValModel.DOT_GRID;
    if (value == STPresetPatternVal.SM_CONFETTI) return PresetPatternValModel.SM_CONFETTI;
    if (value == STPresetPatternVal.LG_CONFETTI) return PresetPatternValModel.LG_CONFETTI;
    if (value == STPresetPatternVal.HORZ_BRICK) return PresetPatternValModel.HORZ_BRICK;
    if (value == STPresetPatternVal.DIAG_BRICK) return PresetPatternValModel.DIAG_BRICK;
    if (value == STPresetPatternVal.SOLID_DMND) return PresetPatternValModel.SOLID_DMND;
    if (value == STPresetPatternVal.OPEN_DMND) return PresetPatternValModel.OPEN_DMND;
    if (value == STPresetPatternVal.DOT_DMND) return PresetPatternValModel.DOT_DMND;
    if (value == STPresetPatternVal.PLAID) return PresetPatternValModel.PLAID;
    if (value == STPresetPatternVal.SPHERE) return PresetPatternValModel.SPHERE;
    if (value == STPresetPatternVal.WEAVE) return PresetPatternValModel.WEAVE;
    if (value == STPresetPatternVal.DIVOT) return PresetPatternValModel.DIVOT;
    if (value == STPresetPatternVal.SHINGLE) return PresetPatternValModel.SHINGLE;
    if (value == STPresetPatternVal.WAVE) return PresetPatternValModel.WAVE;
    if (value == STPresetPatternVal.TRELLIS) return PresetPatternValModel.TRELLIS;
    if (value == STPresetPatternVal.ZIG_ZAG) return PresetPatternValModel.ZIG_ZAG;
    return null;
  }
}
