public class ${name} {

    private final Object value;

    public ${name}(Object value) {
        boolean valid = false;

        <#list types as type>
        valid |= ${type}.class.isInstance(value);
        </#list>

        if (!valid) throw new IllegalArgumentException();
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    <#list types as type>
    public ${type} get${type}() {
        return (${type}) this.value;
    }
    </#list>
}