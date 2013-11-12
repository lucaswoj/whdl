package org.whdl.frontend;

class Scope {
  Map<NamespaceIdentifier, Namespace> namespaces;
  Map<VariableIdentifier, Value> variables;

  void addVariable(VariableIdentifier, Value);
  void addNamespace(NamespaceIdentifier, Namespace);

  Map<VariableIdentifier, Value> getVariables() {
    return java.util.Collections.unmodifiableMap(variables)
  }

  Value getVariable(VariableIdentifier identifier) {
    return variables.get(identifier);
  }
}