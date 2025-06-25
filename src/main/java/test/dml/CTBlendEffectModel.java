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
import test.dml.CTBlendEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
