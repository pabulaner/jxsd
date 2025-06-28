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
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTBlurEffectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBlurEffectModel
{
	
	private final STPositiveCoordinateModel rad;
	private final BooleanModel grow;
	
	public CTBlurEffectModel(STPositiveCoordinateModel rad, BooleanModel grow) {
		this.rad = rad;
		this.grow = grow;
	}
	
	public STPositiveCoordinateModel getRad() {
		return this.rad;
	}
	public BooleanModel getGrow() {
		return this.grow;
	}
}
