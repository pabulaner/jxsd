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
import test.dml.chart.CTChartSpaceModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTChartSpaceModel
{
	
	private final CTBooleanModel date1904;
	private final CTTextLanguageIDModel lang;
	private final CTBooleanModel roundedCorners;
	private final CTStyleModel style;
	private final CTColorMappingModel clrMapOvr;
	private final CTPivotSourceModel pivotSource;
	private final CTProtectionModel protection;
	private final CTChartModel chart;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	private final CTExternalDataModel externalData;
	private final CTPrintSettingsModel printSettings;
	private final CTRelIdModel userShapes;
	private final CTExtensionListModel extLst;
	
	public CTChartSpaceModel(CTBooleanModel date1904, CTTextLanguageIDModel lang, CTBooleanModel roundedCorners, CTStyleModel style, CTColorMappingModel clrMapOvr, CTPivotSourceModel pivotSource, CTProtectionModel protection, CTChartModel chart, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExternalDataModel externalData, CTPrintSettingsModel printSettings, CTRelIdModel userShapes, CTExtensionListModel extLst) {
		this.date1904 = date1904;
		this.lang = lang;
		this.roundedCorners = roundedCorners;
		this.style = style;
		this.clrMapOvr = clrMapOvr;
		this.pivotSource = pivotSource;
		this.protection = protection;
		this.chart = chart;
		this.spPr = spPr;
		this.txPr = txPr;
		this.externalData = externalData;
		this.printSettings = printSettings;
		this.userShapes = userShapes;
		this.extLst = extLst;
	}
	
	public CTBooleanModel getDate1904() {
		return this.date1904;
	}
	public CTTextLanguageIDModel getLang() {
		return this.lang;
	}
	public CTBooleanModel getRoundedCorners() {
		return this.roundedCorners;
	}
	public CTStyleModel getStyle() {
		return this.style;
	}
	public CTColorMappingModel getClrMapOvr() {
		return this.clrMapOvr;
	}
	public CTPivotSourceModel getPivotSource() {
		return this.pivotSource;
	}
	public CTProtectionModel getProtection() {
		return this.protection;
	}
	public CTChartModel getChart() {
		return this.chart;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTextBodyModel getTxPr() {
		return this.txPr;
	}
	public CTExternalDataModel getExternalData() {
		return this.externalData;
	}
	public CTPrintSettingsModel getPrintSettings() {
		return this.printSettings;
	}
	public CTRelIdModel getUserShapes() {
		return this.userShapes;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
