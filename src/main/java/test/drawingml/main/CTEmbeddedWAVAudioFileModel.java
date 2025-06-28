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

// SEQUENCE MODEL
public class CTEmbeddedWAVAudioFileModel
{
	
	private final STRelationshipIdModel embed;
	private final BooleanModel builtIn;
	private final StringModel name;
	
	public CTEmbeddedWAVAudioFileModel(STRelationshipIdModel embed, BooleanModel builtIn, StringModel name) {
		this.embed = embed;
		this.builtIn = builtIn;
		this.name = name;
	}
	
	public STRelationshipIdModel getEmbed() {
		return this.embed;
	}
	public BooleanModel getBuiltIn() {
		return this.builtIn;
	}
	public StringModel getName() {
		return this.name;
	}
}
