package org.whdl.frontend;

class org.whdl.frontend.Namespace {
  static Namespace getNamespace(NamespaceIdentifier);

  public NamespaceIdentifier getName();

  public NamespaceScope getPrivateScope();
  public NamespaceScope getPublicScope();

  private Set<File> getFiles();
}