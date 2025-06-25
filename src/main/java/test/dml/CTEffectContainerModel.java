package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTEffectContainerModel.ContOrEffectOrAlphaBiLevelModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTEffectContainerModel.*;
import test.officeDocument.relationships.*;

public class CTEffectContainerModel
{
	
	public static class ContOrEffectOrAlphaBiLevelModel
	{
		
		private final CTEffectContainerModel cont;
		private final CTEffectReferenceModel effect;
		private final CTAlphaBiLevelEffectModel alphaBiLevel;
		private final CTAlphaCeilingEffectModel alphaCeiling;
		private final CTAlphaFloorEffectModel alphaFloor;
		private final CTAlphaInverseEffectModel alphaInv;
		private final CTAlphaModulateEffectModel alphaMod;
		private final CTAlphaModulateFixedEffectModel alphaModFix;
		private final CTAlphaOutsetEffectModel alphaOutset;
		private final CTAlphaReplaceEffectModel alphaRepl;
		private final CTBiLevelEffectModel biLevel;
		private final CTBlendEffectModel blend;
		private final CTBlurEffectModel blur;
		private final CTColorChangeEffectModel clrChange;
		private final CTColorReplaceEffectModel clrRepl;
		private final CTDuotoneEffectModel duotone;
		private final CTFillEffectModel fill;
		private final CTFillOverlayEffectModel fillOverlay;
		private final CTGlowEffectModel glow;
		private final CTGrayscaleEffectModel grayscl;
		private final CTHSLEffectModel hsl;
		private final CTInnerShadowEffectModel innerShdw;
		private final CTLuminanceEffectModel lum;
		private final CTOuterShadowEffectModel outerShdw;
		private final CTPresetShadowEffectModel prstShdw;
		private final CTReflectionEffectModel reflection;
		private final CTRelativeOffsetEffectModel relOff;
		private final CTSoftEdgesEffectModel softEdge;
		private final CTTintEffectModel tint;
		private final CTTransformEffectModel xfrm;
		
		public ContOrEffectOrAlphaBiLevelModel(CTEffectContainerModel cont, CTEffectReferenceModel effect, CTAlphaBiLevelEffectModel alphaBiLevel, CTAlphaCeilingEffectModel alphaCeiling, CTAlphaFloorEffectModel alphaFloor, CTAlphaInverseEffectModel alphaInv, CTAlphaModulateEffectModel alphaMod, CTAlphaModulateFixedEffectModel alphaModFix, CTAlphaOutsetEffectModel alphaOutset, CTAlphaReplaceEffectModel alphaRepl, CTBiLevelEffectModel biLevel, CTBlendEffectModel blend, CTBlurEffectModel blur, CTColorChangeEffectModel clrChange, CTColorReplaceEffectModel clrRepl, CTDuotoneEffectModel duotone, CTFillEffectModel fill, CTFillOverlayEffectModel fillOverlay, CTGlowEffectModel glow, CTGrayscaleEffectModel grayscl, CTHSLEffectModel hsl, CTInnerShadowEffectModel innerShdw, CTLuminanceEffectModel lum, CTOuterShadowEffectModel outerShdw, CTPresetShadowEffectModel prstShdw, CTReflectionEffectModel reflection, CTRelativeOffsetEffectModel relOff, CTSoftEdgesEffectModel softEdge, CTTintEffectModel tint, CTTransformEffectModel xfrm) {
			this.cont = cont;
			this.effect = effect;
			this.alphaBiLevel = alphaBiLevel;
			this.alphaCeiling = alphaCeiling;
			this.alphaFloor = alphaFloor;
			this.alphaInv = alphaInv;
			this.alphaMod = alphaMod;
			this.alphaModFix = alphaModFix;
			this.alphaOutset = alphaOutset;
			this.alphaRepl = alphaRepl;
			this.biLevel = biLevel;
			this.blend = blend;
			this.blur = blur;
			this.clrChange = clrChange;
			this.clrRepl = clrRepl;
			this.duotone = duotone;
			this.fill = fill;
			this.fillOverlay = fillOverlay;
			this.glow = glow;
			this.grayscl = grayscl;
			this.hsl = hsl;
			this.innerShdw = innerShdw;
			this.lum = lum;
			this.outerShdw = outerShdw;
			this.prstShdw = prstShdw;
			this.reflection = reflection;
			this.relOff = relOff;
			this.softEdge = softEdge;
			this.tint = tint;
			this.xfrm = xfrm;
		}
		
