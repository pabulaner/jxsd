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
import test.dml.CTBlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTBlipModel.*;
import test.officeDocument.relationships.*;

public class CTBlipModel
{
	
	public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel
	{
		
		private final CTAlphaBiLevelEffectModel alphaBiLevel;
		private final CTAlphaCeilingEffectModel alphaCeiling;
		private final CTAlphaFloorEffectModel alphaFloor;
		private final CTAlphaInverseEffectModel alphaInv;
		private final CTAlphaModulateEffectModel alphaMod;
		private final CTAlphaModulateFixedEffectModel alphaModFix;
		private final CTAlphaReplaceEffectModel alphaRepl;
		private final CTBiLevelEffectModel biLevel;
		private final CTBlurEffectModel blur;
		private final CTColorChangeEffectModel clrChange;
		private final CTColorReplaceEffectModel clrRepl;
		private final CTDuotoneEffectModel duotone;
		private final CTFillOverlayEffectModel fillOverlay;
		private final CTGrayscaleEffectModel grayscl;
		private final CTHSLEffectModel hsl;
		private final CTLuminanceEffectModel lum;
		private final CTTintEffectModel tint;
		
		public AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(CTAlphaBiLevelEffectModel alphaBiLevel, CTAlphaCeilingEffectModel alphaCeiling, CTAlphaFloorEffectModel alphaFloor, CTAlphaInverseEffectModel alphaInv, CTAlphaModulateEffectModel alphaMod, CTAlphaModulateFixedEffectModel alphaModFix, CTAlphaReplaceEffectModel alphaRepl, CTBiLevelEffectModel biLevel, CTBlurEffectModel blur, CTColorChangeEffectModel clrChange, CTColorReplaceEffectModel clrRepl, CTDuotoneEffectModel duotone, CTFillOverlayEffectModel fillOverlay, CTGrayscaleEffectModel grayscl, CTHSLEffectModel hsl, CTLuminanceEffectModel lum, CTTintEffectModel tint) {
			this.alphaBiLevel = alphaBiLevel;
			this.alphaCeiling = alphaCeiling;
			this.alphaFloor = alphaFloor;
			this.alphaInv = alphaInv;
			this.alphaMod = alphaMod;
			this.alphaModFix = alphaModFix;
			this.alphaRepl = alphaRepl;
			this.biLevel = biLevel;
			this.blur = blur;
			this.clrChange = clrChange;
			this.clrRepl = clrRepl;
			this.duotone = duotone;
			this.fillOverlay = fillOverlay;
			this.grayscl = grayscl;
			this.hsl = hsl;
			this.lum = lum;
			this.tint = tint;
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
		public CTAlphaReplaceEffectModel getAlphaRepl() {
			return this.alphaRepl;
		}
		public CTBiLevelEffectModel getBiLevel() {
			return this.biLevel;
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
		public CTFillOverlayEffectModel getFillOverlay() {
			return this.fillOverlay;
		}
		public CTGrayscaleEffectModel getGrayscl() {
			return this.grayscl;
		}
		public CTHSLEffectModel getHsl() {
			return this.hsl;
		}
		public CTLuminanceEffectModel getLum() {
			return this.lum;
		}
		public CTTintEffectModel getTint() {
			return this.tint;
		}
	}
	private final STBlipCompressionModel cstate;
	private final STRelationshipIdModel embed;
	private final STRelationshipIdModel link;
	private final List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTBlipModel(STBlipCompressionModel cstate, STRelationshipIdModel embed, STRelationshipIdModel link, List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor, CTOfficeArtExtensionListModel extLst) {
		this.cstate = cstate;
		this.embed = embed;
		this.link = link;
		this.alphaBiLevelOrAlphaCeilingOrAlphaFloor = alphaBiLevelOrAlphaCeilingOrAlphaFloor;
		this.extLst = extLst;
	}
	
	public STBlipCompressionModel getCstate() {
		return this.cstate;
	}
	public STRelationshipIdModel getEmbed() {
		return this.embed;
	}
	public STRelationshipIdModel getLink() {
		return this.link;
	}
	public List<AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> getAlphaBiLevelOrAlphaCeilingOrAlphaFloor() {
		return this.alphaBiLevelOrAlphaCeilingOrAlphaFloor;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
