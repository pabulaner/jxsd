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
import test.dml.chart.CTChartModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTChartModel
{
	
	private final CTTitleModel title;
	private final CTBooleanModel autoTitleDeleted;
	private final CTPivotFmtsModel pivotFmts;
	private final CTView3DModel view3D;
	private final CTSurfaceModel floor;
	private final CTSurfaceModel sideWall;
	private final CTSurfaceModel backWall;
	private final CTPlotAreaModel plotArea;
	private final CTLegendModel legend;
	private final CTBooleanModel plotVisOnly;
	private final CTDispBlanksAsModel dispBlanksAs;
	private final CTBooleanModel showDLblsOverMax;
	private final CTExtensionListModel extLst;
	
	public CTChartModel(CTTitleModel title, CTBooleanModel autoTitleDeleted, CTPivotFmtsModel pivotFmts, CTView3DModel view3D, CTSurfaceModel floor, CTSurfaceModel sideWall, CTSurfaceModel backWall, CTPlotAreaModel plotArea, CTLegendModel legend, CTBooleanModel plotVisOnly, CTDispBlanksAsModel dispBlanksAs, CTBooleanModel showDLblsOverMax, CTExtensionListModel extLst) {
		this.title = title;
		this.autoTitleDeleted = autoTitleDeleted;
		this.pivotFmts = pivotFmts;
		this.view3D = view3D;
		this.floor = floor;
		this.sideWall = sideWall;
		this.backWall = backWall;
		this.plotArea = plotArea;
		this.legend = legend;
		this.plotVisOnly = plotVisOnly;
		this.dispBlanksAs = dispBlanksAs;
		this.showDLblsOverMax = showDLblsOverMax;
		this.extLst = extLst;
	}
	
	public CTTitleModel getTitle() {
		return this.title;
	}
	public CTBooleanModel getAutoTitleDeleted() {
		return this.autoTitleDeleted;
	}
	public CTPivotFmtsModel getPivotFmts() {
		return this.pivotFmts;
	}
	public CTView3DModel getView3D() {
		return this.view3D;
	}
	public CTSurfaceModel getFloor() {
		return this.floor;
	}
	public CTSurfaceModel getSideWall() {
		return this.sideWall;
	}
	public CTSurfaceModel getBackWall() {
		return this.backWall;
	}
	public CTPlotAreaModel getPlotArea() {
		return this.plotArea;
	}
	public CTLegendModel getLegend() {
		return this.legend;
	}
	public CTBooleanModel getPlotVisOnly() {
		return this.plotVisOnly;
	}
	public CTDispBlanksAsModel getDispBlanksAs() {
		return this.dispBlanksAs;
	}
	public CTBooleanModel getShowDLblsOverMax() {
		return this.showDLblsOverMax;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
