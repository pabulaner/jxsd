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
import test.dml.CTEffectListModel.*;
import test.officeDocument.relationships.*;

public class CTEffectListModel
{
	
	private final CTBlurEffectModel blur;
	private final CTFillOverlayEffectModel fillOverlay;
	private final CTGlowEffectModel glow;
	private final CTInnerShadowEffectModel innerShdw;
	private final CTOuterShadowEffectModel outerShdw;
	private final CTPresetShadowEffectModel prstShdw;
	private final CTReflectionEffectModel reflection;
	private final CTSoftEdgesEffectModel softEdge;
	
	public CTEffectListModel(CTBlurEffectModel blur, CTFillOverlayEffectModel fillOverlay, CTGlowEffectModel glow, CTInnerShadowEffectModel innerShdw, CTOuterShadowEffectModel outerShdw, CTPresetShadowEffectModel prstShdw, CTReflectionEffectModel reflection, CTSoftEdgesEffectModel softEdge) {
		this.blur = blur;
		this.fillOverlay = fillOverlay;
		this.glow = glow;
		this.innerShdw = innerShdw;
		this.outerShdw = outerShdw;
		this.prstShdw = prstShdw;
		this.reflection = reflection;
		this.softEdge = softEdge;
	}
	
	public CTBlurEffectModel getBlur() {
		return this.blur;
	}
	public CTFillOverlayEffectModel getFillOverlay() {
		return this.fillOverlay;
	}
	public CTGlowEffectModel getGlow() {
		return this.glow;
	}
	public CTInnerShadowEffectModel getInnerShdw() {
		return this.innerShdw;
	}
	public CTOuterShadowEffectModel getOuterShdw() {
		return this.outerShdw;
	}
	public CTPresetShadowEffectModel getPrstShdw() {
		return this.prstShdw;
	}
	public CTReflectionEffectModel getReflection() {
		return this.reflection;
	}
	public CTSoftEdgesEffectModel getSoftEdge() {
		return this.softEdge;
	}
}
