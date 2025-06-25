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
import test.dml.CTLinePropertiesModel.PrstDashOrCustDashModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import test.dml.CTLinePropertiesModel.*;
import org.docx4j.dml.*;
import test.dml.CTLinePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTLinePropertiesModel.RoundOrBevelOrMiterModel.*;
import test.officeDocument.relationships.*;

public class CTLinePropertiesModel
{
	
	public static class NoFillOrSolidFillOrGradFillModel
	{
		
		private final CTNoFillPropertiesModel noFill;
		private final CTSolidColorFillPropertiesModel solidFill;
		private final CTGradientFillPropertiesModel gradFill;
		private final CTPatternFillPropertiesModel pattFill;
		
		public NoFillOrSolidFillOrGradFillModel(CTNoFillPropertiesModel noFill, CTSolidColorFillPropertiesModel solidFill, CTGradientFillPropertiesModel gradFill, CTPatternFillPropertiesModel pattFill) {
			this.noFill = noFill;
			this.solidFill = solidFill;
			this.gradFill = gradFill;
			this.pattFill = pattFill;
		}
		
		public CTNoFillPropertiesModel getNoFill() {
			return this.noFill;
		}
		public CTSolidColorFillPropertiesModel getSolidFill() {
			return this.solidFill;
		}
		public CTGradientFillPropertiesModel getGradFill() {
			return this.gradFill;
		}
		public CTPatternFillPropertiesModel getPattFill() {
			return this.pattFill;
		}
	}
	public static class PrstDashOrCustDashModel
	{
		
		private final CTPresetLineDashPropertiesModel prstDash;
		private final CTDashStopListModel custDash;
		
		public PrstDashOrCustDashModel(CTPresetLineDashPropertiesModel prstDash, CTDashStopListModel custDash) {
			this.prstDash = prstDash;
			this.custDash = custDash;
		}
		
		public CTPresetLineDashPropertiesModel getPrstDash() {
			return this.prstDash;
		}
		public CTDashStopListModel getCustDash() {
			return this.custDash;
		}
	}
	public static class RoundOrBevelOrMiterModel
	{
		
		private final CTLineJoinRoundModel round;
		private final CTLineJoinBevelModel bevel;
		private final CTLineJoinMiterPropertiesModel miter;
		
		public RoundOrBevelOrMiterModel(CTLineJoinRoundModel round, CTLineJoinBevelModel bevel, CTLineJoinMiterPropertiesModel miter) {
			this.round = round;
			this.bevel = bevel;
			this.miter = miter;
		}
		
		public CTLineJoinRoundModel getRound() {
			return this.round;
		}
		public CTLineJoinBevelModel getBevel() {
			return this.bevel;
		}
		public CTLineJoinMiterPropertiesModel getMiter() {
			return this.miter;
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
