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
import test.drawingml.main.CTBlendEffectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBlendEffectModel
{
	
	private final STBlendModeModel blend;
	private final CTEffectContainerModel cont;
	
	public CTBlendEffectModel(STBlendModeModel blend, CTEffectContainerModel cont) {
		this.blend = blend;
		this.cont = cont;
	}
	
	public STBlendModeModel getBlend() {
		return this.blend;
	}
	public CTEffectContainerModel getCont() {
		return this.cont;
	}
}
