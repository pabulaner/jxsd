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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.chart.CTChartModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTChartConverter
{
	
	private CTChartConverter() {
		// empty
	}
	
	public static CTChartModel fromDocx4j(CTChart value)
	{
		return new CTChartModel(
		CTTitleConverter.fromDocx4j(value.getTitle())
		,
		CTBooleanConverter.fromDocx4j(value.getAutoTitleDeleted())
		,
		CTPivotFmtsConverter.fromDocx4j(value.getPivotFmts())
		,
		CTView3DConverter.fromDocx4j(value.getView3D())
		,
		CTSurfaceConverter.fromDocx4j(value.getFloor())
		,
		CTSurfaceConverter.fromDocx4j(value.getSideWall())
		,
		CTSurfaceConverter.fromDocx4j(value.getBackWall())
		,
		CTPlotAreaConverter.fromDocx4j(value.getPlotArea())
		,
		CTLegendConverter.fromDocx4j(value.getLegend())
		,
		CTBooleanConverter.fromDocx4j(value.getPlotVisOnly())
		,
		CTDispBlanksAsConverter.fromDocx4j(value.getDispBlanksAs())
		,
		CTBooleanConverter.fromDocx4j(value.getShowDLblsOverMax())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
