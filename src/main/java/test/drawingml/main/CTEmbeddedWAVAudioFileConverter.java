package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTEmbeddedWAVAudioFileModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTEmbeddedWAVAudioFileConverter
{
	
	private CTEmbeddedWAVAudioFileConverter() {
		// empty
	}
	
	public static CTEmbeddedWAVAudioFileModel fromDocx4j(CTEmbeddedWAVAudioFile value)
	{
		return new CTEmbeddedWAVAudioFileModel(
		STRelationshipIdConverter.fromDocx4j(value.getEmbed())
		,
		BooleanConverter.fromDocx4j(value.getBuiltIn())
		,
		StringConverter.fromDocx4j(value.getName())
		
		);
	}
}
