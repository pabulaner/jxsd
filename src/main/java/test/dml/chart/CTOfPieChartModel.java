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
import test.dml.chart.CTOfPieChartModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTOfPieChartModel
{
	
	private final CTOfPieTypeModel ofPieType;
	private final CTBooleanModel varyColors;
	private final List<CTPieSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTGapAmountModel gapWidth;
	private final CTSplitTypeModel splitType;
	private final CTDoubleModel splitPos;
	private final CTCustSplitModel custSplit;
	private final CTSecondPieSizeModel secondPieSize;
	private final List<CTChartLinesModel> serLines;
	private final CTExtensionListModel extLst;
	
	public CTOfPieChartModel(CTOfPieTypeModel ofPieType, CTBooleanModel varyColors, List<CTPieSerModel> ser, CTDLblsModel dLbls, CTGapAmountModel gapWidth, CTSplitTypeModel splitType, CTDoubleModel splitPos, CTCustSplitModel custSplit, CTSecondPieSizeModel secondPieSize, List<CTChartLinesModel> serLines, CTExtensionListModel extLst) {
		this.ofPieType = ofPieType;
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.gapWidth = gapWidth;
		this.splitType = splitType;
		this.splitPos = splitPos;
		this.custSplit = custSplit;
		this.secondPieSize = secondPieSize;
		this.serLines = serLines;
		this.extLst = extLst;
	}
	
	public CTOfPieTypeModel getOfPieType() {
		return this.ofPieType;
	}
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTPieSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public CTGapAmountModel getGapWidth() {
		return this.gapWidth;
	}
	public CTSplitTypeModel getSplitType() {
		return this.splitType;
	}
	public CTDoubleModel getSplitPos() {
		return this.splitPos;
	}
	public CTCustSplitModel getCustSplit() {
		return this.custSplit;
	}
	public CTSecondPieSizeModel getSecondPieSize() {
		return this.secondPieSize;
	}
	public List<CTChartLinesModel> getSerLines() {
		return this.serLines;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
