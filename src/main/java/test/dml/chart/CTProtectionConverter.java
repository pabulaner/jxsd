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
import test.dml.chart.CTProtectionModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTProtectionConverter
{
	
	private CTProtectionConverter() {
		// empty
	}
	
	public static CTProtectionModel fromDocx4j(CTProtection value)
	{
		return new CTProtectionModel(
		CTBooleanConverter.fromDocx4j(value.getChartObject())
		,
		CTBooleanConverter.fromDocx4j(value.getData())
		,
		CTBooleanConverter.fromDocx4j(value.getFormatting())
		,
		CTBooleanConverter.fromDocx4j(value.getSelection())
		,
		CTBooleanConverter.fromDocx4j(value.getUserInterface())
		
		);
	}
}
