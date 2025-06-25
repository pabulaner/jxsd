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
import test.dml.chart.CTDLblsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTDLblsModel.DeleteOrNumFmtModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDLblsConverter
{
	
	public static class DeleteOrNumFmtConverter
	{
		
		private CTDLblsConverter() {
			// empty
		}
		
		public static CTDLblsModel fromDocx4j(CTDLbls value)
		{
			return new DeleteOrNumFmtModel(
			CTBooleanConverter.fromDocx4j(value.getDelete())
			,
			CTNumFmtConverter.fromDocx4j(value.getNumFmt())
			,
			CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
			,
			CTTextBodyConverter.fromDocx4j(value.getTxPr())
			,
			CTDLblPosConverter.fromDocx4j(value.getDLblPos())
			,
			CTBooleanConverter.fromDocx4j(value.getShowLegendKey())
			,
			CTBooleanConverter.fromDocx4j(value.getShowVal())
			,
			CTBooleanConverter.fromDocx4j(value.getShowCatName())
			,
			CTBooleanConverter.fromDocx4j(value.getShowSerName())
			,
			CTBooleanConverter.fromDocx4j(value.getShowPercent())
			,
			CTBooleanConverter.fromDocx4j(value.getShowBubbleSize())
			,
			StringConverter.fromDocx4j(value.getSeparator())
			,
			CTBooleanConverter.fromDocx4j(value.getShowLeaderLines())
			,
			CTChartLinesConverter.fromDocx4j(value.getLeaderLines())
			
			);
		}
	}
	private CTDLblsConverter() {
		// empty
	}
	
	public static CTDLblsModel fromDocx4j(CTDLbls value)
	{
		return new CTDLblsModel(
		value.getDLbl().stream().map(CTDLblConverter::fromDocx4j).collect(Collectors.toList());
		,
		DeleteOrNumFmtConverter.fromDocx4j(value.getDeleteOrNumFmt())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
