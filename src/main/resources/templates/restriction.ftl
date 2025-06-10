public class ${name} extends ${parent} {

    public ${name}(${type} value) {
        super(value);

        <#list conditions as condition>
        if (!(${condition})) throw new IllegalArgumentException();
        </#list>
    }
}