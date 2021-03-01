package Cylvre.domain;

public class CompilationUnit {

    private final FileDeclaration fileDeclaration;

    public CompilationUnit(FileDeclaration fileDeclaration) {
        this.fileDeclaration = fileDeclaration;
    }

    public FileDeclaration getFileDeclaration() {
        return fileDeclaration;
    }

}
