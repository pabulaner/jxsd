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
import test.drawingml.chart.CTManualLayoutModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTManualLayoutConverter
{
	
	private CTManualLayoutConverter() {
		// empty
	}
	
	public static CTManualLayoutModel fromDocx4j(CTManualLayout value)
	{
		return new CTManualLayoutModel(
		CTLayoutTargetConverter.fromDocx4j(value.getLayoutTarget())
		,
		CTLayoutModeConverter.fromDocx4j(value.getXMode())
		,
		CTLayoutModeConverter.fromDocx4j(value.getYMode())
		,
		CTLayoutModeConverter.fromDocx4j(value.getWMode())
		,
		CTLayoutModeConverter.fromDocx4j(value.getHMode())
		,
		CTDoubleConverter.fromDocx4j(value.getX())
		,
		CTDoubleConverter.fromDocx4j(value.getY())
		,
		CTDoubleConverter.fromDocx4j(value.getW())
		,
		CTDoubleConverter.fromDocx4j(value.getH())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
