package test.dml;

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
import test.dml.CTHyperlinkModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTHyperlinkConverter
{
	
	private CTHyperlinkConverter() {
		// empty
	}
	
	public static CTHyperlinkModel fromDocx4j(CTHyperlink value)
	{
		return new CTHyperlinkModel(
		StringConverter.fromDocx4j(value.getInvalidUrl())
		,
		StringConverter.fromDocx4j(value.getTgtFrame())
		,
		STRelationshipIdConverter.fromDocx4j(value.getId())
		,
		BooleanConverter.fromDocx4j(value.getHistory())
		,
		StringConverter.fromDocx4j(value.getTooltip())
		,
		BooleanConverter.fromDocx4j(value.getHighlightClick())
		,
		StringConverter.fromDocx4j(value.getAction())
		,
		BooleanConverter.fromDocx4j(value.getEndSnd())
		,
		CTEmbeddedWAVAudioFileConverter.fromDocx4j(value.getSnd())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
