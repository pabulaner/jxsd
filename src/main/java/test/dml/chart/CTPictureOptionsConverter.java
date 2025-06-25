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
import test.dml.chart.CTPictureOptionsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPictureOptionsConverter
{
	
	private CTPictureOptionsConverter() {
		// empty
	}
	
	public static CTPictureOptionsModel fromDocx4j(CTPictureOptions value)
	{
		return new CTPictureOptionsModel(
		CTBooleanConverter.fromDocx4j(value.getApplyToFront())
		,
		CTBooleanConverter.fromDocx4j(value.getApplyToSides())
		,
		CTBooleanConverter.fromDocx4j(value.getApplyToEnd())
		,
		CTPictureFormatConverter.fromDocx4j(value.getPictureFormat())
		,
		CTPictureStackUnitConverter.fromDocx4j(value.getPictureStackUnit())
		
		);
	}
}
