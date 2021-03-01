package Cylvre.domain;

public class MetaData {
    private final String className;
    private final String superClassName;

    public MetaData(String className, String superClassName) {
        this.className = className;
        this.superClassName = superClassName;
    }

    public String getClassName() {
        return className;
    }

    public String getSuperClassName() {
        return superClassName;
    }
}
