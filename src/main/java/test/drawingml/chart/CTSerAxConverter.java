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
import test.drawingml.chart.CTSerAxModel.CrossesOrCrossesAtModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.chart.CTSerAxModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTSerAxConverter
{
	
	// CHOICE CONVERTER
	public static class CrossesOrCrossesAtConverter
	{
		
		private CrossesOrCrossesAtConverter() {
			// empty
		}
		
		public static CrossesOrCrossesAtModel fromDocx4j(CrossesOrCrossesAt value)
		{
			if (value.getCrosses() != null) return CrossesOrCrossesAtModel.createCrosses(
			CTCrossesConverter.fromDocx4j(value.getCrosses())
			);
			if (value.getCrossesAt() != null) return CrossesOrCrossesAtModel.createCrossesAt(
			CTDoubleConverter.fromDocx4j(value.getCrossesAt())
			);
			
			return new CrossesOrCrossesAtModel();
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
