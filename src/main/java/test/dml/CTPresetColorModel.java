package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTPresetColorModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.dml.CTPresetColorModel.TintOrShadeOrCompModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPresetColorModel
{
	
	public static class TintOrShadeOrCompModel
	{
		
		private final CTPositiveFixedPercentageModel tint;
		private final CTPositiveFixedPercentageModel shade;
		private final CTComplementTransformModel comp;
		private final CTInverseTransformModel inv;
		private final CTGrayscaleTransformModel gray;
		private final CTPositiveFixedPercentageModel alpha;
		private final CTFixedPercentageModel alphaOff;
		private final CTPositivePercentageModel alphaMod;
		private final CTPositiveFixedAngleModel hue;
		private final CTAngleModel hueOff;
		private final CTPositivePercentageModel hueMod;
		private final CTPercentageModel sat;
		private final CTPercentageModel satOff;
		private final CTPercentageModel satMod;
		private final CTPercentageModel lum;
		private final CTPercentageModel lumOff;
		private final CTPercentageModel lumMod;
		private final CTPercentageModel red;
		private final CTPercentageModel redOff;
		private final CTPercentageModel redMod;
		private final CTPercentageModel green;
		private final CTPercentageModel greenOff;
		private final CTPercentageModel greenMod;
		private final CTPercentageModel blue;
		private final CTPercentageModel blueOff;
		private final CTPercentageModel blueMod;
		private final CTGammaTransformModel gamma;
		private final CTInverseGammaTransformModel invGamma;
		
		public TintOrShadeOrCompModel(CTPositiveFixedPercentageModel tint, CTPositiveFixedPercentageModel shade, CTComplementTransformModel comp, CTInverseTransformModel inv, CTGrayscaleTransformModel gray, CTPositiveFixedPercentageModel alpha, CTFixedPercentageModel alphaOff, CTPositivePercentageModel alphaMod, CTPositiveFixedAngleModel hue, CTAngleModel hueOff, CTPositivePercentageModel hueMod, CTPercentageModel sat, CTPercentageModel satOff, CTPercentageModel satMod, CTPercentageModel lum, CTPercentageModel lumOff, CTPercentageModel lumMod, CTPercentageModel red, CTPercentageModel redOff, CTPercentageModel redMod, CTPercentageModel green, CTPercentageModel greenOff, CTPercentageModel greenMod, CTPercentageModel blue, CTPercentageModel blueOff, CTPercentageModel blueMod, CTGammaTransformModel gamma, CTInverseGammaTransformModel invGamma) {
			this.tint = tint;
			this.shade = shade;
			this.comp = comp;
			this.inv = inv;
			this.gray = gray;
			this.alpha = alpha;
			this.alphaOff = alphaOff;
			this.alphaMod = alphaMod;
			this.hue = hue;
			this.hueOff = hueOff;
			this.hueMod = hueMod;
			this.sat = sat;
			this.satOff = satOff;
			this.satMod = satMod;
			this.lum = lum;
			this.lumOff = lumOff;
			this.lumMod = lumMod;
			this.red = red;
			this.redOff = redOff;
			this.redMod = redMod;
			this.green = green;
			this.greenOff = greenOff;
			this.greenMod = greenMod;
			this.blue = blue;
			this.blueOff = blueOff;
			this.blueMod = blueMod;
			this.gamma = gamma;
			this.invGamma = invGamma;
		}
		
		public CTPositiveFixedPercentageModel getTint() {
			return this.tint;
		}
		public CTPositiveFixedPercentageModel getShade() {
			return this.shade;
		}
		public CTComplementTransformModel getComp() {
			return this.comp;
		}
		public CTInverseTransformModel getInv() {
			return this.inv;
		}
		public CTGrayscaleTransformModel getGray() {
			return this.gray;
		}
		public CTPositiveFixedPercentageModel getAlpha() {
			return this.alpha;
		}
		public CTFixedPercentageModel getAlphaOff() {
			return this.alphaOff;
		}
		public CTPositivePercentageModel getAlphaMod() {
			return this.alphaMod;
		}
		public CTPositiveFixedAngleModel getHue() {
			return this.hue;
		}
		public CTAngleModel getHueOff() {
			return this.hueOff;
		}
		public CTPositivePercentageModel getHueMod() {
			return this.hueMod;
		}
		public CTPercentageModel getSat() {
			return this.sat;
		}
		public CTPercentageModel getSatOff() {
			return this.satOff;
		}
		public CTPercentageModel getSatMod() {
			return this.satMod;
		}
		public CTPercentageModel getLum() {
			return this.lum;
		}
		public CTPercentageModel getLumOff() {
			return this.lumOff;
		}
		public CTPercentageModel getLumMod() {
			return this.lumMod;
		}
		public CTPercentageModel getRed() {
			return this.red;
		}
		public CTPercentageModel getRedOff() {
			return this.redOff;
		}
		public CTPercentageModel getRedMod() {
			return this.redMod;
		}
		public CTPercentageModel getGreen() {
			return this.green;
		}
		public CTPercentageModel getGreenOff() {
			return this.greenOff;
		}
		public CTPercentageModel getGreenMod() {
			return this.greenMod;
		}
		public CTPercentageModel getBlue() {
			return this.blue;
		}
		public CTPercentageModel getBlueOff() {
			return this.blueOff;
		}
		public CTPercentageModel getBlueMod() {
			return this.blueMod;
		}
		public CTGammaTransformModel getGamma() {
			return this.gamma;
		}
		public CTInverseGammaTransformModel getInvGamma() {
			return this.invGamma;
		}
	}
	private final STPresetColorValModel val;
	private final List<TintOrShadeOrCompModel> tintOrShadeOrComp;
	
	public CTPresetColorModel(STPresetColorValModel val, List<TintOrShadeOrCompModel> tintOrShadeOrComp) {
		this.val = val;
		this.tintOrShadeOrComp = tintOrShadeOrComp;
	}
	
	public STPresetColorValModel getVal() {
		return this.val;
	}
	public List<TintOrShadeOrCompModel> getTintOrShadeOrComp() {
		return this.tintOrShadeOrComp;
	}
}
