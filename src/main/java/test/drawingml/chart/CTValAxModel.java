package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.chart.CTValAxModel.CrossesOrCrossesAtModel.*;
import test.drawingml.chart.CTValAxModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTValAxModel
{
	
	// CHOICE MODEL
	public static class CrossesOrCrossesAtModel
	{
		
		private final int type;
		
		private final Object value;
		
		public CrossesOrCrossesAtModel() {
			this(-1, null);
		}
		
		private CrossesOrCrossesAtModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static CrossesOrCrossesAtModel createCrosses(CTCrossesModel value) {
			return new CrossesOrCrossesAtModel(0, value);
		}
		public static CrossesOrCrossesAtModel createCrossesAt(CTDoubleModel value) {
			return new CrossesOrCrossesAtModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isCrosses() {
			return this.type == 0;
		}
		
		public CTCrossesModel getCrosses() {
			if (this.type != 0) throw new ClassCastException();
			return (CTCrossesModel) value;
		}
		public boolean isCrossesAt() {
			return this.type == 1;
		}
		
		public CTDoubleModel getCrossesAt() {
			if (this.type != 1) throw new ClassCastException();
			return (CTDoubleModel) value;
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
	private final CTCrossBetweenModel crossBetween;
	private final CTAxisUnitModel majorUnit;
	private final CTAxisUnitModel minorUnit;
	private final CTDispUnitsModel dispUnits;
	private final CTExtensionListModel extLst;
	
	public CTValAxModel(CTUnsignedIntModel axId, CTScalingModel scaling, CTBooleanModel delete, CTAxPosModel axPos, CTChartLinesModel majorGridlines, CTChartLinesModel minorGridlines, CTTitleModel title, CTNumFmtModel numFmt, CTTickMarkModel majorTickMark, CTTickMarkModel minorTickMark, CTTickLblPosModel tickLblPos, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTUnsignedIntModel crossAx, CrossesOrCrossesAtModel crossesOrCrossesAt, CTCrossBetweenModel crossBetween, CTAxisUnitModel majorUnit, CTAxisUnitModel minorUnit, CTDispUnitsModel dispUnits, CTExtensionListModel extLst) {
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
		this.crossBetween = crossBetween;
		this.majorUnit = majorUnit;
		this.minorUnit = minorUnit;
		this.dispUnits = dispUnits;
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
	public CTCrossBetweenModel getCrossBetween() {
		return this.crossBetween;
	}
	public CTAxisUnitModel getMajorUnit() {
		return this.majorUnit;
	}
	public CTAxisUnitModel getMinorUnit() {
		return this.minorUnit;
	}
	public CTDispUnitsModel getDispUnits() {
		return this.dispUnits;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
