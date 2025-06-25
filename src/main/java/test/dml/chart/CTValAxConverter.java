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
import test.dml.chart.CTValAxModel.CrossesOrCrossesAtModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTValAxModel.*;
import test.officeDocument.relationships.*;

public class CTValAxConverter
{
	
	public static class CrossesOrCrossesAtConverter
	{
		
		private CTValAxConverter() {
			// empty
		}
		
		public static CTValAxModel fromDocx4j(CTValAx value)
		{
			return new CrossesOrCrossesAtModel(
			CTCrossesConverter.fromDocx4j(value.getCrosses())
			,
			CTDoubleConverter.fromDocx4j(value.getCrossesAt())
			
			);
		}
	}
	private CTValAxConverter() {
		// empty
	}
	
	public static CTValAxModel fromDocx4j(CTValAx value)
	{
		return new CTValAxModel(
		CTUnsignedIntConverter.fromDocx4j(value.getAxId())
		,
		CTScalingConverter.fromDocx4j(value.getScaling())
		,
		CTBooleanConverter.fromDocx4j(value.getDelete())
		,
		CTAxPosConverter.fromDocx4j(value.getAxPos())
		,
		CTChartLinesConverter.fromDocx4j(value.getMajorGridlines())
		,
		CTChartLinesConverter.fromDocx4j(value.getMinorGridlines())
		,
		CTTitleConverter.fromDocx4j(value.getTitle())
		,
		CTNumFmtConverter.fromDocx4j(value.getNumFmt())
		,
		CTTickMarkConverter.fromDocx4j(value.getMajorTickMark())
		,
		CTTickMarkConverter.fromDocx4j(value.getMinorTickMark())
		,
		CTTickLblPosConverter.fromDocx4j(value.getTickLblPos())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTUnsignedIntConverter.fromDocx4j(value.getCrossAx())
		,
		CrossesOrCrossesAtConverter.fromDocx4j(value.getCrossesOrCrossesAt())
		,
		CTCrossBetweenConverter.fromDocx4j(value.getCrossBetween())
		,
		CTAxisUnitConverter.fromDocx4j(value.getMajorUnit())
		,
		CTAxisUnitConverter.fromDocx4j(value.getMinorUnit())
		,
		CTDispUnitsConverter.fromDocx4j(value.getDispUnits())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
