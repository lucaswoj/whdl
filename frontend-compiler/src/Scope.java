package org.whdl.frontend;

class Scope {
  Map<NamespaceIdentifier, Namespace> namespaces;
  Map<VariableIdentifier, Variable> variables;

  void addVariable(VariableIdentifier, Variable);
  void addNamespace(NamespaceIdentifier, Namespace);

  Map<VariableIdentifier, Variable> getVariables() {
    return java.util.Collections.unmodifiableMap(variables)
  }

  Variable getVariable(VariableIdentifier identifier) {
    return variables.get(identifier);
  }
}