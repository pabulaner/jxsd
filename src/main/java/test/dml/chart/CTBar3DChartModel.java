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
import test.dml.chart.CTBar3DChartModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBar3DChartModel
{
	
	private final CTBarDirModel barDir;
	private final CTBarGroupingModel grouping;
	private final CTBooleanModel varyColors;
	private final List<CTBarSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTGapAmountModel gapWidth;
	private final CTGapAmountModel gapDepth;
	private final CTShapeModel shape;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTBar3DChartModel(CTBarDirModel barDir, CTBarGroupingModel grouping, CTBooleanModel varyColors, List<CTBarSerModel> ser, CTDLblsModel dLbls, CTGapAmountModel gapWidth, CTGapAmountModel gapDepth, CTShapeModel shape, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.barDir = barDir;
		this.grouping = grouping;
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.gapWidth = gapWidth;
		this.gapDepth = gapDepth;
		this.shape = shape;
		this.axId = axId;
		this.extLst = extLst;
	}
	
	public CTBarDirModel getBarDir() {
		return this.barDir;
	}
	public CTBarGroupingModel getGrouping() {
		return this.grouping;
	}
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTBarSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public CTGapAmountModel getGapWidth() {
		return this.gapWidth;
	}
	public CTGapAmountModel getGapDepth() {
		return this.gapDepth;
	}
	public CTShapeModel getShape() {
		return this.shape;
	}
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
