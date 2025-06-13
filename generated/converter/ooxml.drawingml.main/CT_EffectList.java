


public class CT_EffectListModel {


    private final CT_BlurEffectModel blur;
    private final CT_FillOverlayEffectModel fillOverlay;
    private final CT_GlowEffectModel glow;
    private final CT_InnerShadowEffectModel innerShdw;
    private final CT_OuterShadowEffectModel outerShdw;
    private final CT_PresetShadowEffectModel prstShdw;
    private final CT_ReflectionEffectModel reflection;
    private final CT_SoftEdgesEffectModel softEdge;

    public CT_EffectListModel(CT_BlurEffectModel blur , CT_FillOverlayEffectModel fillOverlay , CT_GlowEffectModel glow , CT_InnerShadowEffectModel innerShdw , CT_OuterShadowEffectModel outerShdw , CT_PresetShadowEffectModel prstShdw , CT_ReflectionEffectModel reflection , CT_SoftEdgesEffectModel softEdge ) {
        this.blur = blur;
        this.fillOverlay = fillOverlay;
        this.glow = glow;
        this.innerShdw = innerShdw;
        this.outerShdw = outerShdw;
        this.prstShdw = prstShdw;
        this.reflection = reflection;
        this.softEdge = softEdge;
    }

    public CT_BlurEffectModel getBlur() {
        return this.blur;
    }
    public CT_FillOverlayEffectModel getFillOverlay() {
        return this.fillOverlay;
    }
    public CT_GlowEffectModel getGlow() {
        return this.glow;
    }
    public CT_InnerShadowEffectModel getInnerShdw() {
        return this.innerShdw;
    }
    public CT_OuterShadowEffectModel getOuterShdw() {
        return this.outerShdw;
    }
    public CT_PresetShadowEffectModel getPrstShdw() {
        return this.prstShdw;
    }
    public CT_ReflectionEffectModel getReflection() {
        return this.reflection;
    }
    public CT_SoftEdgesEffectModel getSoftEdge() {
        return this.softEdge;
    }
}