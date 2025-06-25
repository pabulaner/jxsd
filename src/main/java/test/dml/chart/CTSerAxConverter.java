package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTSerAxModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTSerAxModel.CrossesOrCrossesAtModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSerAxConverter
{
	
	public static class CrossesOrCrossesAtConverter
	{
		
		private CTSerAxConverter() {
			// empty
		}
		
		public static CTSerAxModel fromDocx4j(CTSerAx value)
		{
			return new CrossesOrCrossesAtModel(
			CTCrossesConverter.fromDocx4j(value.getCrosses())
			,
			CTDoubleConverter.fromDocx4j(value.getCrossesAt())
			
			);
		}
	}
	private CTSerAxConverter() {
		// empty
	}
	
	public static CTSerAxModel fromDocx4j(CTSerAx value)
	{
		return new CTSerAxModel(
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
		CTSkipConverter.fromDocx4j(value.getTickLblSkip())
		,
		CTSkipConverter.fromDocx4j(value.getTickMarkSkip())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
