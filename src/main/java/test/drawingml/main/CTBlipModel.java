package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTBlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTBlipModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBlipModel
{
	
	// CHOICE MODEL
	public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel
	{
		
		private final int type;
		
		private final Object value;
		
		public AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel() {
			this(-1, null);
		}
		
		private AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaBiLevel(CTAlphaBiLevelEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(0, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaCeiling(CTAlphaCeilingEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(1, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaFloor(CTAlphaFloorEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(2, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaInv(CTAlphaInverseEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(3, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaMod(CTAlphaModulateEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(4, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaModFix(CTAlphaModulateFixedEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(5, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createAlphaRepl(CTAlphaReplaceEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(6, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createBiLevel(CTBiLevelEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(7, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createBlur(CTBlurEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(8, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createClrChange(CTColorChangeEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(9, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createClrRepl(CTColorReplaceEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(10, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createDuotone(CTDuotoneEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(11, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createFillOverlay(CTFillOverlayEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(12, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createGrayscl(CTGrayscaleEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(13, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createHsl(CTHSLEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(14, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createLum(CTLuminanceEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(15, value);
		}
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel createTint(CTTintEffectModel value) {
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(16, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isAlphaBiLevel() {
			return this.type == 0;
		}
		
		public CTAlphaBiLevelEffectModel getAlphaBiLevel() {
			if (this.type != 0) throw new ClassCastException();
			return (CTAlphaBiLevelEffectModel) value;
		}
		public boolean isAlphaCeiling() {
			return this.type == 1;
		}
		
		public CTAlphaCeilingEffectModel getAlphaCeiling() {
			if (this.type != 1) throw new ClassCastException();
			return (CTAlphaCeilingEffectModel) value;
		}
		public boolean isAlphaFloor() {
			return this.type == 2;
		}
		
		public CTAlphaFloorEffectModel getAlphaFloor() {
			if (this.type != 2) throw new ClassCastException();
			return (CTAlphaFloorEffectModel) value;
		}
		public boolean isAlphaInv() {
			return this.type == 3;
		}
		
		public CTAlphaInverseEffectModel getAlphaInv() {
			if (this.type != 3) throw new ClassCastException();
			return (CTAlphaInverseEffectModel) value;
		}
		public boolean isAlphaMod() {
			return this.type == 4;
		}
		
		public CTAlphaModulateEffectModel getAlphaMod() {
			if (this.type != 4) throw new ClassCastException();
			return (CTAlphaModulateEffectModel) value;
		}
		public boolean isAlphaModFix() {
			return this.type == 5;
		}
		
		public CTAlphaModulateFixedEffectModel getAlphaModFix() {
			if (this.type != 5) throw new ClassCastException();
			return (CTAlphaModulateFixedEffectModel) value;
		}
		public boolean isAlphaRepl() {
			return this.type == 6;
		}
		
		public CTAlphaReplaceEffectModel getAlphaRepl() {
			if (this.type != 6) throw new ClassCastException();
			return (CTAlphaReplaceEffectModel) value;
		}
		public boolean isBiLevel() {
			return this.type == 7;
		}
		
		public CTBiLevelEffectModel getBiLevel() {
			if (this.type != 7) throw new ClassCastException();
			return (CTBiLevelEffectModel) value;
		}
		public boolean isBlur() {
			return this.type == 8;
		}
		
		public CTBlurEffectModel getBlur() {
			if (this.type != 8) throw new ClassCastException();
			return (CTBlurEffectModel) value;
		}
		public boolean isClrChange() {
			return this.type == 9;
		}
		
		public CTColorChangeEffectModel getClrChange() {
			if (this.type != 9) throw new ClassCastException();
			return (CTColorChangeEffectModel) value;
		}
		public boolean isClrRepl() {
			return this.type == 10;
		}
		
		public CTColorReplaceEffectModel getClrRepl() {
			if (this.type != 10) throw new ClassCastException();
			return (CTColorReplaceEffectModel) value;
		}
		public boolean isDuotone() {
			return this.type == 11;
		}
		
		public CTDuotoneEffectModel getDuotone() {
			if (this.type != 11) throw new ClassCastException();
			return (CTDuotoneEffectModel) value;
		}
		public boolean isFillOverlay() {
			return this.type == 12;
		}
		
		public CTFillOverlayEffectModel getFillOverlay() {
			if (this.type != 12) throw new ClassCastException();
			return (CTFillOverlayEffectModel) value;
		}
		public boolean isGrayscl() {
			return this.type == 13;
		}
		
		public CTGrayscaleEffectModel getGrayscl() {
			if (this.type != 13) throw new ClassCastException();
			return (CTGrayscaleEffectModel) value;
		}
		public boolean isHsl() {
			return this.type == 14;
		}
		
		public CTHSLEffectModel getHsl() {
			if (this.type != 14) throw new ClassCastException();
			return (CTHSLEffectModel) value;
		}
		public boolean isLum() {
			return this.type == 15;
		}
		
		public CTLuminanceEffectModel getLum() {
			if (this.type != 15) throw new ClassCastException();
			return (CTLuminanceEffectModel) value;
		}
		public boolean isTint() {
			return this.type == 16;
		}
		
		public CTTintEffectModel getTint() {
			if (this.type != 16) throw new ClassCastException();
			return (CTTintEffectModel) value;
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
