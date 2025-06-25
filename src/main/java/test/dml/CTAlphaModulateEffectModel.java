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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTAlphaModulateEffectModel.*;
import test.officeDocument.relationships.*;

public class CTAlphaModulateEffectModel
{
	
	private final CTEffectContainerModel cont;
	
	public CTAlphaModulateEffectModel(CTEffectContainerModel cont) {
		this.cont = cont;
	}
	
	public CTEffectContainerModel getCont() {
		return this.cont;
	}
}
