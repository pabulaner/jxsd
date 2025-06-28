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
import test.drawingml.chart.CTDLblModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chart.CTDLblModel.DeleteOrLayoutModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTDLblConverter
{
	
	// CHOICE CONVERTER
	public static class DeleteOrLayoutConverter
	{
		
		private DeleteOrLayoutConverter() {
			// empty
		}
		
		public static DeleteOrLayoutModel fromDocx4j(DeleteOrLayout value)
		{
			if (value.getDelete() != null) return DeleteOrLayoutModel.createDelete(
			CTBooleanConverter.fromDocx4j(value.getDelete())
			);
			if (value.getLayout() != null) return DeleteOrLayoutModel.createLayout(
			CTLayoutConverter.fromDocx4j(value.getLayout())
			);
			// THIS IS A JAVA CHOICE
			if (value.getStrRef != null) return CTTxModel.createStrRef(
			CTStrRefConverter.fromDocx4j(value.getStrRef())
			);
			if (value.getRich != null) return CTTxModel.createRich(
			CTTextBodyConverter.fromDocx4j(value.getRich())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getNumFmt() != null) return DeleteOrLayoutModel.createNumFmt(
			CTNumFmtConverter.fromDocx4j(value.getNumFmt())
			);
			if (value.getSpPr() != null) return DeleteOrLayoutModel.createSpPr(
			CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
			);
			if (value.getTxPr() != null) return DeleteOrLayoutModel.createTxPr(
			CTTextBodyConverter.fromDocx4j(value.getTxPr())
			);
			if (value.getDLblPos() != null) return DeleteOrLayoutModel.createDLblPos(
			CTDLblPosConverter.fromDocx4j(value.getDLblPos())
			);
			if (value.getShowLegendKey() != null) return DeleteOrLayoutModel.createShowLegendKey(
			CTBooleanConverter.fromDocx4j(value.getShowLegendKey())
			);
			if (value.getShowVal() != null) return DeleteOrLayoutModel.createShowVal(
			CTBooleanConverter.fromDocx4j(value.getShowVal())
			);
			if (value.getShowCatName() != null) return DeleteOrLayoutModel.createShowCatName(
			CTBooleanConverter.fromDocx4j(value.getShowCatName())
			);
			if (value.getShowSerName() != null) return DeleteOrLayoutModel.createShowSerName(
			CTBooleanConverter.fromDocx4j(value.getShowSerName())
			);
			if (value.getShowPercent() != null) return DeleteOrLayoutModel.createShowPercent(
			CTBooleanConverter.fromDocx4j(value.getShowPercent())
			);
			if (value.getShowBubbleSize() != null) return DeleteOrLayoutModel.createShowBubbleSize(
			CTBooleanConverter.fromDocx4j(value.getShowBubbleSize())
			);
			if (value.getSeparator() != null) return DeleteOrLayoutModel.createSeparator(
			StringConverter.fromDocx4j(value.getSeparator())
			);
			
			return new DeleteOrLayoutModel();
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
