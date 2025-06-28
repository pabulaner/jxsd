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
import test.drawingml.chart.CTDLblsModel.DeleteOrNumFmtModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chart.CTDLblsModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTDLblsConverter
{
	
	// CHOICE CONVERTER
	public static class DeleteOrNumFmtConverter
	{
		
		private DeleteOrNumFmtConverter() {
			// empty
		}
		
		public static DeleteOrNumFmtModel fromDocx4j(DeleteOrNumFmt value)
		{
			if (value.getDelete() != null) return DeleteOrNumFmtModel.createDelete(
			CTBooleanConverter.fromDocx4j(value.getDelete())
			);
			if (value.getNumFmt() != null) return DeleteOrNumFmtModel.createNumFmt(
			CTNumFmtConverter.fromDocx4j(value.getNumFmt())
			);
			if (value.getSpPr() != null) return DeleteOrNumFmtModel.createSpPr(
			CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
			);
			if (value.getTxPr() != null) return DeleteOrNumFmtModel.createTxPr(
			CTTextBodyConverter.fromDocx4j(value.getTxPr())
			);
			if (value.getDLblPos() != null) return DeleteOrNumFmtModel.createDLblPos(
			CTDLblPosConverter.fromDocx4j(value.getDLblPos())
			);
			if (value.getShowLegendKey() != null) return DeleteOrNumFmtModel.createShowLegendKey(
			CTBooleanConverter.fromDocx4j(value.getShowLegendKey())
			);
			if (value.getShowVal() != null) return DeleteOrNumFmtModel.createShowVal(
			CTBooleanConverter.fromDocx4j(value.getShowVal())
			);
			if (value.getShowCatName() != null) return DeleteOrNumFmtModel.createShowCatName(
			CTBooleanConverter.fromDocx4j(value.getShowCatName())
			);
			if (value.getShowSerName() != null) return DeleteOrNumFmtModel.createShowSerName(
			CTBooleanConverter.fromDocx4j(value.getShowSerName())
			);
			if (value.getShowPercent() != null) return DeleteOrNumFmtModel.createShowPercent(
			CTBooleanConverter.fromDocx4j(value.getShowPercent())
			);
			if (value.getShowBubbleSize() != null) return DeleteOrNumFmtModel.createShowBubbleSize(
			CTBooleanConverter.fromDocx4j(value.getShowBubbleSize())
			);
			if (value.getSeparator() != null) return DeleteOrNumFmtModel.createSeparator(
			StringConverter.fromDocx4j(value.getSeparator())
			);
			if (value.getShowLeaderLines() != null) return DeleteOrNumFmtModel.createShowLeaderLines(
			CTBooleanConverter.fromDocx4j(value.getShowLeaderLines())
			);
			if (value.getLeaderLines() != null) return DeleteOrNumFmtModel.createLeaderLines(
			CTChartLinesConverter.fromDocx4j(value.getLeaderLines())
			);
			
			return new DeleteOrNumFmtModel();
		}
	}
	private CTDLblsConverter() {
		// empty
	}
	
	public static CTDLblsModel fromDocx4j(CTDLbls value)
	{
		return new CTDLblsModel(
		value.getDLbl().stream().map(CTDLblConverter::fromDocx4j).collect(Collectors.toList())
		,
		DeleteOrNumFmtConverter.fromDocx4j(value.getDeleteOrNumFmt())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