		public CTEffectContainerModel getCont() {
			return this.cont;
		}
		public CTEffectReferenceModel getEffect() {
			return this.effect;
		}
		public CTAlphaBiLevelEffectModel getAlphaBiLevel() {
			return this.alphaBiLevel;
		}
		public CTAlphaCeilingEffectModel getAlphaCeiling() {
			return this.alphaCeiling;
		}
		public CTAlphaFloorEffectModel getAlphaFloor() {
			return this.alphaFloor;
		}
		public CTAlphaInverseEffectModel getAlphaInv() {
			return this.alphaInv;
		}
		public CTAlphaModulateEffectModel getAlphaMod() {
			return this.alphaMod;
		}
		public CTAlphaModulateFixedEffectModel getAlphaModFix() {
			return this.alphaModFix;
		}
		public CTAlphaOutsetEffectModel getAlphaOutset() {
			return this.alphaOutset;
		}
		public CTAlphaReplaceEffectModel getAlphaRepl() {
			return this.alphaRepl;
		}
		public CTBiLevelEffectModel getBiLevel() {
			return this.biLevel;
		}
		public CTBlendEffectModel getBlend() {
			return this.blend;
		}
		public CTBlurEffectModel getBlur() {
			return this.blur;
		}
		public CTColorChangeEffectModel getClrChange() {
			return this.clrChange;
		}
		public CTColorReplaceEffectModel getClrRepl() {
			return this.clrRepl;
		}
		public CTDuotoneEffectModel getDuotone() {
			return this.duotone;
		}
		public CTFillEffectModel getFill() {
			return this.fill;
		}
		public CTFillOverlayEffectModel getFillOverlay() {
			return this.fillOverlay;
		}
		public CTGlowEffectModel getGlow() {
			return this.glow;
		}
		public CTGrayscaleEffectModel getGrayscl() {
			return this.grayscl;
		}
		public CTHSLEffectModel getHsl() {
			return this.hsl;
		}
		public CTInnerShadowEffectModel getInnerShdw() {
			return this.innerShdw;
		}
		public CTLuminanceEffectModel getLum() {
			return this.lum;
		}
		public CTOuterShadowEffectModel getOuterShdw() {
			return this.outerShdw;
		}
		public CTPresetShadowEffectModel getPrstShdw() {
			return this.prstShdw;
		}
		public CTReflectionEffectModel getReflection() {
			return this.reflection;
		}
		public CTRelativeOffsetEffectModel getRelOff() {
			return this.relOff;
		}
		public CTSoftEdgesEffectModel getSoftEdge() {
			return this.softEdge;
		}
		public CTTintEffectModel getTint() {
			return this.tint;
		}
		public CTTransformEffectModel getXfrm() {
			return this.xfrm;
		}
	}
	private final STEffectContainerTypeModel type;
	private final TokenModel name;
	private final List<ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel;
	
	public CTEffectContainerModel(STEffectContainerTypeModel type, TokenModel name, List<ContOrEffectOrAlphaBiLevelModel> contOrEffectOrAlphaBiLevel) {
		this.type = type;
		this.name = name;
		this.contOrEffectOrAlphaBiLevel = contOrEffectOrAlphaBiLevel;
	}
	
	public STEffectContainerTypeModel getType() {
		return this.type;
	}
	public TokenModel getName() {
		return this.name;
	}
	public List<ContOrEffectOrAlphaBiLevelModel> getContOrEffectOrAlphaBiLevel() {
		return this.contOrEffectOrAlphaBiLevel;
	}
}
