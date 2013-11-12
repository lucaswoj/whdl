package org.whdl.frontend;

class Namespace {
  public static Namespace get(NamespaceIdentifier identifier) {
    throw new java.lang.UnsupportedOperationException();
  }

  private NamespaceIdentifier identifier;
  private Map<String, Namespace> childNamespaces;
  private Namespace parentNamespace;

  NamespaceIdentifier identifier;
  Scope scopePrivate;
  Scope scopePublic;

  Namespace(NamespaceIdentifier identifier) {
    this.identifier = identifier;
  }

  NamespaceIdentifier getIdentifier() {
    return identifier;
  }

  public Scope getScopePrivate() {
    throw new java.lang.UnsupportedOperationException();
  }

  public Scope getScopePublic() {
    throw new java.lang.UnsupportedOperationException();
  }

  Value get(VariableIdentifier variableIdentifier) {
    throw new java.lang.UnsupportedOperationException();
  }

  Value getChildNamespaces(String name) {
    return childNamespaces.get(name);
  }

  Value getParentNamespace() {
    return parentNamespace;
  }

  // Get all files in this namespace
  private Set<File> getFiles() {
    throw new java.lang.UnsupportedOperationException();
  }
}