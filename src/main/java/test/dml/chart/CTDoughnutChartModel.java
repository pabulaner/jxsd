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
import test.dml.chart.CTDoughnutChartModel.*;
import test.officeDocument.relationships.*;

public class CTDoughnutChartModel
{
	
	private final CTBooleanModel varyColors;
	private final List<CTPieSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTFirstSliceAngModel firstSliceAng;
	private final CTHoleSizeModel holeSize;
	private final CTExtensionListModel extLst;
	
	public CTDoughnutChartModel(CTBooleanModel varyColors, List<CTPieSerModel> ser, CTDLblsModel dLbls, CTFirstSliceAngModel firstSliceAng, CTHoleSizeModel holeSize, CTExtensionListModel extLst) {
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.firstSliceAng = firstSliceAng;
		this.holeSize = holeSize;
		this.extLst = extLst;
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
	public CTFirstSliceAngModel getFirstSliceAng() {
		return this.firstSliceAng;
	}
	public CTHoleSizeModel getHoleSize() {
		return this.holeSize;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
