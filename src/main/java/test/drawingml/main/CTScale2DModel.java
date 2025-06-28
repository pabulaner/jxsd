package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTScale2DModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTScale2DModel
{
	
	private final CTRatioModel sx;
	private final CTRatioModel sy;
	
	public CTScale2DModel(CTRatioModel sx, CTRatioModel sy) {
		this.sx = sx;
		this.sy = sy;
	}
	
	public CTRatioModel getSx() {
		return this.sx;
	}
	public CTRatioModel getSy() {
		return this.sy;
	}
}
