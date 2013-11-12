package org.whdl.frontend;

class File {

  public class NamespaceImport {
    Enum Type = {whitelist, blacklist};
    Type type;
    NamespaceIdentifier namespace;
    Set<VariableIdentifier, String> variables;
  }

  public class NamespaceExport {
    Map<VaribleIdentifier, String> variables;
  }

  private String filepath;
  private String source;
  private NamespaceIdentifier namespaceIdentifier;
  private Set<Statement> statements;
  private Scope scope;
  private NamespaceExport namespaceExports;
  private ArrayList<NamespaceImport> namespaceImports;

  public File(
    String filepath,
    String source,
    NamespaceIdentifier namespaceIdentifier,
    ArrayList<NamespaceImports> namespaceImports,
    NamespaceExport namespaceExport
  ) {
    this.filepath = filepath;
    this.source = source;
    this.namespaceIdentifier = namespaceIdentifier;
    this.namespaceExport = namespaceExport;
    this.namespaceImports = namespaceImports;
  }

  public String getFilepath() {
    return filepath;
  }

  public String getSource() {
    return source;
  }

  public NamespaceIdentifier getNamespaceIdentifier() {
    return namespaceIdentifier;
  }

  public Scope getScope() {
    return scope;
  }

  public Set<Statement> getStatements() {
    return Collections.unmodifiableSet(statements);
  }

  // Build the AST by adding statements from the parse tree
  public void addStatement(Statement) {
    throw new java.lang.UnsupportedOperationException();
  }

  // Produce an whdl intermediate program based on the "main" function in this file.
  public org.whdl.backend.Program compile() {
    verify();
    collapseCompliletimeKnowable();

    throw new java.lang.UnsupportedOperationException();
  }

  // Verify the AST, throwing exceptions for any errors.
  private void verify() {
    throw new java.lang.UnsupportedOperationException();
  }

  // Evaluate and collapse compiletime-knowable logic in the AST
  private Expression collapseCompliletimeKnowable() {
    throw new java.lang.UnsupportedOperationException();
  }
}