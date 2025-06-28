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
import test.drawingml.chart.CTView3DModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTView3DConverter
{
	
	private CTView3DConverter() {
		// empty
	}
	
	public static CTView3DModel fromDocx4j(CTView3D value)
	{
		return new CTView3DModel(
		CTRotXConverter.fromDocx4j(value.getRotX())
		,
		CTHPercentConverter.fromDocx4j(value.getHPercent())
		,
		CTRotYConverter.fromDocx4j(value.getRotY())
		,
		CTDepthPercentConverter.fromDocx4j(value.getDepthPercent())
		,
		CTBooleanConverter.fromDocx4j(value.getRAngAx())
		,
		CTPerspectiveConverter.fromDocx4j(value.getPerspective())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
