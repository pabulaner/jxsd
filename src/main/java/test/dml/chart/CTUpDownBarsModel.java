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
import test.dml.chart.CTUpDownBarsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTUpDownBarsModel
{
	
	private final CTGapAmountModel gapWidth;
	private final CTUpDownBarModel upBars;
	private final CTUpDownBarModel downBars;
	private final CTExtensionListModel extLst;
	
	public CTUpDownBarsModel(CTGapAmountModel gapWidth, CTUpDownBarModel upBars, CTUpDownBarModel downBars, CTExtensionListModel extLst) {
		this.gapWidth = gapWidth;
		this.upBars = upBars;
		this.downBars = downBars;
		this.extLst = extLst;
	}
	
	public CTGapAmountModel getGapWidth() {
		return this.gapWidth;
	}
	public CTUpDownBarModel getUpBars() {
		return this.upBars;
	}
	public CTUpDownBarModel getDownBars() {
		return this.downBars;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
