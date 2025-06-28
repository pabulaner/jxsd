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
import test.drawingml.chart.CTLegendEntryModel.DeleteOrTxPrModel.*;
import test.drawingml.chart.CTLegendEntryModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTLegendEntryConverter
{
	
	// CHOICE CONVERTER
	public static class DeleteOrTxPrConverter
	{
		
		private DeleteOrTxPrConverter() {
			// empty
		}
		
		public static DeleteOrTxPrModel fromDocx4j(DeleteOrTxPr value)
		{
			if (value.getDelete() != null) return DeleteOrTxPrModel.createDelete(
			CTBooleanConverter.fromDocx4j(value.getDelete())
			);
			if (value.getTxPr() != null) return DeleteOrTxPrModel.createTxPr(
			CTTextBodyConverter.fromDocx4j(value.getTxPr())
			);
			
			return new DeleteOrTxPrModel();
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
