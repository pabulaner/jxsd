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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTLegendEntryModel.*;
import test.dml.chart.CTLegendEntryModel.DeleteOrTxPrModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTLegendEntryConverter
{
	
	public static class DeleteOrTxPrConverter
	{
		
		private CTLegendEntryConverter() {
			// empty
		}
		
		public static CTLegendEntryModel fromDocx4j(CTLegendEntry value)
		{
			return new DeleteOrTxPrModel(
			CTBooleanConverter.fromDocx4j(value.getDelete())
			,
			CTTextBodyConverter.fromDocx4j(value.getTxPr())
			
			);
		}
	}
	private CTLegendEntryConverter() {
		// empty
	}
	
	public static CTLegendEntryModel fromDocx4j(CTLegendEntry value)
	{
		return new CTLegendEntryModel(
		CTUnsignedIntConverter.fromDocx4j(value.getIdx())
		,
		DeleteOrTxPrConverter.fromDocx4j(value.getDeleteOrTxPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
