package test.dml.chart;

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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTCatAxModel.CrossesOrCrossesAtModel.*;
import test.dml.chart.CTCatAxModel.*;
import test.officeDocument.relationships.*;

public class CTCatAxModel
{
	
	public static class CrossesOrCrossesAtModel
	{
		
		private final CTCrossesModel crosses;
		private final CTDoubleModel crossesAt;
		
		public CrossesOrCrossesAtModel(CTCrossesModel crosses, CTDoubleModel crossesAt) {
			this.crosses = crosses;
			this.crossesAt = crossesAt;
		}
		
		public CTCrossesModel getCrosses() {
			return this.crosses;
		}
		public CTDoubleModel getCrossesAt() {
			return this.crossesAt;
		}
	}
	private final CTUnsignedIntModel axId;
	private final CTScalingModel scaling;
	private final CTBooleanModel delete;
	private final CTAxPosModel axPos;
	private final CTChartLinesModel majorGridlines;
	private final CTChartLinesModel minorGridlines;
	private final CTTitleModel title;
	private final CTNumFmtModel numFmt;
	private final CTTickMarkModel majorTickMark;
	private final CTTickMarkModel minorTickMark;
	private final CTTickLblPosModel tickLblPos;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	private final CTUnsignedIntModel crossAx;
	private final CrossesOrCrossesAtModel crossesOrCrossesAt;
	private final CTBooleanModel auto;
	private final CTLblAlgnModel lblAlgn;
	private final CTLblOffsetModel lblOffset;
	private final CTSkipModel tickLblSkip;
	private final CTSkipModel tickMarkSkip;
	private final CTBooleanModel noMultiLvlLbl;
	private final CTExtensionListModel extLst;
	
	public CTCatAxModel(CTUnsignedIntModel axId, CTScalingModel scaling, CTBooleanModel delete, CTAxPosModel axPos, CTChartLinesModel majorGridlines, CTChartLinesModel minorGridlines, CTTitleModel title, CTNumFmtModel numFmt, CTTickMarkModel majorTickMark, CTTickMarkModel minorTickMark, CTTickLblPosModel tickLblPos, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTUnsignedIntModel crossAx, CrossesOrCrossesAtModel crossesOrCrossesAt, CTBooleanModel auto, CTLblAlgnModel lblAlgn, CTLblOffsetModel lblOffset, CTSkipModel tickLblSkip, CTSkipModel tickMarkSkip, CTBooleanModel noMultiLvlLbl, CTExtensionListModel extLst) {
		this.axId = axId;
		this.scaling = scaling;
		this.delete = delete;
		this.axPos = axPos;
		this.majorGridlines = majorGridlines;
		this.minorGridlines = minorGridlines;
		this.title = title;
		this.numFmt = numFmt;
		this.majorTickMark = majorTickMark;
		this.minorTickMark = minorTickMark;
		this.tickLblPos = tickLblPos;
		this.spPr = spPr;
		this.txPr = txPr;
		this.crossAx = crossAx;
		this.crossesOrCrossesAt = crossesOrCrossesAt;
		this.auto = auto;
		this.lblAlgn = lblAlgn;
		this.lblOffset = lblOffset;
		this.tickLblSkip = tickLblSkip;
		this.tickMarkSkip = tickMarkSkip;
		this.noMultiLvlLbl = noMultiLvlLbl;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getAxId() {
		return this.axId;
	}
	public CTScalingModel getScaling() {
		return this.scaling;
	}
	public CTBooleanModel getDelete() {
		return this.delete;
	}
	public CTAxPosModel getAxPos() {
		return this.axPos;
	}
	public CTChartLinesModel getMajorGridlines() {
		return this.majorGridlines;
	}
	public CTChartLinesModel getMinorGridlines() {
		return this.minorGridlines;
	}
	public CTTitleModel getTitle() {
		return this.title;
	}
	public CTNumFmtModel getNumFmt() {
		return this.numFmt;
	}
	public CTTickMarkModel getMajorTickMark() {
		return this.majorTickMark;
	}
	public CTTickMarkModel getMinorTickMark() {
		return this.minorTickMark;
	}
	public CTTickLblPosModel getTickLblPos() {
		return this.tickLblPos;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTextBodyModel getTxPr() {
		return this.txPr;
	}
	public CTUnsignedIntModel getCrossAx() {
		return this.crossAx;
	}
	public CrossesOrCrossesAtModel getCrossesOrCrossesAt() {
		return this.crossesOrCrossesAt;
	}
	public CTBooleanModel getAuto() {
		return this.auto;
	}
	public CTLblAlgnModel getLblAlgn() {
		return this.lblAlgn;
	}
	public CTLblOffsetModel getLblOffset() {
		return this.lblOffset;
	}
	public CTSkipModel getTickLblSkip() {
		return this.tickLblSkip;
	}
	public CTSkipModel getTickMarkSkip() {
		return this.tickMarkSkip;
	}
	public CTBooleanModel getNoMultiLvlLbl() {
		return this.noMultiLvlLbl;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
