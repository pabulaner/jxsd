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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTLuminanceEffectModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTLuminanceEffectModel
{
	
	private final STFixedPercentageModel contrast;
	private final STFixedPercentageModel bright;
	
	public CTLuminanceEffectModel(STFixedPercentageModel contrast, STFixedPercentageModel bright) {
		this.contrast = contrast;
		this.bright = bright;
	}
	
	public STFixedPercentageModel getContrast() {
		return this.contrast;
	}
	public STFixedPercentageModel getBright() {
		return this.bright;
	}
}
