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
import test.dml.chart.CTDLblModel.*;
import test.dml.chart.CTDLblModel.DeleteOrLayoutModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDLblConverter
{
	
	public static class DeleteOrLayoutConverter
	{
		
		private CTDLblConverter() {
			// empty
		}
		
		public static CTDLblModel fromDocx4j(CTDLbl value)
		{
			return new DeleteOrLayoutModel(
			CTBooleanConverter.fromDocx4j(value.getDelete())
			,
			CTLayoutConverter.fromDocx4j(value.getLayout())
			,
			CTTxConverter.fromDocx4j(value.getTx())
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
			
			);
		}
	}
	private CTDLblConverter() {
		// empty
	}
	
	public static CTDLblModel fromDocx4j(CTDLbl value)
	{
		return new CTDLblModel(
		CTUnsignedIntConverter.fromDocx4j(value.getIdx())
		,
		DeleteOrLayoutConverter.fromDocx4j(value.getDeleteOrLayout())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
