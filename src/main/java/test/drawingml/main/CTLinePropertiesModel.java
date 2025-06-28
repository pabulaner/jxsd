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
import test.drawingml.main.CTLinePropertiesModel.RoundOrBevelOrMiterModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTLinePropertiesModel.PrstDashOrCustDashModel.*;
import test.XMLSchema.*;
import test.drawingml.main.CTLinePropertiesModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTLinePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTLinePropertiesModel
{
	
	// CHOICE MODEL
	public static class NoFillOrSolidFillOrGradFillModel
	{
		
		private final int type;
		
		private final Object value;
		
		public NoFillOrSolidFillOrGradFillModel() {
			this(-1, null);
		}
		
		private NoFillOrSolidFillOrGradFillModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static NoFillOrSolidFillOrGradFillModel createNoFill(CTNoFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(0, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createSolidFill(CTSolidColorFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(1, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createGradFill(CTGradientFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(2, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createPattFill(CTPatternFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(3, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isNoFill() {
			return this.type == 0;
		}
		
		public CTNoFillPropertiesModel getNoFill() {
			if (this.type != 0) throw new ClassCastException();
			return (CTNoFillPropertiesModel) value;
		}
		public boolean isSolidFill() {
			return this.type == 1;
		}
		
		public CTSolidColorFillPropertiesModel getSolidFill() {
			if (this.type != 1) throw new ClassCastException();
			return (CTSolidColorFillPropertiesModel) value;
		}
		public boolean isGradFill() {
			return this.type == 2;
		}
		
		public CTGradientFillPropertiesModel getGradFill() {
			if (this.type != 2) throw new ClassCastException();
			return (CTGradientFillPropertiesModel) value;
		}
		public boolean isPattFill() {
			return this.type == 3;
		}
		
		public CTPatternFillPropertiesModel getPattFill() {
			if (this.type != 3) throw new ClassCastException();
			return (CTPatternFillPropertiesModel) value;
		}
	}
	// CHOICE MODEL
	public static class PrstDashOrCustDashModel
	{
		
		private final int type;
		
		private final Object value;
		
		public PrstDashOrCustDashModel() {
			this(-1, null);
		}
		
		private PrstDashOrCustDashModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static PrstDashOrCustDashModel createPrstDash(CTPresetLineDashPropertiesModel value) {
			return new PrstDashOrCustDashModel(0, value);
		}
		public static PrstDashOrCustDashModel createCustDash(CTDashStopListModel value) {
			return new PrstDashOrCustDashModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isPrstDash() {
			return this.type == 0;
		}
		
		public CTPresetLineDashPropertiesModel getPrstDash() {
			if (this.type != 0) throw new ClassCastException();
			return (CTPresetLineDashPropertiesModel) value;
		}
		public boolean isCustDash() {
			return this.type == 1;
		}
		
		public CTDashStopListModel getCustDash() {
			if (this.type != 1) throw new ClassCastException();
			return (CTDashStopListModel) value;
		}
	}
	// CHOICE MODEL
	public static class RoundOrBevelOrMiterModel
	{
		
		private final int type;
		
		private final Object value;
		
		public RoundOrBevelOrMiterModel() {
			this(-1, null);
		}
		
		private RoundOrBevelOrMiterModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static RoundOrBevelOrMiterModel createRound(CTLineJoinRoundModel value) {
			return new RoundOrBevelOrMiterModel(0, value);
		}
		public static RoundOrBevelOrMiterModel createBevel(CTLineJoinBevelModel value) {
			return new RoundOrBevelOrMiterModel(1, value);
		}
		public static RoundOrBevelOrMiterModel createMiter(CTLineJoinMiterPropertiesModel value) {
			return new RoundOrBevelOrMiterModel(2, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isRound() {
			return this.type == 0;
		}
		
		public CTLineJoinRoundModel getRound() {
			if (this.type != 0) throw new ClassCastException();
			return (CTLineJoinRoundModel) value;
		}
		public boolean isBevel() {
			return this.type == 1;
		}
		
		public CTLineJoinBevelModel getBevel() {
			if (this.type != 1) throw new ClassCastException();
			return (CTLineJoinBevelModel) value;
		}
		public boolean isMiter() {
			return this.type == 2;
		}
		
		public CTLineJoinMiterPropertiesModel getMiter() {
			if (this.type != 2) throw new ClassCastException();
			return (CTLineJoinMiterPropertiesModel) value;
		}
	}
	private final STLineWidthModel w;
	private final STLineCapModel cap;
	private final STCompoundLineModel cmpd;
	private final STPenAlignmentModel algn;
	private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;
	private final PrstDashOrCustDashModel prstDashOrCustDash;
	private final RoundOrBevelOrMiterModel roundOrBevelOrMiter;
	private final CTLineEndPropertiesModel headEnd;
	private final CTLineEndPropertiesModel tailEnd;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTLinePropertiesModel(STLineWidthModel w, STLineCapModel cap, STCompoundLineModel cmpd, STPenAlignmentModel algn, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill, PrstDashOrCustDashModel prstDashOrCustDash, RoundOrBevelOrMiterModel roundOrBevelOrMiter, CTLineEndPropertiesModel headEnd, CTLineEndPropertiesModel tailEnd, CTOfficeArtExtensionListModel extLst) {
		this.w = w;
		this.cap = cap;
		this.cmpd = cmpd;
		this.algn = algn;
		this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
		this.prstDashOrCustDash = prstDashOrCustDash;
		this.roundOrBevelOrMiter = roundOrBevelOrMiter;
		this.headEnd = headEnd;
		this.tailEnd = tailEnd;
		this.extLst = extLst;
	}
	
	public STLineWidthModel getW() {
		return this.w;
	}
	public STLineCapModel getCap() {
		return this.cap;
	}
	public STCompoundLineModel getCmpd() {
		return this.cmpd;
	}
	public STPenAlignmentModel getAlgn() {
		return this.algn;
	}
	public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
		return this.noFillOrSolidFillOrGradFill;
	}
	public PrstDashOrCustDashModel getPrstDashOrCustDash() {
		return this.prstDashOrCustDash;
	}
	public RoundOrBevelOrMiterModel getRoundOrBevelOrMiter() {
		return this.roundOrBevelOrMiter;
	}
	public CTLineEndPropertiesModel getHeadEnd() {
		return this.headEnd;
	}
	public CTLineEndPropertiesModel getTailEnd() {
		return this.tailEnd;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
